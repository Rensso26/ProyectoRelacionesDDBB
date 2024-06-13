package uce.edu.ec.ProyectoRelacionesDDBB.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Time;
import java.time.DayOfWeek;

@Entity
public class Horarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long horario;
    private Time hora_inic;
    private DayOfWeek day;
    private Double duracion;

    @OneToOne
    private Materias materias;

    public Horarios() {
    }


    public Long getHorario() {
        return horario;
    }

    public void setHorario(Long horario) {
        this.horario = horario;
    }

    public Time getHora_inic() {
        return hora_inic;
    }

    public void setHora_inic(Time hora_inic) {
        this.hora_inic = hora_inic;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }


    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }
}
