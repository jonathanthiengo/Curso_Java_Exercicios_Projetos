package application;

import java.util.Locale;
import java.util.Scanner;
/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
Exemplo:
Quantas pessoas serao digitadas? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 15
Altura: 1.82
Dados da 2a pessoa:
Nome: Maria
Idade: 16
Altura: 1.60
Dados da 3a pessoa:
Nome: Teresa
Idade: 14
Altura: 1.58
Dados da 4a pessoa:
Nome: Carlos
Idade: 21
Altura: 1.65
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
Altura: 1.78
Altura média: 1.69
Pessoas com menos de 16 anos: 40.0%
Joao
Teresa


  ______                   _      _          ___  _  _
 |  ____|                 (_)    (_)        / _ \| || |
 | |__  __  _____ _ __ ___ _  ___ _  ___   | | | | || |_
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \  | | | |__   _|
 | |____ >  <  __/ | | (__| | (__| | (_) | | |_| |  | |
 |______/_/\_\___|_|  \___|_|\___|_|\___/   \___/   |_|

*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio04_ProblemaNumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numero = sc.nextInt();
        sc.nextLine();
        int[] numeros = new int[numero];

        for(int i = 0; i < numeros.length ; i++){
            System.out.print("Digite um Numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES: ");
        int aux=0;
        for(int i = 0; i < numeros.length ;i++){
            if(numeros[i] % 2 == 0){
                System.out.printf("%d   ", numeros[i]);
                aux += 1;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d",aux);
        sc.close();

    }
}