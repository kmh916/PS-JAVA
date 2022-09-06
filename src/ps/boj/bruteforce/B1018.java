package mylab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1018 {
	
	static int min = 64;
	static boolean[][] arr_board;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken()); 
		int m = Integer.parseInt(st.nextToken());
		
		// true : W , false : B 
		
		arr_board = new boolean[n][m];  
				
		for(int i = 0; i < n; i++) {
			String input = br.readLine();
			for(int j = 0; j < m; j++) {
				char c = input.charAt(j);
				arr_board[i][j] = (c=='W');
			}
		}
		execute(n, m);
		System.out.println(min);
	}
	
	private static void execute(int n, int m) {
		int x = n -7;
		int y = m -7;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				updateMin(copyArray(i,j));
			}
		}
	}
	
	private static boolean[][] copyArray(int startRow,int startColumn){
		boolean[][] copiedArray = new boolean[8][8];
		for(int i = 0; i < 8; i++) {
			System.arraycopy(arr_board[i+startRow], startColumn, copiedArray[i], 0, 8);
		}
		return copiedArray;
	}
	
	private static int getCount(boolean[][] arr_board) {
		
		// 색칠 횟수
		int count = 0;
		boolean first = arr_board[0][0];
		
		for(int i = 0; i<8; i++) {
			
			boolean head = arr_board[i][0];
			
			if(i%2==0) {
				if(!head == first) {
					count++;
					head = !head;
					arr_board[i][0] = head;
				}
			} else {
				if(head == first) {
					count++;
					head = !head;
					arr_board[i][0] = head;
				}
			}
			
			
			for(int j = 1; j < 8; j++) {
				if(arr_board[i][j] == head) {
					count++;
					arr_board[i][j] = !arr_board[i][j];
				}
				head = arr_board[i][j];
			}
		}
		// !! 예제 입 출력 4번의 경우 !!
		// ### count가  32보다 클경우 (모두 같은색일때 32) 모두 반대의 색으로 칠하는게(64-count) 
		// 더 작기 때문에 Math.min(count, 64-count)을 리턴한다. ###
		return Math.min(count, 64-count);
	}
	
	private static void updateMin(boolean[][] arr_board) {
		
		min = Math.min(min, getCount(arr_board));
	}
}
