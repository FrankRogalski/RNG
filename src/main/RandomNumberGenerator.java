package main;

import java.util.Scanner;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Generator g = new Generator();
		System.out.print("max: ");
		int div = Integer.parseInt(sc.nextLine());

		while (true) {
			System.out.print(g.nextInt(div));
			sc.nextLine();
		}
	}
}
