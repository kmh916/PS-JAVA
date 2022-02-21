package backjoon;

import java.util.Scanner;

public class B1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		int i = 665;
		
		while(true) {
			i++;
			
			if(String.valueOf(i).contains("666")) {
				cnt++;
			}
			
			if(cnt == n) {
				break;
			}
		
		}
		
		System.out.println(i);
		
	}
}
