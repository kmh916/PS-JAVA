package ps.boj.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*   소수 판별 : 제곱근까지 구하기
* */
public class B2581 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<Integer> primeList = new ArrayList<>();

        for(int i = n; i<m+1; i++){
            if(i==1) continue;
            boolean isPrime = true;
            for(int j =2;j<(int)Math.sqrt(i)+1;j++) {
                if(i%j==0) isPrime = false;
            }
            if(isPrime) primeList.add(i);
        }

        int sum = 0;
        for (int i:primeList) {
            sum += i;
        }
        if(!primeList.isEmpty()){
            System.out.println(sum);
            System.out.println(Collections.min(primeList));
        } else {
            System.out.println(-1);
        }

    }
}
