package application;

import entities.Employee_Aula069_ExercicioDeFixacao2;


import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.

Name: Joao Silva
Gross salary: 6000.00
Tax: 1000.00
Employee: Joao Silva, $ 5000.00
Which percentage to increase salary? 10.0
Updated data: Joao Silva, $ 5600.00
 */

public class Main_Aula069_ExercicioDeFixacao2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee_Aula069_ExercicioDeFixacao2 employee = new Employee_Aula069_ExercicioDeFixacao2();
        System.out.println("Enter data:");
        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("TAX: ");
        employee.tax = sc.nextDouble();

        //TESTE
        System.out.println("Employee: " + employee);
        //
        System.out.println("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println("Update: " + employee);

        sc.close();

    }
}