package backjoon;

import java.util.Scanner;

public class B2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int r = 0;
		sc.nextLine();
		for(int i = 0; i < t; i++) {
			String result = "";
			String str = sc.nextLine();
			r = Integer.parseInt(str.split(" ")[0]);
			str = str.split(" ")[1];
			
			for (int j = 0; j < str.length(); j++) {
				for (int j2 = 0; j2 < r; j2++) {
					result += str.charAt(j);
				}
			}
			System.out.println(result);
		}
	}
}
