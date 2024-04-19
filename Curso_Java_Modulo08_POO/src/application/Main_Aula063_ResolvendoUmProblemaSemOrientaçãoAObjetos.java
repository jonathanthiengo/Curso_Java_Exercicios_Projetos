package application;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_Aula063_ResolvendoUmProblemaSemOrientaçãoAObjetos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC; // SEM POO
        System.out.println("Enter the measures of triangle X: ");
        System.out.println("Medidas xA: ");
        xA = sc.nextDouble();
        System.out.println("Medidas xB: ");
        xB = sc.nextDouble();
        System.out.println("Medidas xC: ");
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        System.out.println("Medidas yA: ");
        yA = sc.nextDouble();
        System.out.println("Medidas yB: ");
        yB = sc.nextDouble();
        System.out.println("Medidas yC: ");
        yC = sc.nextDouble();
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
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