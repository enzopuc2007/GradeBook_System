package main.classes;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private int ra;

    private ArrayList<Integer> notas = new ArrayList<>();

    public Aluno(ArrayList<Integer> notas, String nome, int ra) {
        this.notas = notas;
        setNome(nome);
        setRa(ra);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getNota(int indice){
        return notas.get(indice);
    }

    public void setNota(int valor){
        notas.add(valor);
    }

    public ArrayList<Integer> getarraynotas(){
        return notas;
    }
}