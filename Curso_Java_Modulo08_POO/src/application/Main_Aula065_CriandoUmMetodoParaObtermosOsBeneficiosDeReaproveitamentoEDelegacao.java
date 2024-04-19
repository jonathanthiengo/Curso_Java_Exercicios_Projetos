package application;

import entities.Triangle_Aula065_CriandoUmMetodoParaObtermosOsBeneficiosDeReaproveitamentoEDelegacao;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_Aula065_CriandoUmMetodoParaObtermosOsBeneficiosDeReaproveitamentoEDelegacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle_Aula065_CriandoUmMetodoParaObtermosOsBeneficiosDeReaproveitamentoEDelegacao x, y;
        x = new Triangle_Aula065_CriandoUmMetodoParaObtermosOsBeneficiosDeReaproveitamentoEDelegacao();
        y = new Triangle_Aula065_CriandoUmMetodoParaObtermosOsBeneficiosDeReaproveitamentoEDelegacao();

        System.out.println("Enter the measures of triangle X: ");
        System.out.println("Medidas xA: ");
        x.a = sc.nextDouble();
        System.out.println("Medidas xB: ");
        x.b = sc.nextDouble();
        System.out.println("Medidas xC: ");
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        System.out.println("Medidas yA: ");
        y.a = sc.nextDouble();
        System.out.println("Medidas yB: ");
        y.b = sc.nextDouble();
        System.out.println("Medidas yC: ");
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();

    }
}