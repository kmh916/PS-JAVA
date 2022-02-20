package backjoon;

import java.util.Scanner;

public class B2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int num1 = Integer.parseInt(input.split(" ")[0]);
		int num2 = Integer.parseInt(input.split(" ")[1]);
		int multi = num1*num2;
		
		while(true) {
			int temp = 0;
			if(num1%num2==0) {
				break;
			} else {
				temp = num2;
				num2 = num1%num2;
				num1 = temp;
			}
			
		}
		
		System.out.println(num2);
		System.out.println(multi/num2);
	}
}
