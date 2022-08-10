package ps.boj.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1003 {
	
	static Fibonacci[] fibonaccis = new Fibonacci[41];
	
	static class Fibonacci{
		int zero;
		int one;
		public Fibonacci(int zero,int one) {
			this.zero = zero;
			this.one = one;
		}
		
		public static Fibonacci getNext(Fibonacci f1, Fibonacci f2) {
			return new Fibonacci(f1.zero+f2.zero, f1.one+f2.one);
		}

		@Override
		public String toString() {
			return this.zero+" "+this.one;
		}
		
		
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		fibonaccis[0] = new Fibonacci(1,0);
		fibonaccis[1] = new Fibonacci(0,1);
		
		for(int i = 2;i<fibonaccis.length;i++ ) {
			fibonaccis[i] = Fibonacci.getNext(fibonaccis[i-1], fibonaccis[i-2]);
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(fibonaccis[n]);
		}
		
		
	}
	
}
