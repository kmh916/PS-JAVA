package mylab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1021 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		
		int[] seqArray = new int[m];
		for(int i = 0; i<m; i++) {
			seqArray[i] = Integer.parseInt(st2.nextToken());
		}
		
		LinkedList<Integer> deque = new LinkedList<>();
		
		for(int i = 1; i<=n; i++) {
			deque.add(i);
		}
		
		int count = 0;
		for(int i = 0; i<m; i++) {
			
			int index = deque.indexOf(seqArray[i]);
			int center= deque.size() / 2;
			if(center<index) {
				//오른쪽
				for(int j = 0; j<deque.size()-index; j++) {
					deque.addFirst(deque.removeLast());
					count++;
				}
				deque.poll();
			} else if(center>=index) {
				//왼쪽
				for(int j = 0; j<index; j++) {
					deque.addLast(deque.removeFirst());
					count++;
				}
				deque.poll();
			}
		}
		
		System.out.println(count);
	}
}
