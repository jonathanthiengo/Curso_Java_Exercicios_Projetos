package application;

import entities.Radius_Aula071_MembrosEstaticosVersao3;

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

public class Main_Aula071_MembrosEstaticosVersao3 {
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Entre Radius:");
            double radius = sc.nextDouble();
            double c = Radius_Aula071_MembrosEstaticosVersao3.circumference(radius);
            double v = Radius_Aula071_MembrosEstaticosVersao3.volume(radius);
            //TESTE
            System.out.println("Circumference: " + c + "\nVolume: " + v + "n\nPI : " + Radius_Aula071_MembrosEstaticosVersao3.PI);
            //

            sc.close();

    }
}