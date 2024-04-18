package entities;

public class Employee_Aula069_ExercicioDeFixacao2 {

    public String name;
    public double grossSalary;
   public double tax;


   public double netSalary(){
       return this.grossSalary - this.tax ;
   }
   public double increaseSalary(double percentage){
       return this.grossSalary += (this.grossSalary * percentage) / 100;
   }

   public String toString() {
           return this.name + ", " + String.format("%.2f", netSalary());
   }
}