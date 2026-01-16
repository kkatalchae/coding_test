package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.parseInt(st.nextToken());
		int max = min;

		while(st.hasMoreTokens()) {
			int x = Integer.parseInt(st.nextToken());

			if (x < min) min = x;
			if (x > max) max = x;
		}

		System.out.println(min + " " + max);
	}
}
