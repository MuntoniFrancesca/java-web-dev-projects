package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
            MenuItem item1 = new MenuItem(8.99, "Good", "Main", true);
            MenuItem item2 = new MenuItem(4.00, "Delicious", "Dessert", false);
            MenuItem item3 = new MenuItem(8.99, "Good", "Main", true);

        System.out.println(item1.toString());
    }
}
