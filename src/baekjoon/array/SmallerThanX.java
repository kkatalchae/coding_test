package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SmallerThanX {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		StringBuilder builder = new StringBuilder();

		for  (int i = 0; i < n; i++) {
			int y =  Integer.parseInt(st2.nextToken());
			if(y < x) builder.append(y).append(" ");
		}

		builder.deleteCharAt(builder.length()-1);

		System.out.println(builder);
	}
}
