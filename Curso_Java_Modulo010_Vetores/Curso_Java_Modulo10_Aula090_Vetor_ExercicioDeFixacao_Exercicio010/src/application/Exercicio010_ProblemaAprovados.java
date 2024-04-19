package application;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).

Exemplo:
Quantos alunos serao digitados? 4
Digite nome, primeira e segunda nota do 1o aluno:
Joao Silva
7.0
8.5
Digite nome, primeira e segunda nota do 2o aluno:
Maria Teixeira
9.2
6.5
Digite nome, primeira e segunda nota do 3o aluno:
Carlos Carvalho
5.0
6.0
Digite nome, primeira e segunda nota do 4o aluno:
Teresa Pires
5.5
6.5
Alunos aprovados:
Joao Silva
Maria Teixeira
Teresa Pires



  ______                   _      _         __  ___
 |  ____|                 (_)    (_)       /_ |/ _ \
 | |__  __  _____ _ __ ___ _  ___ _  ___    | | | | |
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \   | | | | |
 | |____ >  <  __/ | | (__| | (__| | (_) |  | | |_| |
 |______/_/\_\___|_|  \___|_|\___|_|\___/   |_|\___/

*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio010_ProblemaAprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas alunos serão digitados? ");
        int numero = sc.nextInt();
        sc.nextLine();//BUFFER REMOVE
        String[] nome = new String[numero];
        double[] semestre1 = new double[numero];
        double[] semestre2 = new double[numero];
        int auxI = 0;
        String auxNome = "";

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("\nDigite o nome do %dº aluno:\n", i + 1);
            nome[i] = sc.nextLine();
            System.out.print("Digite a nota do 1º Semestre: ");
            semestre1[i] = sc.nextDouble();
            System.out.print("Digite a nota do 2º Semestre: ");
            semestre2[i] = sc.nextDouble();
            sc.nextLine();//BUFFER REMOVE

        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < nome.length; i++) {
            if ((semestre1[i] + semestre2[i]) / 2 >= 6) {
                System.out.println(nome[i]);
            }
        }

        sc.close();

    }
}