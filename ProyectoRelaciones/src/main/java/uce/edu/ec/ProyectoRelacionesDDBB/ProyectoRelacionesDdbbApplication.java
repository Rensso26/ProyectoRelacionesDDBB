package uce.edu.ec.ProyectoRelacionesDDBB;

import jakarta.transaction.Transactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "uce.edu.ec.ProyectoRelacionesDDBB.Entity")
@EnableJpaRepositories(basePackages = "uce.edu.ec.ProyectoRelacionesDDBB.repository")
public class ProyectoRelacionesDdbbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
	}

}
