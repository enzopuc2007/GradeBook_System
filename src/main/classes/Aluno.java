package main.classes;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private String ra;
    private ArrayList<Float> notas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String r) {
        ra = r;
    }

    public float getNota(int i) {
        return notas.get(i);
    }

    public void addNota(float n) {
        notas.add(n);
    }

    public void removeNota(int i) {
        notas.remove(i);
    }

    public Aluno(String nome, String ra) {
        setNome(nome);
        setRa(ra);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                '}';
    }
}