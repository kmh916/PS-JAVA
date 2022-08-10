package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1049 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		int result = 0;
		
		
		int price_set = Integer.MAX_VALUE;
		int price_each = Integer.MAX_VALUE;
		
		for(int i = 0; i<m; i++) {
			String[] input = br.readLine().split(" ");
			int target_set = Integer.parseInt(input[0]);
			int target_each = Integer.parseInt(input[1]);
			if(target_set<price_set) {
				price_set = target_set;
			}
			if(target_each<price_each) {
				price_each = target_each;
			}
		}
		
		if(price_each*6 > price_set) {
			int breakEven = price_set / price_each;
			if(n>=6) {
				result += n/6*price_set;
			}
			
			if(n%6<=breakEven) {
				result += n%6*price_each;
			} else {
				result += price_set;
			}
		} else {
			result = price_each * n;
		}
		
		
		System.out.println(result);
		
	}
}
