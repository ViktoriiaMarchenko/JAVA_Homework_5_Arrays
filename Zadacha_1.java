package Domashnie;

public class Zadacha_1 {
    public static void main(String[] args) {

        int[] massive = new int[3];


        for (int i = 0; i < massive.length; i++) {
            massive[i] = i * 2;
        }
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }

        revers();
    }


    static void revers() {
        int[] massive2 = new int[3];


        for (int i = massive2.length - 1; i >= 0; i--) {
            massive2[i] = i * 2;
        }
        for (int i = massive2.length - 1; i >= 0; i--) {
            System.out.println(massive2[i]);
        }
    }
}

