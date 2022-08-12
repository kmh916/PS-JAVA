package ps.boj.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
*       n = 1  -> 1
*       n = 2 -> 1+1 , 2  -> 2
*       n = 3 -> 1+1+1 , 1+2 , 2+1 , 3 -> 4
*       n = 4 -> 1+1+1+1 , (2+1+1)*3 , 2+2 , (3+1)*2 ->7
*       n = 5 -> 1+1+1+1+1 , (2+1+1+1)*4 , (2+2+1)*3 , (3+2)*2 , (3+1+1)*3 -> 13
*
*      f(1) = 1
*      f(2) = 2
*      f(3) = 4
*      f(n) = f(n-1) + f(n-2) + f(n-3)
*
* */

public class B9095 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4;i<12;i++){
            dp[i] = dp[i-1] +dp[i-2] +dp[i-3];
        }

        for(int i = 0;i<t;i++ ){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);

        }

    }
}
