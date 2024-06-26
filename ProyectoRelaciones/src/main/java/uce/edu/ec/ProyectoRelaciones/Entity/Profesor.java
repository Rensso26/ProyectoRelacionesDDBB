package uce.edu.ec.ProyectoRelaciones.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profesores")
public class Profesor {

    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    @OneToMany(mappedBy = "profesor")
    private List<Materias> materias = new ArrayList<>();

    public Profesor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materias> materias) {
        this.materias = materias;
    }
}
