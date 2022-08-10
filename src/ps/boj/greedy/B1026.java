package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B1026 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input_arrA = br.readLine().split(" ");
		String[] input_arrB = br.readLine().split(" ");
		
		ArrayList<Integer> listA = new ArrayList<>(n);
		ArrayList<Integer> listB = new ArrayList<>(n);
		
		for(int i=0; i<n; i++) {
			listA.add(Integer.parseInt(input_arrA[i]));
			listB.add(Integer.parseInt(input_arrB[i]));
		}
		Collections.sort(listA);
		Collections.sort(listB,Collections.reverseOrder());
	
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += listA.get(i)*listB.get(i);
		}
		System.out.println(sum);
		
	}
}
