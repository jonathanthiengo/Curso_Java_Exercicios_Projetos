package application;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import entities.Client;

/*
Enter account number: 8532
Enter account holder: Alex Green
Is there na initial deposit (y/n)? y
Enter initial deposit value: 500.00
Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00
Enter a deposit value: 200.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.00
Enter a withdraw value: 300.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 395.00/
*/

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // Product product = new Product();  //Sai pq o construtor padrao nao existe... foi feito um novo construtor

        System.out.println("Enter account number: ");
        int acountNumber = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter account holder: ");
        String clientName = sc.nextLine();
        Client client = new Client(clientName);

        System.out.println("Is there na initial deposit (y/n)?");
        String select = sc.nextLine();
        if (Objects.equals(select, "y")) {
            System.out.println("Enter initial deposit value: ");
            client.Deposit(sc.nextDouble());
        } else {
            System.out.println("");
        }


        client.setAccountNumber(acountNumber);
        //Product product = new Product(name, price);
        //product.setName("Xbox360");
        System.out.println("\nAccount data");
        System.out.println(client);

        System.out.println("\nEnter a deposit value:");
        client.Deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(client);

        System.out.println("\nEnter a withdraw value:");
        client.withdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(client);

        sc.close();
    }
}