package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */
class Task412 {

    public static void main(String[] args) {

        int K, N;
        RArrayInt A = new RArrayInt();

        K = inputFromConsole("Введите число K: ");
        N = inputFromConsole("Введите число N: ");

        for (int i = 1; i < N; i++) {
            int ds = digitsSum(i);
            if (ds == K) {                
                A.append(i);
            }
        }

        int[] array = A.toArray();

        System.out.println("А: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int inputFromConsole(String message) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int i;
        
        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.out.println("Введено неверное число. " + message);
            sc.next();
        }
        i = sc.nextInt();

        return i;
    }

    public static int digitsSum(int num) {

        int sum = 0;

        do {
            sum += getTail(num);
            num = getHead(num);
        } while (num > 0);

        return sum;
    }

    public static int getTail(int num) {

        return num % 10;
    }

    public static int getHead(int num) {

        return num / 10;
    }

}
