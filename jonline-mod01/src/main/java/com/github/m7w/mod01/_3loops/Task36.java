package com.github.m7w.mod01._3loops;

/**
 * 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
class Task36 {

	public static void main(String[] args) {

		for (char c = 0; c < 0x00FF; c++) {
			System.out.printf("%c <-> '\\u%04x'\n", c, (int) c);
		}
	}
}
