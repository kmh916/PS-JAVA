package b_1817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		
		if(n == 0) {
			System.out.println(0);
			return;
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		int[] arr_weight = new int[n];
		for (int i = 0; i<n; i++) {
			arr_weight[i] = Integer.parseInt(st2.nextToken());
		}
		
		int remainWeight = m;
		int result = 1;
		for(int weight : arr_weight) {
			if(weight>remainWeight){
				result++;
				remainWeight = m ;
			}
			if(weight<=remainWeight) {
				remainWeight -= weight;
			}
		}
		System.out.println(result);
	}
}
