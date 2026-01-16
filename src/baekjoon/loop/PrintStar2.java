package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar2 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < n; i++) {
			builder.append(" ".repeat(n - (i + 1))).append("*".repeat(i + 1)).append("\n");
		}

		reader.close();
		System.out.println(builder);
	}
}
