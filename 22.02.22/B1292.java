package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class B1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		int result = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < b+1; i++) {
			for (int j = 1; j < i+1; j++) {
				list.add(i);
			}
		}
		
		Character.getNumericValue("asd".charAt(2));
		for (int i = a-1; i < b; i++) {
			result += list.get(i);
		}
		
		
		System.out.println(result);
	}
}
