package Domashnie;

public class Zadacha_3 {
    public static void main(String[] args) {
        int[] arrOne = new int[10];
        int[] arrTwo = new int[10];

        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = i + 9;
        }
        for (int i = 0; i < arrOne.length; i++) {
            System.out.print(arrOne[i] + " ");

        }

        System.out.println();

        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = i + 15;
        }
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.print(arrTwo[i] + " ");
        }

        System.out.println();

        int[] arrThree = new int[10];

        for (int i = 0; i < arrThree.length; i++) {
            arrThree[i] = arrOne[i] + arrTwo[i];
            System.out.print(arrThree[i] + " ");

        }

    }
}

