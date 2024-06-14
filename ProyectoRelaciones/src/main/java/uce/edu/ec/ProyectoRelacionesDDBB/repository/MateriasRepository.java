package uce.edu.ec.ProyectoRelacionesDDBB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.ProyectoRelacionesDDBB.Entity.Materias;

public interface MateriasRepository extends JpaRepository <Materias, String> {
}
