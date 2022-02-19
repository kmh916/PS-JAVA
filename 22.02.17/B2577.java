package backjoon;

import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a*b*c;
		int[] arr = new int[10];
		String str = String.valueOf(result);
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if(str.charAt(i)==j+48) arr[j]++; 
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}