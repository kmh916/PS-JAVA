package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B1246 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		ArrayList<Integer> list = new ArrayList<>(m);
		for(int i = 0; i<m; i++) {
			list.add(Integer.parseInt(br.readLine()));

		}
		Collections.sort(list,Collections.reverseOrder());
		
		int max = Integer.MIN_VALUE;
		int price=0;
		for(int i = 0; i<m; i++) {
			int value = (i+1)>n?(n*list.get(i)):(i+1)*list.get(i);
			if(max<value) {
				max = value;
				price = list.get(i);
			}
		}
		
		System.out.println(price+" "+max);
	}
}
