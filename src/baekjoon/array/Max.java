package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(br.readLine());
		int index = 1;

		for (int i = 1; i < 9; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x > max) {
				max = x;
				index = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(index);

	}
}
