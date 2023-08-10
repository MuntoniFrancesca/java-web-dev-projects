package org.launchcode;
import java.util.Scanner;
public class Miles {
    public static void main (int[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles you have driven: ");
        Integer miles = input.nextInt();
        System.out.println("How much gas you've consumed: ");
        Integer gas = input.nextInt();

        Integer milesGallon = miles/gas
        System.out.println ("Miles per gallon: " + milesGallon);
    }
}