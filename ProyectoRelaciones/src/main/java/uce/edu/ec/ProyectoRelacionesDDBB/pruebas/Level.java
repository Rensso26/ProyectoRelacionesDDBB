package uce.edu.ec.ProyectoRelacionesDDBB.pruebas;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;


public class Level {

    private Long lvl;
    private String[] materias;


    public Level() {
    }

    public Long getLvl() {
        return lvl;
    }

    public void setLvl(Long lvl) {
        this.lvl = lvl;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }
}
