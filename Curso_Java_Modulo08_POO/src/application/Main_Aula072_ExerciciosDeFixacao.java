package application;

import entities.CurrencyConverter_Aula072_ExerciciosDeFixacao;


import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
Exemplo:
What is the dollar price? 3.10
How many dollars will be bought? 200.00
Amount to be paid in reais = 657.20
 */

public class Main_Aula072_ExerciciosDeFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        CurrencyConverter_Aula072_ExerciciosDeFixacao.dollarExchangeRate = sc.nextDouble();
        System.out.println("What is the dollar price? ");
        CurrencyConverter_Aula072_ExerciciosDeFixacao.buyedCurrency = sc.nextDouble();
        //TESTE
        System.out.println("Amount to be paid in reais: " + CurrencyConverter_Aula072_ExerciciosDeFixacao.calculator());
        //
        sc.close();

    }
}