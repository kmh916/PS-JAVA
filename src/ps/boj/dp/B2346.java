package mylab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 	N	상근	창영  결과	
	1	1		상근
	2	1	1	창영
	3	3		상근
	4	4		상근
	
	돌이 N (N>5) 개일때 상근이의 승패여부는 상근이가 N개에서 1개 || 3개 || 4개를 가져갔을때의
	결과가 상근이의 패배라면 승리이다.
	
	이게 뭔소리냐면...
	
	상근이가 돌을 가져가고 나서 
	
	돌이 N-1,N-3,N-4인 상태로 창영이부터 게임을 시작한다고 가정하면
	N-1,N-3,N-4의 승패여부를 뒤집어서 생각할 수 있다.
	 
	3가지의 경우중 창영이가 승리한 케이스가 있다면 돌이 N개일때 상근이의 승리이고 아니면 창영이의 승리이다.
	
 * 
 * */
public class B9656 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		boolean[] arr_winOfSK = new boolean[1001];
		
		arr_winOfSK[1] = true;
		arr_winOfSK[3] = true;
		arr_winOfSK[4] = true;
		
		for(int i = 5; i <= n ; i++) {
			if(!arr_winOfSK[i-4]) 
				arr_winOfSK[i] = true;
			else if(!arr_winOfSK[i-3])
				arr_winOfSK[i] = true;
			else if(!arr_winOfSK[i-1])
				arr_winOfSK[i] = true;
		}
		System.out.println(arr_winOfSK[n]?"SK":"CY");
	}
}
