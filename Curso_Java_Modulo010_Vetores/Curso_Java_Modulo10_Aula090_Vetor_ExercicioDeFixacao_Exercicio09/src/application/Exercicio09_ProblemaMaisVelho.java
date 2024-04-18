package application;

import java.util.Locale;
import java.util.Scanner;
/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
Exemplo:
Quantas pessoas voce vai digitar? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 16
Dados da 2a pessoa:
Nome: Maria
Idade: 21
Dados da 3a pessoa:
Nome: Teresa
Idade: 15
Dados da 4a pessoa:
Nome: Carlos
Idade: 23
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
PESSOA MAIS VELHA: Carlos

  ______                   _      _          ___   ___
 |  ____|                 (_)    (_)        / _ \ / _ \
 | |__  __  _____ _ __ ___ _  ___ _  ___   | | | | (_) |
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \  | | | |\__, |
 | |____ >  <  __/ | | (__| | (__| | (_) | | |_| |  / /
 |______/_/\_\___|_|  \___|_|\___|_|\___/   \___/  /_/




*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio09_ProblemaMaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int numero = sc.nextInt();
        sc.nextLine();//BUFFER REMOVE
        String[] nome = new String[numero];
        int[] idade = new int[numero];
        int auxI = 0;
        String auxNome = "";

        for(int i = 0; i < nome.length ; i++){
            System.out.printf("Dados da %d pessoa:\n",i+1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();//BUFFER REMOVE
        }


        for(int i = 0; i < idade.length ; i++){
            if(idade[i] > auxI){
                auxI = idade[i];
                auxNome = nome[i];
            }
        }
        System.out.print("Pessoa Mais Velha: " + auxNome);
        sc.close();

    }
}