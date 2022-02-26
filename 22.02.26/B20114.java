package backjoon;

import java.util.Scanner;

public class B20114 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int n = Integer.parseInt(input.split(" ")[0]);
		int h = Integer.parseInt(input.split(" ")[1]);
		int w = Integer.parseInt(input.split(" ")[2]);
		
		String[] arr = new String[h];
		int cnt = 0;
		char[] arr_char = new char[n];
		
		for (int i = 0; i < arr_char.length; i++) {
			arr_char[i] = '1';
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n*w; j+=w) {
				
				for (int k = 0; k < w; k++) {
					if(arr[i].substring(j, j+w).charAt(k)!='?') {
						arr_char[j/w] = arr[i].substring(j, j+w).charAt(k);
						break;
					} else {
						cnt++;
					}
					
					if(cnt==w) {
						cnt = 0;
						if(arr_char[j/w]=='1') {
							arr_char[j/w] = '?';
						}
						
						
					}
				}
				
			}
			
		}
		System.out.println(new String(arr_char));
		
	}
}
