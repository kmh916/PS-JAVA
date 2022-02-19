package backjoon;

import java.util.Scanner;

public class B2869 {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int v = sc.nextInt();
	      
	      double finalLoc = v-a;
	      int c = a-b;
	      
	      System.out.println((int)(Math.ceil(finalLoc/c)+1));
	      
	   
	   }
}
