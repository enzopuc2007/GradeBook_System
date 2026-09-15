package main;

import java.util.ArrayList;
import java.util.Scanner;
import main.classes.Diario;

public class Program{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Diario diario = new Diario();
        boolean ver = true;
        Integer opcao;
        System.out.println("Digite o nome da disciplina: ");
        diario.setMateria(teclado.nextLine());
//        System.out.println(diario.getMateria());
        while (ver == true) {
            System.out.println("Digite uma das opções a seguir:\n1 - Adicionar aluno\n2 - Calcular média\n3 - Gerar relatório\n4 - Sair\nSua entrada: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("1 - Adicionar aluno\nAntes de adicionar o aluno declare quantas notas deseja cadastrar para esse aluno.\n");
                    int quantidadeNotas = teclado.nextInt();
                    teclado.nextLine();
                    ArrayList<Integer> notas = new ArrayList<>();
                    System.out.println("Digite o nome do aluno: ");
                    String nome = teclado.nextLine();
                    System.out.println("Digite o RA do aluno: ");
                    int ra = Integer.parseInt(teclado.nextLine());
                    for(int i=0;i<quantidadeNotas;i++){
                        System.out.println("Digite a nota do aluno: ");
                        notas.add(teclado.nextInt());
                    }

                    diario.addAlunos(nome, ra, notas);

                    break;

                case 2:
                    System.out.printf("Calculo da média de cada aluno: \n");
                    diario.calculaMedia();

                    break;

                case 3:
                    System.out.println("Relatorio geral de cada aluno\n\n");
                    System.out.println();
                    diario.realizaRelatorio();

                    break;

                case 4:
                    System.out.printf("O programa está sendo encerrado");
                    ver = false;
                    break;
            }
        }

        teclado.close();
    }
}