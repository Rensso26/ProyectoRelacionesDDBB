package uce.edu.ec.ProyectoRelaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "uce.edu.ec.ProyectoRelaciones.Entity")
@EnableJpaRepositories(basePackages = "uce.edu.ec.ProyectoRelaciones.Entity")

public class ProyectoRelacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesApplication.class, args);
	}

}
