package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


// 30의 배수 : 3의 배수 && 10의 배수
// 3의 배수 : 모든 자릿수의 합이 3의 배수
// 10의 배수 : 끝자리가 0


public class B10610 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		
		if(!n.contains("0")) {
			System.out.println(-1);
			return;
		}
		
		char[] arr_char = n.toCharArray();
		int sum = 0;
		for(char c : arr_char) {
			sum += Character.getNumericValue(c);
		}
		
		if(sum%3 !=0) {
			System.out.println(-1);
			return;
		}
		
		Arrays.sort(arr_char);
		System.out.println(new StringBuilder(new String(arr_char)).reverse().toString());
		
	}
}
