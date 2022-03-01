package backjoon;

import java.util.Scanner;

public class B4949 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String input = sc.nextLine();
			if(input.equals(".")) break;
			String str = "";
			for (int i = 0; i < input.length(); i++) {
				if(input.charAt(i)==40||input.charAt(i)==41) {
					str += input.charAt(i);
				} else if(input.charAt(i)==91||input.charAt(i)==93) {
					str += input.charAt(i);
				}
			}
			
			while(str.contains("()")||str.contains("[]")) {
				str = str.replaceFirst("\\(\\)", "");
				str = str.replaceFirst("\\[\\]", "");
			}
			
			System.out.println(str);
			System.out.println(str.length());
			
			System.out.println(str.length()==0?"yes":"no");
		}
	}
}
