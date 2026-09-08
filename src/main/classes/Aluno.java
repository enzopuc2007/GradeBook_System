package main.classes;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private String ra;

    private int[] notas;

    public Aluno(int quantidadeNotas) {
        this.notas = new int[quantidadeNotas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}