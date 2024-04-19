package application;

import entities.Aluno_Aula069_ExercicioDeFixacao3;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.

Exemplos:

Entrada: Saída:
Alex Green
27.00
31.00
32.00
FINAL GRADE = 90.00
PASS

Entrada: Saída:
Alex Green
17.00
20.00
15.00
FINAL GRADE = 52.00
FAILED
MISSING 8.00 POINTS
 */

public class Main_Aula069_ExercicioDeFixacao3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno_Aula069_ExercicioDeFixacao3 aluno = new Aluno_Aula069_ExercicioDeFixacao3();
        System.out.println("Entrada:");
        System.out.print("Name: ");
        aluno.name = sc.nextLine();

        System.out.print("Nota do Primeiro TRIMESTRE: ");
        aluno.trimestre1 = sc.nextDouble();

        System.out.print("Nota do Segundo TRIMESTRE: ");
        aluno.trimestre2 = sc.nextDouble();

        System.out.print("Nota do Terceiro TRIMESTRE: ");
        aluno.trimestre3 = sc.nextDouble();

        //TESTE
        System.out.println("SAIDA: \n" + aluno);
        //

        sc.close();

    }
}