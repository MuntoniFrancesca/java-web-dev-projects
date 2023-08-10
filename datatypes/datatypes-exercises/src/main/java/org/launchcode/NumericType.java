package org.launchcode;
import java.util.Scanner;
public class NumericType {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles you have driven: ");
        Double miles = input.nextDouble();

        System.out.println("How much gas you've consumed: ");
        Double gas = input.nextDouble();

        Double mpg = miles/gas;
        System.out.println ("Miles per gallon: " + mpg + " mpg");
    }
}