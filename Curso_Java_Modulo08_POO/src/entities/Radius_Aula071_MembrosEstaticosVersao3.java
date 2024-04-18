package entities;

public class Radius_Aula071_MembrosEstaticosVersao3 {

    public static final double PI = 3.14159;  // Constante. NAO MUDA

   public static double circumference(double radius){
       return 2.0 * PI * radius;
   }
   public static double volume(double radius){
        return 4.0 * PI * Math.pow(radius,3) / 3.0;
   }

}