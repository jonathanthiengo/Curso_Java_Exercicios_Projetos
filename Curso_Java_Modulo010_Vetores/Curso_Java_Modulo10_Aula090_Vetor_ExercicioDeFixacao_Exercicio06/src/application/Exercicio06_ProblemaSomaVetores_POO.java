package application;

import entities.Ler_ProblemaSomaVetores_POO;

import java.util.Locale;
import java.util.Scanner;
/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
Exemplo:
Quantos valores vai ter cada vetor? 6
Digite os valores do vetor A:
8
2
11
14
13
20
Digite os valores do vetor B:
5
10
3
1
10
7
VETOR RESULTANTE:
13
12
14
15
23
27


  ______                   _      _          ___    __
 |  ____|                 (_)    (_)        / _ \  / /
 | |__  __  _____ _ __ ___ _  ___ _  ___   | | | |/ /_
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \  | | | | '_ \
 | |____ >  <  __/ | | (__| | (__| | (_) | | |_| | (_) |
 |______/_/\_\___|_|  \___|_|\___|_|\___/   \___/ \___/

   _____   ____   ____
 |  __ \ / __ \ / __ \
 | |__) | |  | | |  | |
 |  ___/| |  | | |  | |
 | |    | |__| | |__| |
 |_|     \____/ \____/



*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio06_ProblemaSomaVetores_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numero = sc.nextInt();
        sc.nextLine();
        Ler_ProblemaSomaVetores_POO[] vetA = new Ler_ProblemaSomaVetores_POO[numero];
        Ler_ProblemaSomaVetores_POO[] vetB = new Ler_ProblemaSomaVetores_POO[numero];
        Ler_ProblemaSomaVetores_POO[] vetC = new Ler_ProblemaSomaVetores_POO[numero];

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < vetA.length ; i++){
            System.out.print("Digite um Numero: ");
            vetA[i] = new Ler_ProblemaSomaVetores_POO(sc.nextInt());

        }
        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < vetB.length ; i++){
            System.out.print("Digite um Numero: ");
            vetB[i] = new Ler_ProblemaSomaVetores_POO(sc.nextInt());
            vetC[i] = new Ler_ProblemaSomaVetores_POO(vetA[i].getNumero() + vetB[i].getNumero());
        }
        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i <  vetC.length ;i++){
            System.out.println(vetC[i].getNumero());
        }

        sc.close();

    }
}