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

    public Diario() {}

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

    public void setAlunos(String nome, String ra, double nota){
        Aluno novoAluno = new Aluno(nome, ra);
        novoAluno.addNota(nota);
        this.alunos.add(novoAluno);
    }

    public void imprimirAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void ProcuraMedia(String nome){
        for (Aluno aluno : alunos) {
            if(aluno.getNome().equals(nome)){
                break;
            }
        }

    }
}