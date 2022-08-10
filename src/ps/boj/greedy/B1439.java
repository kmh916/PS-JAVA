package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;

public class B1439 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		
		char prev = ' ';
		
		int cnt_zero = 0;
		int cnt_one = 0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='0'&& prev != '0') {
				prev = '0';
				cnt_zero++;
			} else if(str.charAt(i)=='1' && prev != '1') {
				prev = '1';
				cnt_one++;
			}
		}
		int result = (cnt_zero+cnt_one) == 1?1:Math.min(cnt_zero, cnt_one);
		System.out.println(result);
	}
}
