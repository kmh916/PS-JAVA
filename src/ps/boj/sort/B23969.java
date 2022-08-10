package ps.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B23969 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine()," "); 
		StringTokenizer st2 = new StringTokenizer(br.readLine()," "); 
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = Integer.parseInt(st1.nextToken());
		int k = Integer.parseInt(st1.nextToken());
		
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st2.nextToken()));
		}
		
		B23969.printResult(B23969.bubbleSort(list, k));
	}
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list, int k){
		int cnt = 0;
		
		for (int i = 0; i < list.size()-1; i++) {
			boolean isSwap = false;
			for (int j = 0; j < list.size()-1-i; j++) {
				if(list.get(j)>list.get(j+1)) {
					isSwap = true;
					cnt++;
					Collections.swap(list, j, j+1);
				}
				if(cnt == k) return list;
			}
			if(!isSwap) break;
		}
		if(cnt<k) return null;
		return list;
	}
	
	public static void printResult(ArrayList<Integer> list) {
		if(list == null) {
			System.out.println(-1);
			return;
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(i!=list.size()-1) {
				System.out.print(list.get(i)+" ");
			} else {
				System.out.print(list.get(i));
			}
			
		}
	}
}
