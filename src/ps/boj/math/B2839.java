package ps.boj.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2839 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if(n == 4 || n == 7) {
			System.out.println(-1);
			return;
		}
		
		switch(n%5) {
		case 0 : 
			System.out.println(n/5); 
			break;
		case 1 : 
		case 3 : 
			System.out.println(1+n/5);
			break;
		case 2 : 
		case 4 : 
			System.out.println(2+n/5);
			break;
		}
		
	}
}
