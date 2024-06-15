package uce.edu.ec.ProyectoRelaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import uce.edu.ec.ProyectoRelaciones.repositorys.*;
import uce.edu.ec.ProyectoRelaciones.services.CRUD;

import java.util.Scanner;

@SpringBootApplication
@EntityScan(basePackages = "uce.edu.ec.ProyectoRelaciones.Entity")
@EnableJpaRepositories(basePackages = "uce.edu.ec.ProyectoRelaciones.repositorys")
public class ProyectoRelacionesApplication implements CommandLineRunner {
	private final CRUD crudService;
	private final Examples examples;

	public ProyectoRelacionesApplication(CarreraRepository carreraRepository, EstudiantesRepository estudiantesRepository,
										 ProfesorRepository profesorRepository, MateriasRepository materiasRepository,
										 HorariosRepository horariosRepository) {
		this.crudService = new CRUD(carreraRepository, estudiantesRepository, profesorRepository, materiasRepository, horariosRepository);
		this.examples = new Examples(crudService);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		examples.runExamples();
	}
}


