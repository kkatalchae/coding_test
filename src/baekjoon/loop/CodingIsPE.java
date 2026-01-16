package baekjoon.loop;

import java.util.Scanner;

public class CodingIsPE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n =  scan.nextInt();

		String stringBuilder = "long ".repeat(Math.max(0, n / 4))
			+ "int";

		System.out.println(stringBuilder);
	}
}
