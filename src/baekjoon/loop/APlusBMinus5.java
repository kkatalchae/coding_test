package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusBMinus5 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();

		while (true) {
			String[] temp = reader.readLine().split(" ");

			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);

			if (a == 0 && b == 0) break;

			builder.append(a+b).append("\n");
		}

		reader.close();
		System.out.println(builder);
	}
}
