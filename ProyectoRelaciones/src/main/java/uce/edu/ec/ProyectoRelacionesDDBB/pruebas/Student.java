package uce.edu.ec.ProyectoRelacionesDDBB.pruebas;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Student {


    private Long id;
    private String name;
    private Long lvl;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLvl() {
        return lvl;
    }

    public void setLvl(Long lvl) {
        this.lvl = lvl;
    }
}
