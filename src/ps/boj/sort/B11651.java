package mylab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class B11651 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Coordinate> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			list.add(new Coordinate(br.readLine()));
		}
		
		Collections.sort(list,new Comparator<Coordinate>() {

			@Override
			public int compare(Coordinate o1, Coordinate o2) {
				if(o1.y>o2.y) {
					return 1;
				} else if(o1.y == o2.y) {
					if(o1.x > o2.x) {
						return 1;
					}
				} 
				return -1;
			}
		});
		
		list.forEach(System.out::println);
	}
	
	static class Coordinate{
		int x;
		int y;
		
		public Coordinate(String input) {
			String[] arr = input.split(" ");
			this.x = Integer.parseInt(arr[0]);
			this.y = Integer.parseInt(arr[1]);
		}
		
		@Override
		public String toString() {
			return x+" "+y;
		}
	}
}
