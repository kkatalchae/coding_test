package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusBMinus8 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int caseCount = Integer.parseInt(reader.readLine());

		for (int i = 0; i < caseCount; i++) {
			String[] temp = reader.readLine().split(" ");

			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);

			stringBuilder.append("Case #")
				.append(i + 1)
				.append(": ")
				.append(a)
				.append(" + ")
				.append(b)
				.append(" = ")
				.append(a + b)
				.append("\n");
		}

		reader.close();
		System.out.println(stringBuilder);
	}
}

