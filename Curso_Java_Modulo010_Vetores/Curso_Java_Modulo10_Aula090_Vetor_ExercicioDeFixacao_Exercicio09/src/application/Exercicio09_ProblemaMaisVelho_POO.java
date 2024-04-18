package application;

import entities.Ler_ProblemaMaisVelho_POO;

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

  _____   ____   ____
 |  __ \ / __ \ / __ \
 | |__) | |  | | |  | |
 |  ___/| |  | | |  | |
 | |    | |__| | |__| |
 |_|     \____/ \____/


*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio09_ProblemaMaisVelho_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int numero = sc.nextInt();
        sc.nextLine();//BUFFER REMOVE
        Ler_ProblemaMaisVelho_POO[] pessoas = new Ler_ProblemaMaisVelho_POO[numero];
        int auxI = 0;
        String auxNome = "";

        for(int i = 0; i < pessoas.length ; i++){
            System.out.printf("Dados da %d pessoa:\n",i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();//BUFFER REMOVE
            pessoas[i] = new Ler_ProblemaMaisVelho_POO(nome, idade);
        }


        for(int i = 0; i < pessoas.length ; i++){
            if(pessoas[i].getIdade() > auxI){
                auxI = pessoas[i].getIdade();
                auxNome = pessoas[i].getNome();
            }
        }
        System.out.print("Pessoa Mais Velha: " + auxNome);
        sc.close();

    }
}