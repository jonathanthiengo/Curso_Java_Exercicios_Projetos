package application;

import entities.Ler_ProblemaAlturas_POO;

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


  ______                   _      _        ___ ____
 |  ____|                 (_)    (_)      / _ \___ \
 | |__  __  _____ _ __ ___ _  ___ _  ___ | | | |__) |
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \| | | |__ <
 | |____ >  <  __/ | | (__| | (__| | (_) | |_| |__) |
 |______/_/\_\___|_|  \___|_|\___|_|\___/ \___/____/

   _____   ____   ____
 |  __ \ / __ \ / __ \
 | |__) | |  | | |  | |
 |  ___/| |  | | |  | |
 | |    | |__| | |__| |
 |_|     \____/ \____/


*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio03_ProblemaAlturas_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numero = sc.nextInt();
        sc.nextLine();
        Ler_ProblemaAlturas_POO[] pessoas = new Ler_ProblemaAlturas_POO[numero];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Dados da %da pessoa: ", i + 1);
            System.out.print("\nNome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();


            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Ler_ProblemaAlturas_POO(nome, idade, altura);
            sc.nextLine();
        }

        double aux = 0;
        for (int i = 0; i < pessoas.length; i++) {
            aux += pessoas[i].getAltura();
        }
        System.out.printf("\nAltura média = %.2f", (aux / numero));
        aux = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                aux += 1;
            }
        }
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", (aux * 100) / numero);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.print("\n" + pessoas[i].getNome());
            }
        }
        sc.close();

    }
}