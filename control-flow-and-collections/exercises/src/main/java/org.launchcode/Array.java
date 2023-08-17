package org.launchcode;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] sixElements = {1, 1, 2, 3, 5, 8};
        int[] oddNum;
        for (int i = 0; i < sixElements.length; i ++) {
            if (sixElements[i] % 2 != 0) {
                System.out.println(sixElements[i]);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
