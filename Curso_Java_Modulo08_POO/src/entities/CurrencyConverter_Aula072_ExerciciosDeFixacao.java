package entities;

public class CurrencyConverter_Aula072_ExerciciosDeFixacao {

    public static double dollarExchangeRate;
    public static double buyedCurrency;

    public static double tax = 6;

   public static double calculator(){
       buyedCurrency += (buyedCurrency * tax)/100;
       return buyedCurrency * dollarExchangeRate;
   }
}