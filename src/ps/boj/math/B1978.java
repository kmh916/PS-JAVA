package ps.boj.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
*       https://velog.io/@changhee09/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%86%8C%EC%88%98%EC%9D%98-%ED%8C%90%EB%B3%84-%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98-%EC%B2%B4
*
* */
public class B1978 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int result = 0;
        for(int i = 0; i<n;i++){
            if(isPrime(Integer.parseInt(st.nextToken()))) result++;
        }
        System.out.println(result);
    }
    private static boolean isPrime(int n){

        if(n == 1 ) return false;

        for(int i = 2; i<(int)Math.sqrt(n)+1;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
