package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1755 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr_word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String input = sc.nextLine();
		
		int m = Integer.parseInt(input.split(" ")[0]); 
		int n = Integer.parseInt(input.split(" ")[1]); 
		String[] arr_target = new String[n-m+1];
		String[] arr_result = new String[n-m+1];	
		for (int i = 0; i < arr_target.length; i++) {
			if((m+i)/10>0) {
				arr_target[i] = arr_word[(m+i)/10];
				arr_target[i] += " "+arr_word[(m+i)%10];
			} else {
				arr_target[i] = arr_word[(m+i)%10];
			}
		}
		
		Arrays.sort(arr_target);
		
		for (int i = 0; i < arr_target.length; i++) {
			if(arr_target[i].length()>5) {
				for (int j = 0; j < arr_word.length; j++) {
					if(arr_target[i].split(" ")[0].equals(arr_word[j])) {
						arr_result[i] = String.valueOf(j); 
					}
				}
				for (int j = 0; j < arr_word.length; j++) {
					if(arr_target[i].split(" ")[1].equals(arr_word[j])) {
						arr_result[i] += j; 
					}
				}
				
			} else {
				for (int j = 0; j < arr_word.length; j++) {
					if(arr_target[i].equals(arr_word[j])) {
						arr_result[i] = String.valueOf(j);
					}
				}
			}
		}
		for (int i = 0; i < arr_result.length; i++) {
			System.out.print(arr_result[i]);
			if(i%10!=9) System.out.print(" ");
			
			if(i%10==9&&i!=0) System.out.println(); 
		}
	}
}
