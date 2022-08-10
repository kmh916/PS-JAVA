package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1541 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] splittedByMinus = input.split("-");
		int[] arr_sum = new int[splittedByMinus.length];
		for(int i = 0; i<splittedByMinus.length;i++) {
			String[] arr_str =splittedByMinus[i].split("\\+");
			for (String s : arr_str) {
				// Integer.parseInt("0000102011") == 102011
				arr_sum[i] += Integer.parseInt(s);
			}
		}
		
		int result = arr_sum[0];
		for(int i =1;i<arr_sum.length;i++) {
			result -=arr_sum[i];
		}
		System.out.println(result);
	}
}
