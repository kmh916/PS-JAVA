package ps.boj.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*   에라토스테네스의 체
* */
public class B1929 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        boolean[] arr_notPrime = new boolean[m+1];
        arr_notPrime[1] = true;

        for(int i=2;i<Math.sqrt(m)+1;i++){
            for(int j =0;j<arr_notPrime.length;j++){
                if(j%i==0&&j!=i) arr_notPrime[j] = true;
            }
        }
        for(int i = n; i<m+1;i++){
            if(!arr_notPrime[i]) System.out.println(i);
        }
    }
}
