package main;

import java.util.Scanner;
import main.classes.*;

public class Program{

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Diario diario = new Diario();
        Integer opcao;
        System.out.println("Digite o nome da disciplina: ");
        diario.setMateria(teclado.nextLine());
//        System.out.println(diario.getMateria());
        while (true) {
            System.out.println("Digite uma das opções a seguir:\n1 - Adicionar aluno\n2 - Calcular média\n3 - Gerar relatório\n4 - Sair\nSua entrada: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    clearScreen();
                    System.out.println("1 - Adicionar aluno\nAntes de adicionar o aluno declare quantas notas deseja cadastrar para esse aluno.\n");
                    int quantidadeNotas = teclado.nextInt();
                    Aluno aluno = new Aluno(quantidadeNotas);
                    System.out.println("Digite o nome do aluno: ");
                    aluno.setNome(teclado.nextLine());
                    System.out.println("Digite o nome do aluno: ");
                    aluno.setNome(teclado.nextLine());
                    System.out.println("Digite o RA do aluno: ");
                    aluno.setRa(teclado.nextLine());


                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }
}