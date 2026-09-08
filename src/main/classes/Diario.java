package main.classes;

import java.util.ArrayList;

public class Diario {
    private ArrayList<Aluno> alunos;
    private String materia;
    private float menorNota;
    private float maiorNota;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Diario(String materia) {
        this.materia = materia;
    }
    public String toString() {
        return "Diario{" +
                "alunos=" + alunos +
                ", materia='" + materia + '\'' +
                ", menorNota=" + menorNota +
                ", maiorNota=" + maiorNota +
                '}';
    }
}