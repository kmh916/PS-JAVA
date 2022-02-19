package backjoon;

import java.util.Scanner;

public class B1417 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int cnt=0;
		int max = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>=max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		
		while(true) {
			
			if(maxIndex==0) {
				break;
			} else {
				arr[maxIndex]--;
				arr[0]++;
				cnt++;
			}
			
			max = 0;
			
			for (int i = 0; i < n; i++) {
				if(arr[i]>=max) {
					max = arr[i];
					maxIndex = i;
				}
			}
			
		}
		
		
		
		System.out.println(cnt);
	}
}
