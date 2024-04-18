package application;

import entities.Ler_ProblemaMediaPares_POO;

import java.util.Locale;
import java.util.Scanner;
/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
Exemplo 1:
Quantos elementos vai ter o vetor? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
MEDIA DOS PARES = 11.0
Exemplo 2:
Quantos elementos vai ter o vetor? 3
Digite um numero: 7
Digite um numero: 9
Digite um numero: 11
NENHUM NUMERO PAR

   ______                   _      _          ___ ______
 |  ____|                 (_)    (_)        / _ \____  |
 | |__  __  _____ _ __ ___ _  ___ _  ___   | | | |  / /
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \  | | | | / /
 | |____ >  <  __/ | | (__| | (__| | (_) | | |_| |/ /
 |______/_/\_\___|_|  \___|_|\___|_|\___/   \___//_/

   _____   ____   ____
 |  __ \ / __ \ / __ \
 | |__) | |  | | |  | |
 |  ___/| |  | | |  | |
 | |    | |__| | |__| |
 |_|     \____/ \____/


*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio08_ProblemaMediaPares_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int numero = sc.nextInt();
        sc.nextLine();//BUFFER REMOVE
        Ler_ProblemaMediaPares_POO[] vet = new Ler_ProblemaMediaPares_POO[numero];

        for(int i = 0; i < vet.length ; i++){
            System.out.print("Digite um Numero: ");
            vet[i] = new Ler_ProblemaMediaPares_POO(sc.nextDouble());
        }
        double mediaAritmetica = 0;
        int aux = 0;

        for(int i = 0; i < vet.length ; i++){
            if(vet[i].getNumero() % 2 == 0){
                mediaAritmetica += vet[i].getNumero();
                aux++;
            }
        }
        if(aux == 0){
            System.out.println("NENHUM NUMERO PAR");
        }
        else{
            mediaAritmetica = mediaAritmetica/aux;
            System.out.printf("MEDIA DOS PARES = %.1f", mediaAritmetica);

        }

        sc.close();

    }
}