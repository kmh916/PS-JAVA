package backjoon;

import java.util.Scanner;

public class B1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int[] arr_num = new int[10];
		int max = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < 10; j++) {
				if(input.charAt(i)==j+48) {
					arr_num[j]++;
				}
			}
		}
		
		if(arr_num[6]>arr_num[9]) {
			while(arr_num[6]>arr_num[9]) {
				arr_num[6]--;
				arr_num[9]++;
			}
		} else if(arr_num[6]<arr_num[9]) {
			while(arr_num[6]<arr_num[9]) {
				arr_num[6]++;
				arr_num[9]--;
			}
		}
		for (int i = 0; i < arr_num.length; i++) {
			if(arr_num[i]>max) max = arr_num[i];
		}
		
		System.out.println(max);
	}
}
