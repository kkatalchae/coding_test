package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickAPlusB {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int caseCount = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < caseCount; i++) {
			String[] temp = reader.readLine().split(" ");

			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			builder.append(a+b);
			builder.append("\n");
		}

		reader.close();
		System.out.println(builder);
	}
}
