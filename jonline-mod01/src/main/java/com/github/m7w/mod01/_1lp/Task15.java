package com.github.m7w.mod01._1lp;

import java.util.Scanner;

/**
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 *  данное значение длительности в часах, минутах и секундах в следующей форме:
 *  ННч ММмин SSc.
 */
public class Task15 {

    public static void main(String[] args) {
        
        long T;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число T: ");
        while(!sc.hasNextLong()) {
            System.out.print("Введено неверное значение. Введите T: ");
            sc.next();
        }
        T = sc.nextLong();

        if (T > 359999) {
            System.out.println("Введенное количество секунд превышает 99ч 59мин 59с.");
            sc.close();
            return;
        }

        long ss = T % 60;
        long mm = ((T % 3600) - ss) / 60;
        long hh = (T - (T % 3600)) / 3600;
        System.out.printf("%02dч %02dмин %02dс.\n",  hh, mm, ss);
        sc.close();
    }
}
