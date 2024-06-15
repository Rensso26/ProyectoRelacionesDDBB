package uce.edu.ec.ProyectoRelaciones.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.ProyectoRelaciones.Entity.Estudiantes;

public interface EstudiantesRepository extends JpaRepository<Estudiantes, Long> {
}
