package main;

import java.util.Scanner;
import main.classes.*;

public class Program{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Diario diario = new Diario();

        boolean cont = true;
        while(cont == true){
            System.out.printf("Digite a opção a ser escolhida: \n1 - Cadastrar aluno e nota \n2 - Calcular as médias \n3 - Gerar relatório \n4 - Sair\n\nFaça a sua escolha: ");
            int esc = sc.nextInt();

            switch (esc){
                case 1:
                    while(true) {
                        System.out.printf("\n\n");
                        System.out.printf("Digite o nome do aluno: ");
                        String nome = sc.next();
                        System.out.printf("\n\nDigite o RA do aluno: ");
                        String ra = sc.next();
                        System.out.printf("\n\nDigite a nota do aluno: ");
                        double nota = sc.nextDouble();

                        diario.setAlunos(nome, ra, nota);

                        System.out.printf("Deseja adicionar algum outro aluno?(S ou N)");
                        String adiciona = sc.next();
                        if(adiciona.equals("N")){
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.printf("\n\n");
                    System.out.printf("Deseja a média de algum aluno em especifico?(S ou N)");
                    String ad = sc.next();
                    if(ad.equals("S")){
                        System.out.printf("Digite o nome do aluno: ");
                        String nome = sc.next();

                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.printf("\n\n");
                    System.out.printf("Finalização do programa!");
                    System.exit(0);
                    break;
            }
        }

    }
}