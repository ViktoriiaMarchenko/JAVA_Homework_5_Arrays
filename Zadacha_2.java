package Domashnie;

public class Zadacha_2 {

    public static void main(String[] args) {
        int[] arr = new int[]{15, 16, 17, 18, 19, 20};

        int sum = 0;
        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 - 1 == 0) {
                n++;                               // the quantity of odd elements of the array
                sum += arr[i];                     // sum of the odd elements of the array

                System.out.println("Odd elements: " + (i + 1) + " element = " + arr[i]);
            }
        }

        System.out.println("Odd elements quantity = " + n);
        System.out.println("Sum of the odd elements = " + sum);
    }
}