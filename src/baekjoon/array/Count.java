package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberCount = Integer.parseInt(br.readLine());
		String[] temp = br.readLine().split(" ");
		int number = Integer.parseInt(br.readLine());
		int answer = 0;

		for (int i = 0; i < numberCount; i++) {
			if (Integer.parseInt(temp[i]) == number) {
				answer++;
			}
		}

		br.close();
		System.out.println(answer);
	}
}
