package application;

import entities.Rent_Pensionato_POO;

import java.util.Locale;
import java.util.Scanner;

/*
A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.

  ______                   _      _         __ ___
 |  ____|                 (_)    (_)       /_ |__ \
 | |__  __  _____ _ __ ___ _  ___ _  ___    | |  ) |
 |  __| \ \/ / _ \ '__/ __| |/ __| |/ _ \   | | / /
 | |____ >  <  __/ | | (__| | (__| | (_) |  | |/ /_
 |______/_/\_\___|_|  \___|_|\___|_|\___/   |_|____|

   _____   ____   ____
 |  __ \ / __ \ / __ \
 | |__) | |  | | |  | |
 |  ___/| |  | | |  | |
 | |    | |__| | |__| |
 |_|     \____/ \____/

*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio12_Pensionato_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int rentNumber = sc.nextInt();
        sc.nextLine();//BUFFER REMOVE
        Rent_Pensionato_POO[] rent = new Rent_Pensionato_POO[10];

        for (int i = 0; i < rentNumber; i++) {
            System.out.println("\nRent #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            rent[room] = new Rent_Pensionato_POO(name, email);
            sc.nextLine();//BUFFER REMOVE

        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }
        sc.close();

    }
}