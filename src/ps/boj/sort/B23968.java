package ps.boj.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 		String -> List<Char> 
 *      Collections.sort(reverseOrder);
 * 
 * */


public class B23968 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		List<Character> list = new ArrayList<Character>();
		for(int i = 0; i<input.length();i++) {
			list.add(input.charAt(i));
		}
		
		
		Collections.sort(list,Collections.reverseOrder());
		for(char c : list) {
			System.out.print(c);
		}
	}
}
