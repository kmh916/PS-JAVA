package ps.boj.math;

import java.util.HashSet;
import java.util.Scanner;

public class B3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> arr = new HashSet<>();
		for (int i = 0; i < 10; i++) {
		    arr.add(sc.nextInt()%42); 
		}
		System.out.println(arr.size());
	}

}
