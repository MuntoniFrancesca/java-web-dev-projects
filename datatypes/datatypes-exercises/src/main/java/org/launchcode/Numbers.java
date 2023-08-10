package org.launchcode;
import java.util.Scanner;
public class Numbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of rectangle: ");
        Double length = input.nextDouble();
        System.out.println("Width of rectangle: ");
        Double width = input.nextDouble();

        Double rectangle = length * width;
        System.out.println ("The area is: " + rectangle);
    }
}
