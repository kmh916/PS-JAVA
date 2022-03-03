package backjoon;

import java.util.Scanner;

public class B1343 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
//		int cnt = 0;
//		for (int i = 0; i < input.length(); i++) {
//			if(input.charAt(i)=='X') cnt++;
//			
//				if(cnt%4==0) {
//					input = input.replaceFirst("XXXX", "AAAA");
//					cnt -= 4;
//				}
//				if(cnt%2==0) {
//					input = input.replaceFirst("XX", "BB");
//					cnt -= 2;
//				}
//			
//			
//		}
		input = input.replace("XXXX", "AAAA");
		input = input.replace("XX", "BB");
		if(input.contains("X")) {
			System.out.println(-1);
		} else {
			System.out.println(input);
		}
	}
}
