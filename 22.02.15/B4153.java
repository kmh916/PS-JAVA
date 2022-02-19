package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			String input = sc.nextLine();
			int[] arr_num = new int[3];
			int sum=0;
			for (int i = 0; i < 3; i++) {
				arr_num[i] = Integer.parseInt(input.split(" ")[i]);
				sum+= arr_num[i];
			}
			Arrays.sort(arr_num);
			
			if(sum==0) break;
			
			if(Math.pow(arr_num[0],2)+Math.pow(arr_num[1], 2)==Math.pow(arr_num[2], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
			
		}
	}
}
