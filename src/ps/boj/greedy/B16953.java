package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
 *     b를 a로 만들기
 *     a == b 일때 반복하면서
 *     1. b가 2의 배수일때 b를 반으로 나눠주고 카운트
 *     2. b의 1의자리 숫자가 1일때 b를 10으로 나눠주고 카운트
 *     3. -> else 의 경우는 성립이 안되므로 -1 break;
 *
 *     진행하다가 b가 a보다 작아지는경우 -1 break;
 *     ex) 4 42 에서 42 -> 21 -> 2 이므로 break; 안해주면 무한루프
 * */

public class B16953 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		long a = Long.parseLong(input[0]);
		long b = Long.parseLong(input[1]);
		
		int cnt = 1;
		
		while(a!=b) {
			
			if(b<a) {
				cnt = -1;
				break;
			}
			
			if(b%2==0) {
				b /= 2; 
				cnt++;
			} else if(b%10 == 1) {
				b /= 10;
				cnt ++;
			} else {
				cnt = -1;
				break;
			}
		}
		System.out.println(cnt);
	}
}
