package uce.edu.ec.ProyectoRelacionesDDBB.Entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cod;
    private String name;
    private Integer lvl;
    @OneToOne(mappedBy = "materias")
    private Horarios horario;
    private String profesor;

    public Materias() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Horarios getHorario() {
        return horario;
    }

    public void setHorario(Horarios horario) {
        this.horario = horario;
    }
}
