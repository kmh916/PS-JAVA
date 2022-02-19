package backjoon;

import java.util.Scanner;

public class B1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 고정비용
		long a = sc.nextInt();
		//가변비용
		long b = sc.nextInt();
		//판매가
		long c = sc.nextInt();
		
		//마진(1대 팔때마다 남는 금액)
		long margin = c-b;
		
		
		
		//총 비용
		long totalCost = a;
		//영업이익
		//long profit=0;
		//판매 대수
		//long cnt = 0;
		if(b>=c) {
			System.out.println(-1);
		} else {
			System.out.println(totalCost/margin+1);
		}
		
	}
}
