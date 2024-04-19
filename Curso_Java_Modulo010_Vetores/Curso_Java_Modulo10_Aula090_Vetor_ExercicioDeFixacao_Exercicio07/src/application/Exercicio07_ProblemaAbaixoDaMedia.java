package application;

import entities.Ler_ProblemaAbaixoDaMedia_POO;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
Exemplo:
Quantos elementos vai ter o vetor? 4
Digite um numero: 10.0
Digite um numero: 15.5
Digite um numero: 13.2
Digite um numero: 9.8
MEDIA DO VETOR = 12.125
ELEMENTOS ABAIXO DA MEDIA:
10.0
9.8


   ______                   _      _          ___ ______
 |  ____|                 (_)    (_)        / _ \____  |
 | |__  __  _____ _ __ ___ _  ___ _  ___   | | | |  / /
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \  | | | | / /
 | |____ >  <  __/ | | (__| | (__| | (_) | | |_| |/ /
 |______/_/\_\___|_|  \___|_|\___|_|\___/   \___//_/


*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio07_ProblemaAbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int numero = sc.nextInt();
        sc.nextLine();
        Ler_ProblemaAbaixoDaMedia_POO[] vet = new Ler_ProblemaAbaixoDaMedia_POO[numero];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um Numero: ");
            vet[i] = new Ler_ProblemaAbaixoDaMedia_POO(sc.nextDouble());
        }
        double media = 0;

        for (int i = 0; i < vet.length; i++) {
            media += vet[i].getNumero();
        }
        media = media / numero;
        System.out.printf("\nMEDIA DO VETOR = %.3f", media);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getNumero() < media) {
                System.out.printf("%.1f\n", vet[i].getNumero());
            }
        }

        sc.close();

    }
}