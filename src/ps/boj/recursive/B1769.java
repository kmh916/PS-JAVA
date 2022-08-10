package ps.boj.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1769 {
	public static int cnt = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		int result = firstConvert(x);
		result = f1(result);
		System.out.println(cnt);
		System.out.println(result%3==0?"YES":"NO");
	}
	
	public static int f1(int x) {
		
		if(x/10 != 0) {
			return f1(getSum(x));
		} 
		return x;
	}
	
	public static int getSum(int x) {
		String str = String.valueOf(x);
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i)-48;
		}
		cnt++;
		return sum;
	}
	
	public static int firstConvert(String x) {
		int sum = 0;
		if(x.length()>1) {
			for (int i = 0; i < x.length(); i++) {
				sum += x.charAt(i)-48;
			}
			cnt++;
			return sum;
		}
		return Integer.parseInt(x);
	}
}
