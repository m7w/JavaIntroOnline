package com.github.m7w.mod01._1lp;

import java.util.Scanner;

/**
 * 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 *    принадлежит закрашенной области, и false — в противном случае.
 */
public class Task16 {

    public static void main(String[] args) {

        boolean result;
        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите x: ");
        while(!sc.hasNextInt()) {
            System.out.print("Введено неверное значение, введите x: ");
            sc.next();
        }
        x = sc.nextInt();

        System.out.print("Введите y: ");
        while(!sc.hasNextInt()) {
            System.out.print("Введено неверное значение, введите y: ");
            sc.next();
        }
        y = sc.nextInt();
        
        result = !((x == 0 && y == -1) || (y > 4 || y < -3) ||
                  (y > 0 && (x < -2 || x > 2)) || (x < -4 || x > 4));

        sc.close();
        System.out.println(result);
    }
}
