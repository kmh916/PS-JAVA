package backjoon;

import java.util.Scanner;

public class B10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] arr = new int[26];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = word.indexOf((char)(i+97));
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(i!=25) {
				System.out.print(arr[i]+" ");
			} else {
				System.out.print(arr[i]);
			}
		}
		
		
	}
}
