package application;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import entities.Client;

/*Enter account number: 7801
Enter account holder: Maria Brown
Is there na initial deposit (y/n)? n
Account data:
Account 7801, Holder: Maria Brown, Balance: $ 0.00
Enter a deposit value: 200.00
Updated account data:
Account 7801, Holder: Maria Brown, Balance: $ 200.00
Enter a withdraw value: 198.00
Updated account data:
Account 7801, Holder: Maria Brown, Balance: $ -3.00*/

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