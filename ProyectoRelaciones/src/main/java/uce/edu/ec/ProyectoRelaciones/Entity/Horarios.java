package uce.edu.ec.ProyectoRelaciones.Entity;

import jakarta.persistence.*;

import java.sql.Time;
@Entity
@Table(name = "horarios")
public class Horarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long horario;
    private Time hora_inic;
    private String day;
    private Double duracion;

    @OneToOne
    private Materias materias;

    public Horarios() {}

    public Long getHorario() {
        return horario;
    }

    public void setHorario(Long horario) {
        this.horario = horario;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Time getHora_inic() {
        return hora_inic;
    }

    public void setHora_inic(Time hora_inic) {
        this.hora_inic = hora_inic;
    }

}
