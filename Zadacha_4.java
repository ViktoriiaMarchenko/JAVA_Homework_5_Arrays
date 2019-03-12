package Domashnie;

import java.util.Arrays;

public class Zadacha_4 {

    public static void main(String[] args) {
        int[] array = {28, 16, 80, 90, -43, 0, -4, 0, -700, 54, -55, 0, -65};
        filtr(array);
    }

    private static void filtr(int[] array) {
        int positive = 0;
        int negative = 0;
        for (int elem : array) {
            if (elem > 0) positive++;
            else if (elem < 0) negative++;
        }

        int[] allPositive = new int[positive];
        int[] allNegative = new int[negative];
        positive = 0;
        negative = 0;

        for (int elem : array) {
            if (elem > 0) allPositive[positive++] = elem;
            else if (elem < 0) allNegative[negative++] = elem;
        }

        System.out.println("Positive: " + Arrays.toString(allPositive));
        System.out.println("Negative: " + Arrays.toString(allNegative));
    }

}
