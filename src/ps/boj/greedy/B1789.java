package ps.boj.greedy;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1789 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long s = Long.parseLong(br.readLine());
		
		Long num = 0L;
		int i = 1;
		int count = 0;
		while(true) {
			
			if(num>s) 
				break;
			
			num += i++;
			count++;
		}
		System.out.println(count-1);
	}
}

