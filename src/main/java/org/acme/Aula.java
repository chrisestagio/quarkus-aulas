package org.acme;

import jakarta.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class Aula extends PanacheEntity {
    public int id;
    public String nome;
    public String estilo;
    public String dia;
    public String horario;
    public Professor professor;

    public Aula(){}
    

}
