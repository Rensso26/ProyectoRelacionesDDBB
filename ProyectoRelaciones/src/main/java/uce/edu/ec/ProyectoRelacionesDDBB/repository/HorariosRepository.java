package uce.edu.ec.ProyectoRelacionesDDBB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uce.edu.ec.ProyectoRelacionesDDBB.Entity.Horarios;

@Repository
public interface HorariosRepository extends JpaRepository<Horarios, Long> {
}
