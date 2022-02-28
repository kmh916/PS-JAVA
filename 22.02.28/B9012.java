package backjoon;

import java.util.Scanner;

public class B9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			String input = sc.next();
			String result = "";
			
			
			while(input.contains("()")) {
				input = input.replaceFirst("\\(\\)", "");
			}
			
			System.out.println(input.length()==0?"YES":"NO");
		}
	}
}
