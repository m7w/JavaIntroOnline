package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Task44 {

    public static void main(String[] args) {

        int n;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите n: ");
        while(!sc.hasNextInt()) {
            System.out.print("Введено неверное значение. Введите n: ");
            sc.next();
        }
        n = sc.nextInt();

        Task44 t = new Task44();
        Task44.Point[] points = new Point[n];
        System.out.println("Генерируем точки в промежутке [-5, 5).");
        for (int i = 0; i < n; i++) {
            double x = Math.random() * 10 - 5;
            double y = Math.random() * 10 - 5;
            points[i] = t.new Point(x, y);
            System.out.println(points[i]);
        }

        double maxDist = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double dist = distance(points[i], points[j]);
                if (dist > maxDist) {
                    maxDist = dist;
                    a = i;
                    b = j;
                }
            }
        }

        System.out.println("Максимальное расстояние между точками " + 
                            points[a] + " и " + points[b]);
    }

    public static double distance(Point a, Point b) {
        double dist = Math.sqrt(Math.pow((a.x - b.x), 2) + 
                                Math.pow((a.y - b.y), 2));
            return dist;
    }

    class Point {

        private double x;
        private double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return String.format("(%2.3f, %2.3f)", x, y);
        }
    }

}
