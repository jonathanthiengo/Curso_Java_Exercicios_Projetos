package application;

import entities.Ler_ProblemaDadosPessoas_POO;

import java.util.Locale;
import java.util.Scanner;
/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.

Exemplo:
Quantas pessoas serao digitadas? 5
Altura da 1a pessoa: 1.70
Genero da 1a pessoa: F
Altura da 2a pessoa: 1.83
Genero da 2a pessoa: M
Altura da 3a pessoa: 1.54
Genero da 3a pessoa: M
Altura da 4a pessoa: 1.61
Genero da 4a pessoa: F
Altura da 5a pessoa: 1.75
Genero da 5a pessoa: F
Menor altura = 1.54
Maior altura = 1.83
Media das alturas das mulheres = 1.69
Numero de homens = 2

  ______                   _      _         __ __
 |  ____|                 (_)    (_)       /_ /_ |
 | |__  __  _____ _ __ ___ _  ___ _  ___    | || |
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \   | || |
 | |____ >  <  __/ | | (__| | (__| | (_) |  | || |
 |______/_/\_\___|_|  \___|_|\___|_|\___/   |_||_|

   _____   ____   ____
 |  __ \ / __ \ / __ \
 | |__) | |  | | |  | |
 |  ___/| |  | | |  | |
 | |    | |__| | |__| |
 |_|     \____/ \____/

*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio011_ProblemaDadosPessoas_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int numero = sc.nextInt();
        sc.nextLine();//BUFFER REMOVE

        Ler_ProblemaDadosPessoas_POO[] pessoas = new Ler_ProblemaDadosPessoas_POO[numero];

        double maiorAltura = 0;
        double menorAltura = 10000;
        double somaAlturaMulheres = 0;
        int numeroDeHomens = 0;
        int numeroDeMulheres = 0;


        for(int i = 0; i < pessoas.length ; i++){
            System.out.printf("\nDigite a Altura e o Genero (M / F) da %dº Pessoa:\n",i+1);
            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();
            System.out.print("Digite o Genero: ");
            char genero = sc.next().charAt(0);
            while(genero != 'M' && genero != 'F'){
                System.out.println("Digite M ou F");
                genero = sc.next().charAt(0);
            }

            pessoas[i] = new Ler_ProblemaDadosPessoas_POO(genero, altura);
            //sc.nextLine();//BUFFER REMOVE

        }

        for(int i = 0; i < pessoas.length ; i++){
            if(pessoas[i].getGenero() == 'M'){
                numeroDeHomens++;
            }
            else{
                somaAlturaMulheres += pessoas[i].getAltura();
                numeroDeMulheres++;
            }
            if(menorAltura > pessoas[i].getAltura()){
                menorAltura = pessoas[i].getAltura();
            }
            if(maiorAltura < pessoas[i].getAltura()){
                maiorAltura = pessoas[i].getAltura();
            }
        }
        System.out.println("\nMenor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", somaAlturaMulheres/numeroDeMulheres));
        System.out.println("Numero de Homens = " + numeroDeHomens);

        sc.close();

    }
}