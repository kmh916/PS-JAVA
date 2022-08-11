package ps.boj.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*
*    n          x

    1          1
    2          2
    3          3
    4          5
    5          8

    f(1) = 1
    f(2) = 2
    f(n) = f(n-1)+ f(n-2);

   주의 사항!
   https://www.acmicpc.net/board/view/91259
   값이 커지므로 출력할때 dp[n]%10007로 출력하면 안되고
   메모지에이션할때 %10007 해줘야함
* */
public class B11726 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;

        for(int i = 2; i<n+1;i++){
            dp[i] = (dp[i-1]+dp[i-2])%10007;
        }
        System.out.println(dp[n]);
    }

}
