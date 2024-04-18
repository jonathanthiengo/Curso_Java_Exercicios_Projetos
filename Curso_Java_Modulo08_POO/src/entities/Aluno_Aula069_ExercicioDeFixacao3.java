package entities;

public class Aluno_Aula069_ExercicioDeFixacao3 {

    public String name;
    public double trimestre1;
    public double trimestre2;
    public double trimestre3;



   public double finalGrade(){
       return this.trimestre1 + this.trimestre2 + trimestre3 ;
   }
   public String status(){
       if(finalGrade() >= 60){
           return "PASS";
       }
       else{
           return "FAILED" + "\nMISSING " + String.format("%.2f", missingPoints()) + " POINTS";
       }
   }

    public double missingPoints(){
        return 60 - finalGrade();
    }

   public String toString() {
           return  "FINAL GRADE = " + String.format("%.2f", finalGrade())
                   +"\n" + status();
   }
}