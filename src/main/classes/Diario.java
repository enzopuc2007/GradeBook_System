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
    
        for(int i=0;i<alunos.size();i++){
            double Soma=0;
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
            System.out.println();
            System.out.println();
        }

        calculaMedia();

        criaHistograma();


    }

    public void criaHistograma(){
        System.out.printf("\t\tHistograma geral de todas as provas\t\t\n\n");
        int A=0,B=0,C=0,D=0,E=0,cont=1;

        for(int i=0;i<alunos.size();i++){
            for(int j=0;j<alunos.get(i).getarraynotas().size();j++){
                if(alunos.get(i).getNota(j)<=2) A++;
                if(alunos.get(i).getNota(j)>2 & alunos.get(i).getNota(j)<=4) B++;
                if(alunos.get(i).getNota(j)>4 & alunos.get(i).getNota(j)<=6) C++;
                if(alunos.get(i).getNota(j)>6 & alunos.get(i).getNota(j)<=8) D++;
                if(alunos.get(i).getNota(j)>8) E++;
            }
        }

        switch(cont){
            case 1:
                System.out.printf("\t\t0 - 2]\t\t");
                for(int i=0;i<A;i++){
                    System.out.printf("%s","\u2588");
                }
                System.out.printf(" %d",A);
                System.out.println();

            case 2:
                System.out.printf("\t\t2 - 4]\t\t");
                for(int i=0;i<B;i++){
                    System.out.printf("%s","\u2588");
                }
                System.out.printf(" %d",B);
                System.out.println();

            case 3:
                System.out.printf("\t\t4 - 6]\t\t");
                for(int i=0;i<C;i++){
                    System.out.printf("%s","\u2588");
                }
                System.out.printf(" %d",C);
                System.out.println();

            case 4:
                System.out.printf("\t\t6 - 8]\t\t");
                for(int i=0;i<D;i++){
                    System.out.printf("%s","\u2588");
                }
                System.out.printf(" %d",D);
                System.out.println();

            case 5:
                System.out.printf("\t\t8 - 10]\t\t");
                for(int i=0;i<E;i++){
                    System.out.printf("%s","\u2588");
                }
                System.out.printf(" %d",E);
                System.out.println();
        }
    }
}