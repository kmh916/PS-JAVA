package backjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class B2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list_h = new ArrayList<>();
		int sum = 0;
		int[] arr_target = new int[2];
		
		for (int i = 0; i < 9; i++) {
			list_h.add(sc.nextInt());
			sum += list_h.get(i);
		}

		for (int i = 0; i < 9; i++) {
			for (int j = i+1; j < 9; j++) {
				if(sum-list_h.get(i)-list_h.get(j)==100) {
					arr_target[0] = list_h.get(i);
					arr_target[1] = list_h.get(j);
				}
			}
		}
		
		list_h.remove((Object)arr_target[0]);
		list_h.remove((Object)arr_target[1]);
		//오름차순정렬
		list_h.sort(Comparator.naturalOrder());
		for (int i = 0; i < list_h.size(); i++) {
			System.out.println(list_h.get(i));
		}
	}
}











