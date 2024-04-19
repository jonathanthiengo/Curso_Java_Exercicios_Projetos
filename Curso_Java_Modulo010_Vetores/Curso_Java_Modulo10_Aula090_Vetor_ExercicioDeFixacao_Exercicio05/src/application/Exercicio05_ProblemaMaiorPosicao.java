package application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
Digite um numero: 13.0
Digite um numero: 7.0
MAIOR VALOR = 14.0
POSICAO DO MAIOR VALOR = 3


  ______                   _      _          ___  _____
 |  ____|                 (_)    (_)        / _ \| ____|
 | |__  __  _____ _ __ ___ _  ___ _  ___   | | | | |__
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \  | | | |___ \
 | |____ >  <  __/ | | (__| | (__| | (_) | | |_| |___) |
 |______/_/\_\___|_|  \___|_|\___|_|\___/   \___/|____/



*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio05_ProblemaMaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numero = sc.nextInt();
        sc.nextLine();
        double[] numeros = new double[numero];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um Numero: ");
            numeros[i] = sc.nextDouble();
        }


        double maiorValor = 0;
        int posicaoValor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                posicaoValor = i;
            }
        }
        System.out.print("\nMAIOR VALOR = " + maiorValor);
        System.out.print("\nPOSICAO DO MAIOR VALOR = " + posicaoValor);
        sc.close();

    }
}