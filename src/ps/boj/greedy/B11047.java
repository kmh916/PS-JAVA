package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B11047 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i =0; i<n;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int remain = m;
		int count = 0;
		for(int i = n-1; i>=0; i--) {
			if(remain<list.get(i)) continue;
			else {
				count += remain/list.get(i);
				remain -= remain/list.get(i)*list.get(i);
			}
			if(remain == 0) break;
		}
		System.out.println(count);
	}
}
