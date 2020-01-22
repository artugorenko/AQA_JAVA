package Cycles;

import java.util.Scanner;

public class Cycles {

    static Scanner in = new Scanner(System.in);

    public static void factorial(int a) {
        int sum = 1;
        if (a < 0) System.out.println("Нельзя вводить отрицательные числа");
        else if ((a == 0) || (a == 1))
            System.out.println("Факториал числа: 1");
        else {
            for (int i = a; i > 1; i--)
                sum *= i;
            System.out.println("Факториал числа: " + sum);
        }
    }

    public static void main(String[] args) {

        System.out.println("Задание 2.1 - Цикл с постусловием");
        int a = 15;
        do {
            System.out.println(a);
            a--;
        } while (a >= 10);

        a = 15;
        System.out.println("Задание 2.2 - Цикл с предусловием");
        while (a >= 10) {
            System.out.println(a);
            a--;
        }

        System.out.println("Задание 3 - forach");
        int[] intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = (int) (Math.random() * 11);
            if (intArr[i] == 5) System.out.println("Число 5 по индексу " + i);
        }
    }
}
