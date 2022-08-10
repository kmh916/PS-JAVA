package ps.boj.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
*     N에 대하여 2자릿수일때와 2자릿수 이상일때로 나눠서 계산함
*     case 2자릿수 : 모든 2자릿수 N은 한수 이므로 답은 N
*     case 2자릿수 이상 : N부터 1개씩 줄여가며
*     (100의자릿수-10의자릿수) == (10의 자릿수 - 1의 자릿수) 인지 확인하고
*     맞으면 카운트함 (카운트 초기값 99)
*
* */


public class B1065 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int result = 0;
        if(input.length()<=2){
            result = Integer.parseInt(input);
        } else{
            int num = Integer.parseInt(input);
            result = 99;
            while(num>100){
                int hundreds = num/100;
                int ten = num/10%10;
                int one = num%10;
                if(hundreds-ten == ten - one) result++;
                num--;
            }
        }
        System.out.println(result);
    }
}
