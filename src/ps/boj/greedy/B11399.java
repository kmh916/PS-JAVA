package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class B11399 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		IntStream.range(0, n).forEach(
					i -> list.add(Integer.parseInt(input[i]))
				);
		Collections.sort(list);
		
		int sum = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				sum += list.get(j);
			}
		}
		System.out.println(sum);
	}
}