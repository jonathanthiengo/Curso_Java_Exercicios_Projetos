package application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
VALORES = 8.0 4.0 10.0 14.0
SOMA = 36.00
MEDIA = 9.00

  ______                        _        _           ___  ___
 |  ____|                      (_)      (_)         / _ \|__ \
 | |__   __  __ ___  _ __  ___  _   ___  _   ___   | | | |  ) |
 |  __|  \ \/ // _ \| '__|/ __|| | / __|| | / _ \  | | | | / /
 | |____  >  <|  __/| |  | (__ | || (__ | || (_) | | |_| |/ /_
 |______|/_/\_\\___||_|   \___||_| \___||_| \___/   \___/|____|
*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio02_ProblemaSomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numero = sc.nextInt();
        double[] vect = new double[numero];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }


        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        double aux = 0;
        for (int i = 0; i < vect.length; i++) {
            aux += vect[i];
        }
        System.out.printf("\nSOMA = %.2f", aux);
        System.out.printf("\nMEDIA = %.2f", (aux / numero));
        sc.close();

    }
}