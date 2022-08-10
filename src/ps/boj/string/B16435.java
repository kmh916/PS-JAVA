package ps.boj.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B16435 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int l = Integer.parseInt(input1[1]);
		List<Integer> list_h = new ArrayList<>();
		for(int i = 0; i<n;i++) {
			list_h.add(Integer.parseInt(input2[i]));
		}
		
		Collections.sort(list_h);
		
		for(int i:list_h) {
			if(i<=l) {
				l++;
			}
		}
		System.out.println(l);
	}
}
