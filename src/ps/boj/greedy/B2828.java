package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2828 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		int j = Integer.parseInt(br.readLine());
		
		int left_basket = 1;
		int right_basket = m;
		int count_move = 0;
		for(int i = 0; i<j;i++) {
			int loc_apple = Integer.parseInt(br.readLine());
			if(loc_apple>=left_basket&&loc_apple<=right_basket) {
				continue;
			} else if(loc_apple<left_basket){
				count_move += (left_basket-loc_apple);
				left_basket = loc_apple;
				right_basket = left_basket+m-1;
			} else if(loc_apple>right_basket) {
				count_move += (loc_apple-right_basket);
				right_basket = loc_apple;
				left_basket = right_basket-m+1;
			}
		}
		System.out.println(count_move);
	}
}
