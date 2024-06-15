package uce.edu.ec.ProyectoRelaciones;

import org.springframework.beans.factory.annotation.Autowired;
import uce.edu.ec.ProyectoRelaciones.Entity.*;
import uce.edu.ec.ProyectoRelaciones.services.CRUD;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examples {

    private final CRUD crudService;

    public Examples(CRUD crudService) {
        this.crudService = crudService;
    }

    public void runExamples() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear ejemplo OneToOne");
            System.out.println("2. Crear ejemplo OneToMany");
            System.out.println("3. Crear ejemplo ManyToMany");
            System.out.println("4. Crear ejemplo ManyToOne");
            System.out.println("0. Salir");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    createOneToOneExample();
                    break;
                case 2:
                    createOneToManyExample();
                    break;
                case 3:
                    createManyToManyExample();
                    break;
                case 4:
                    createManyToOneExample();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void createOneToOneExample() {
        System.out.println("Creando ejemplo OneToOne...");

        Materias materia = new Materias();
        materia.setName("Matemáticas");
        materia.setLvl(1);
        crudService.createMaterias(materia);

        Horarios horario = new Horarios();
        horario.setHora_inic(Time.valueOf("08:00:00"));
        horario.setDay("Lunes");
        horario.setDuracion(2.0);
        horario.setMaterias(materia);
        crudService.createHorarios(horario);

        materia.setHorario(horario);
        crudService.updateMaterias(materia);

        System.out.println("Ejemplo OneToOne creado con éxito.");
        List<Horarios> horariosList = crudService.getAllHorarios();
        List<Materias> materiasList = crudService.getAllMaterias();
        System.out.println("Lista de Horarios:");
    }

    private void createOneToManyExample() {
        System.out.println("Creando ejemplo OneToMany...");

        Carrera carrera = new Carrera();
        carrera.setNombre("Ingenieria en Conputacin");
        carrera.setDescripcion("Carrera que enseña el extenso ambiente de la programación");
        carrera.setTipo("Tercer nivel");
        crudService.createCarrera(carrera);

        Materias materia1 = new Materias();
        materia1.setName("Programación I");
        materia1.setLvl(1);
        materia1.setCarrera(carrera);
        crudService.createMaterias(materia1);

        Materias materia2 = new Materias();
        materia2.setName("Base de Datos");
        materia2.setLvl(2);
        materia2.setCarrera(carrera);
        crudService.createMaterias(materia2);

        System.out.println("Ejemplo OneToMany creado con éxito.");
    }

    private void createManyToManyExample() {
        System.out.println("Creando ejemplo ManyToMany...");

        Estudiantes estudiante1 = new Estudiantes();
        estudiante1.setId(1111111);
        estudiante1.setName("Rensso");
        estudiante1.setApellido("Parra");
        estudiante1.setEdad(23);
        estudiante1.setEmail("rensso.parra@uce.edu.ec");

        Estudiantes estudiante2 = new Estudiantes();
        estudiante2.setId(222222);
        estudiante2.setName("Kevin");
        estudiante2.setApellido("Pozo");
        estudiante2.setEdad(22);
        estudiante2.setEmail("kevin.pozo@uce.edu.ec");

        crudService.createEstudiantes(estudiante1);
        crudService.createEstudiantes(estudiante2);

        Materias materia1 = new Materias();
        materia1.setName("Fisica");
        materia1.setLvl(1);
        materia1.setEstudiantes(new ArrayList<>()); // Inicializa la lista de estudiantes
        materia1.getEstudiantes().add(estudiante1);
        materia1.getEstudiantes().add(estudiante2);

        Materias materia2 = new Materias();
        materia2.setName("Introduccion a Matematica");
        materia2.setLvl(1);
        materia2.setEstudiantes(new ArrayList<>()); // Inicializa la lista de estudiantes
        materia2.getEstudiantes().add(estudiante1);

        crudService.createMaterias(materia1);
        crudService.createMaterias(materia2);

        System.out.println("Ejemplo ManyToMany creado con éxito.");
    }

    private void createManyToOneExample() {
        System.out.println("Creando ejemplo ManyToOne...");

        Profesor profesor = new Profesor();
        profesor.setId(33333L);
        profesor.setNombre("Ing Oscar");
        profesor.setApellido("Toalombo");
        profesor.setEdad(45);
        profesor.setEmail("oscar.toalombo@uce.edu.ec");
        crudService.createProfesor(profesor);

        Materias materia1 = new Materias();
        materia1.setName("Algebra lineal I");
        materia1.setLvl(3);
        materia1.setProfesor(profesor);
        crudService.createMaterias(materia1);

        Materias materia2 = new Materias();
        materia2.setName("EDO");
        materia2.setLvl(2);
        materia2.setProfesor(profesor);
        crudService.createMaterias(materia2);

        System.out.println("Ejemplo ManyToOne creado con éxito.");
    }
}
