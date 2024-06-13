package uce.edu.ec.ProyectoRelacionesDDBB;

import jakarta.transaction.Transactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "uce.edu.ec.ProyectoRelacionesDDBB.Entity")
public class ProyectoRelacionesDdbbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
	}

}
