package uce.edu.ec.ProyectoRelaciones.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.ProyectoRelaciones.Entity.Carrera;

public interface CarreraRepository extends JpaRepository<Carrera, String> {
}
