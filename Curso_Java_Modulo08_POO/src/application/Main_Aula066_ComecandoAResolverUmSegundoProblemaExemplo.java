package application;

import entities.Product_Aula066_ComecandoAResolverUmSegundoProblemaExemplo;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
        • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
        estoque)
        • Realizar uma entrada no estoque e mostrar novamente os dados do produto
        • Realizar uma saída no estoque e mostrar novamente os dados do produto
        Para resolver este problema, você deve criar
        uma CLASSE conforme projeto ao lado:*/

/*
Enter product data:
Name: TV
Price: 900.00
Quantity in stock: 10
Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
Enter the number of products to be added in stock: 5
Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
Enter the number of products to be removed from stock: 3
Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00*/


public class Main_Aula066_ComecandoAResolverUmSegundoProblemaExemplo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product_Aula066_ComecandoAResolverUmSegundoProblemaExemplo product = new Product_Aula066_ComecandoAResolverUmSegundoProblemaExemplo();
        System.out.println("Enter Product Data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        //TESTE
        System.out.println("Product data: " + product);
        //
        System.out.printf("\n----------------------------------\n");
        System.out.println("Enter the number of Products to be ADDED in Stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("\nUpdated data: " + product);

        System.out.printf("\n----------------------------------\n");
        System.out.println("Enter the number of Products to be REMOVED in Stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("\nUpdated data: " + product);
        sc.close();

    }
}