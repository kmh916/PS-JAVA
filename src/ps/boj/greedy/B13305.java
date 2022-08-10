package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B13305 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		int[] arr_dist = new int[n-1];
		int[] arr_oilPrice = new int[n];
		
		for(int i = 0;i<arr_dist.length; i++ ) {
			arr_dist[i] = Integer.parseInt(input1[i]);
		}
		for(int i = 0;i<arr_oilPrice.length; i++ ) {
			arr_oilPrice[i] = Integer.parseInt(input2[i]);
		}
		
		Long result = 0L;
		for(int i=0;i<arr_dist.length;i++) {
			result += arr_dist[i]* arr_oilPrice[i];
		}
		System.out.println(result);
	}
}
