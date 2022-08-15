package ps.boj.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2446 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=n; i>0;i--){

            for(int j = 0; j<n-i;j++){
                System.out.print(" ");
            }

            for(int j = 0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=1; i<n;i++){

            for(int j = 0; j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }
            if(i!=n-1) System.out.println();
        }



    }
}
