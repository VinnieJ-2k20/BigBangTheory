package com.gmail.ptimofejev;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<String>();
		queue.addLast("Sheldon");
		queue.addLast("Leonard");
		queue.addLast("Wolowits");
		queue.addLast("Koothrappali");
		queue.addLast("Penny");
		System.out.println(queue);
		int cups = 0;
		System.out.println("Input the amount of Cola cups provided by vending machine: ");
		try (Scanner scan = new Scanner(System.in)) {
			cups = scan.nextInt();
			if (cups < 0) {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException | IllegalArgumentException e) {
			System.out.println("Wrong input, try again");
		}
		for (int i = 0; i < cups; i++) {
			drinkCola(queue);
		}
		System.out.println(queue);

	}

	public static void drinkCola(ArrayDeque<String> source) {
		String geek = source.pollFirst();
		source.addLast(geek);
		source.addLast(geek);
	}

}
