package uce.edu.ec.ProyectoRelaciones.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estudiantes")
public class Estudiantes {

    @Id
    Long id;
    String name;
    String apellido;
    int edad;
    String email;
    @ManyToMany(mappedBy = "estudiantes")
    private List<Materias> materias;

    public Estudiantes() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
