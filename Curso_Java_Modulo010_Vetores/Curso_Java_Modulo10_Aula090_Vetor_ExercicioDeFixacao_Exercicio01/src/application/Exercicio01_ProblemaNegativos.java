package application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: -2
Digite um numero: 9
Digite um numero: 10
Digite um numero: -3
Digite um numero: -7
NUMEROS NEGATIVOS:
-2
-3
-7

  _______  _______ ____   ____ ___ ____ ___ ___     ___  _
 | ____\ \/ / ____|  _ \ / ___|_ _/ ___|_ _/ _ \   / _ \/ |
 |  _|  \  /|  _| | |_) | |    | | |    | | | | | | | | | |
 | |___ /  \| |___|  _ <| |___ | | |___ | | |_| | | |_| | |
 |_____/_/\_\_____|_| \_\\____|___\____|___\___/   \___/|_|
*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio01_ProblemaNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        while (n > 10) {
            System.out.println("Limite Excedido. Até 10 numeros permitidos para serem digitados.");
            System.out.print("Quantos numeros voce vai digitar? ");
            n = sc.nextInt();
        }

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }
}