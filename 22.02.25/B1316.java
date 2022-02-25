package backjoon;

import java.util.Scanner;

public class B1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			String word = sc.next();
			
			for (int j = 0; j < word.length(); j++) {
				int cnt = 1;
				boolean flag = false;
				word = word.replace(String.valueOf(word.charAt(j)), "*");
				for (int k = 0; k < word.length(); k++) {
					if(cnt==0&&word.charAt(k)=='*') {
						result++; 
						flag = true;
						break;	
					}
					
					if(word.charAt(k)=='*') {
						cnt = 1;
					} else {
						cnt = 0;
					}
				}
				if(flag) {
					break;
				}
			}
			
			
			
		}
		
		System.out.println(n-result);
		
	}
}
