package entities;

public class Radius_Aula070E71_MembrosEstaticosVersao4Teste {

    public static final double PI = 3.14159;  // Constante. NAO MUDA
    public static double radius;

   public static double circumference(){
       return 2.0 * PI * radius;
   }
   public static double volume(){
        return 4.0 * PI * Math.pow(radius,3) / 3.0;
   }


   public String toString() {
           return  "Circumference = " + String.format("%.2f", circumference())
                   +"\nVolume: " + String.format("%.2f", volume())
                   + "\nPI value: " + String.format("%.2f", PI);
   }
}