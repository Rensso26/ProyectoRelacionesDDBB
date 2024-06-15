package uce.edu.ec.ProyectoRelaciones.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.ProyectoRelaciones.Entity.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
