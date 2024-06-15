package uce.edu.ec.ProyectoRelaciones.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.ProyectoRelaciones.Entity.*;
import uce.edu.ec.ProyectoRelaciones.repositorys.*;

import java.util.List;
import java.util.Optional;

@Service
public class CRUD {

    private final CarreraRepository carreraRepository;
    private final EstudiantesRepository estudiantesRepository;
    private final ProfesorRepository profesorRepository;
    private final MateriasRepository materiasRepository;
    private final HorariosRepository horariosRepository;

    public CRUD(CarreraRepository carreraRepository, EstudiantesRepository estudiantesRepository,
                ProfesorRepository profesorRepository, MateriasRepository materiasRepository,
                HorariosRepository horariosRepository) {
        this.carreraRepository = carreraRepository;
        this.estudiantesRepository = estudiantesRepository;
        this.profesorRepository = profesorRepository;
        this.materiasRepository = materiasRepository;
        this.horariosRepository = horariosRepository;
    }

    // CRUD de Carrera
    public Carrera createCarrera(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    public List<Carrera> getAllCarreras() {
        return carreraRepository.findAll();
    }

    public Optional<Carrera> getCarreraById(String id) {
        return carreraRepository.findById(id);
    }

    public Carrera updateCarrera(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    public void deleteCarrera(String id) {
        carreraRepository.deleteById(id);
    }

    // CRUD de Estudiantes
    public Estudiantes createEstudiantes(Estudiantes estudiantes) {
        return estudiantesRepository.save(estudiantes);
    }

    public List<Estudiantes> getAllEstudiantes() {
        return estudiantesRepository.findAll();
    }

    public Optional<Estudiantes> getEstudiantesById(Long id) {
        return estudiantesRepository.findById(id);
    }

    public Estudiantes updateEstudiantes(Estudiantes estudiantes) {
        return estudiantesRepository.save(estudiantes);
    }

    public void deleteEstudiantes(Long id) {
        estudiantesRepository.deleteById(id);
    }

    // CRUD de Profesor
    public Profesor createProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public List<Profesor> getAllProfesores() {
        return profesorRepository.findAll();
    }

    public Optional<Profesor> getProfesorById(Long id) {
        return profesorRepository.findById(id);
    }

    public Profesor updateProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public void deleteProfesor(Long id) {
        profesorRepository.deleteById(id);
    }

    // CRUD de Materias
    public Materias createMaterias(Materias materias) {
        return materiasRepository.save(materias);
    }

    public List<Materias> getAllMaterias() {
        return materiasRepository.findAll();
    }

    public Optional<Materias> getMateriasById(Long id) {
        return materiasRepository.findById(id);
    }

    public Materias updateMaterias(Materias materias) {
        return materiasRepository.save(materias);
    }

    public void deleteMaterias(Long id) {
        materiasRepository.deleteById(id);
    }

    // CRUD de Horarios
    public Horarios createHorarios(Horarios horarios) {
        return horariosRepository.save(horarios);
    }

    public List<Horarios> getAllHorarios() {
        return horariosRepository.findAll();
    }

    public Optional<Horarios> getHorariosById(Long id) {
        return horariosRepository.findById(id);
    }

    public Horarios updateHorarios(Horarios horarios) {
        return horariosRepository.save(horarios);
    }

    public void deleteHorarios(Long id) {
        horariosRepository.deleteById(id);
    }
}


