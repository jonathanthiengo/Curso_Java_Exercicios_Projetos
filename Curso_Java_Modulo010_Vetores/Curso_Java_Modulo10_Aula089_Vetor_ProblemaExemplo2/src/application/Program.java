package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O TAMANHO DO VETOR");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length ; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product(name,price);
        }

        double sum = 0.0;

        for(int i = 0; i < vect.length ;i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.printf("Average price %.2f%n",avg);


        sc.close();

    }
}