package com.github.m7w.mod02._4decomp;

/**
 *7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
class Task47 {

    public static void main(String[] args) {
        
        int facSum = 0;

        for (int i = 1; i < 10; i += 2) {
            facSum += factorial(i);
        }
        System.out.println("Сумма факториалов: " + facSum);
    }

    public static int factorial(int n) {

        int fac = 1;

        for (int i = 1; i <= n ; i++) {
            fac *= i;    
        }
        
        return fac;
    }
}
