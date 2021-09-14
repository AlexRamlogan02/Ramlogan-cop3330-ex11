package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //objective: create a program that converts euros to dollars
        Scanner scan = new Scanner(System.in);
        double euro, dollar, rate;
        NumberFormat round = NumberFormat.getCurrencyInstance(); //convert to dollar format
        //dollar / euro = rate
        //dollar = euro * rate
        System.out.print("How many Euros are you exchanging? ");
        euro = scan.nextDouble();
        System.out.print("What is the exchange rate? ");
        rate = scan.nextDouble();
        dollar = euro * rate;;
        System.out.println(euro +" euros at an exchange rate of " +rate +" is " +round.format(dollar) +" US dollars");
    }
}
