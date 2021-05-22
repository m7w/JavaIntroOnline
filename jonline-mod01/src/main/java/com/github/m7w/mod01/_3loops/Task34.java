package com.github.m7w.mod01._3loops;

import java.math.BigInteger;

/**
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
class Task34 {

	public static void main(String[] args) {

		BigInteger p = BigInteger.valueOf(1);

		for (int i = 1; i <= 200; i++) {
			p = p.multiply(BigInteger.valueOf(i * i));
		}
		System.out.println("Произведение квадратов первых двухсот чисел равно " + p);
	}
}
