package com.github.m7w.mod01._1lp;

import java.util.Scanner;

/**
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа.
 */
public class Task14 {

    public static void main(String[] args) {
        
        double R;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число R вида nnn.ddd: ");
        while(!sc.hasNextDouble()) {
            System.out.print("Введено неверное значение. Введите R вида nnn.ddd: ");
            sc.next();
        }
        R = sc.nextDouble();

        long N = (long) (R * 1000);
        long quotient = N / 1000L;
        long frac = N - quotient * 1000;
        N = frac * 1000 + quotient;
        R = N / 1000.0;
        System.out.println("Новое значение R: " + R);
        sc.close();
    }
}
