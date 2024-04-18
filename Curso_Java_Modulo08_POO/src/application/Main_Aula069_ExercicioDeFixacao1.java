package application;

import entities.Rectangle_Aula069_ExercicioDeFixacao1;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.

Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00
 */

public class Main_Aula069_ExercicioDeFixacao1 {
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Rectangle_Aula069_ExercicioDeFixacao1 rectangle = new Rectangle_Aula069_ExercicioDeFixacao1();
            System.out.println("Enter rectangle width and height:");
            System.out.print("Width: ");
            rectangle.width = sc.nextDouble();

            System.out.print("Height: ");
            rectangle.height = sc.nextDouble();

            //TESTE
            System.out.println(rectangle);
            //

            sc.close();

    }
}