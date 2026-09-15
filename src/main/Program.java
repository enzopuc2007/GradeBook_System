package main;

import java.util.Scanner;
import main.classes.*;

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
                    int[] notas = new int[quantidadeNotas];
                    System.out.println("Digite o nome do aluno: ");
                    String nome = teclado.nextLine();
                    System.out.println("Digite o RA do aluno: ");
                    int ra = Integer.parseInt(teclado.nextLine());
                    for(int i=0;i<quantidadeNotas;i++){
                        System.out.println("Digite a nota do aluno: ");
                        notas[i] = teclado.nextInt();
                    }

                    diario.addAlunos(nome, ra, notas);

                    break;

                case 2:

                    break;

                case 3:
                    break;

                case 4:
                    System.out.printf("O proggrama está sendo encerrado");
                    ver = false;
                    break;
            }
        }
    }
}