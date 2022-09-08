package mylab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B2164 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			queue.add(i+1);
		}
		
		while (true) {
			if(queue.size() > 1) 
				queue.remove();
			
			if(queue.size() == 1) break;
			
			queue.add(queue.poll());
			
			
		}
		
		System.out.println(queue.poll());
		
	}
}
