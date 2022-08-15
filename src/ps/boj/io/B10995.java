package ps.boj.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10995 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            if(i%2==1) printOdd(n);
            else printEven(n);
        }

    }
    private static void printEven(int n){
        StringBuilder sb = new StringBuilder("*");
        for(int i=1; i<n;i++){
            sb.append(" *");
        }
        System.out.println(sb.toString());
    }
    private static void printOdd(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n;i++){
            sb.append(" *");
        }
        System.out.println(sb.toString());
    }
}
