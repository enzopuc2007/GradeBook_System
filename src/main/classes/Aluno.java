package main.classes;

public class Aluno {

    private String nome;
    private int ra;

    private int[] notas;

    public Aluno(int[] notas, String nome, int ra) {
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
}