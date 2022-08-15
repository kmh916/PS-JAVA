package ps.boj.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10992 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for(int j = 0; j<2*i+1; j++){
                if(i==0 || i==n-1){
                    System.out.print("*");
                } else if(j == 0 || j == 2*i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            if(i!=n-1) System.out.println();
        }
    }
}
