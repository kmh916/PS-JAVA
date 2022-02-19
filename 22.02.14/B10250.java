package backjoon;

import java.util.Scanner;

public class B10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < t; i++) {
			String input = sc.nextLine();
			String result = "";
			//층수
			int h = Integer.parseInt(input.split(" ")[0]);
			//방수
			int w = Integer.parseInt(input.split(" ")[1]);
			//몇번째 손님인지
			int n = Integer.parseInt(input.split(" ")[2]);
			
			if(n%h==0) {
				result += String.valueOf(h);
			}else {
				result += String.valueOf(n%h);
			}
			
			if(Math.ceil((double)n/h)>=10) {
				result += (int)Math.ceil((double)n/h);
			} else {
				result += "0"+ (int)Math.ceil((double)n/h);
			}
			
			System.out.println(result);
		}
		
	}
}
