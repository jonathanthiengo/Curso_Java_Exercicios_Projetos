package application;

import entities.Radius_Aula070E71_MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um valor numérico qualquer, e daí mostrar
quanto seria o valor de uma circunferência e do volume de uma esfera
para um raio daquele valor. Informar também o valor de PI com duas
casas decimais.
Enter radius: 3.0
Circumference: 18.85
Volume: 113.10
PI value: 3.14
 */

public class Main_Aula070E71_MembrosEstaticos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Radius_Aula070E71_MembrosEstaticos radius = new Radius_Aula070E71_MembrosEstaticos();
        System.out.println("Entre Radius:");
        radius.radius = sc.nextDouble();

        //TESTE
        System.out.println("SAIDA: \n" + radius);
        //

        sc.close();

    }
}