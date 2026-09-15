package main.classes;

import java.util.ArrayList;

public class Diario {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private String materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void addAlunos(String nome, int ra, ArrayList<Integer> nota) {
        Aluno aluno = new Aluno(nota,nome, ra);
        alunos.add(aluno);
    }

    public void calculaMedia(){
    double Media=0;
    double Soma=0;
    
        for(int i=0;i<alunos.size();i++){
            for(int j=0;j<alunos.get(i).getarraynotas().size();j++){
                Soma += alunos.get(i).getNota(j);
            }
            Media += Soma/alunos.get(i).getarraynotas().size();
        }

        Media /= alunos.size();

        System.out.printf("A média geral da turma é: %f",Media);
    }

    public void realizaRelatorio(){
        for(int i=0;i<alunos.size();i++){
            double Soma = 0; 
            System.out.printf("Nome do aluno: " + alunos.get(i).getNome());
            System.out.println();
            System.out.printf("RA: " + alunos.get(i).getRa());
            System.out.println();
            for(int j=0;j<alunos.get(i).getarraynotas().size();j++){
                System.out.printf("Nota %d: %d",j+1,alunos.get(i).getNota(j));
                System.out.println();
                Soma += alunos.get(i).getNota(j);
            }
            double Media = Soma/alunos.get(i).getarraynotas().size();

            System.out.printf("Media: %f",Media);
        }

        calculaMedia();
    }
}