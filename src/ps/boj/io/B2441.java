package ps.boj.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2441 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n;i++){

            for(int j = 0; j<i;j++){
                System.out.print(" ");
            }
            for(int j = n-i; j>0;j--){
                System.out.print("*");
            }
            if(i!=n-1)  System.out.println();
        }

    }
}
