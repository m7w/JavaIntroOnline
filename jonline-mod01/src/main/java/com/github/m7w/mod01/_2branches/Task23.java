package com.github.m7w.mod01._2branches;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class Task23 {
    
	public static void main(String[] args) {

		double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Введите координаты точки A(x1, y1): ");
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			System.out.print("Введите координаты точки B(x2, y2): ");
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			System.out.print("Введите координаты точки C(x3, y3): ");
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Введены неправильные значения.");
			return;
		} finally {
			sc.close();
		}

		if ((y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1)) {
			System.out.println("Точки лежат на одной прямой.");
		} else {
			System.out.println("Точки не лежат на одной прямой.");
		}
	}
}
