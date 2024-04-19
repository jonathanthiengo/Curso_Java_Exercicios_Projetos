package application;

import entities.Triangle_Aula064_CriandoUmaClasseComTresAtributosParaRepresentarMelhorOTriangulo;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_Aula064_CriandoUmaClasseComTresAtributosParaRepresentarMelhorOTriangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle_Aula064_CriandoUmaClasseComTresAtributosParaRepresentarMelhorOTriangulo x, y;
        x = new Triangle_Aula064_CriandoUmaClasseComTresAtributosParaRepresentarMelhorOTriangulo();
        y = new Triangle_Aula064_CriandoUmaClasseComTresAtributosParaRepresentarMelhorOTriangulo();

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
        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
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