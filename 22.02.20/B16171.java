package backjoon;

import java.util.Scanner;

public class B16171 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		String word = sc.next();
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)>=48&&input.charAt(i)<=57) {
				input = input.replace(String.valueOf(input.charAt(i)),"");
				i--;
			}
		}
		
		if(input.contains(word)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
}
