package ps.boj.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*   생성자가 없는 수(셀프넘버)를 구하기위해서 1부터 끝까지 생성자로 다음수를 만든다.
*   만들어진 수의 인덱스에 true를 기록하고
*   false인 인덱스만 출력하기
*
* */
public class B4673 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr_bool = new boolean[10001];
        for(int i=1; i<10001;i++){
            int nextNum = getNext(i);
            if(nextNum<10001)
                arr_bool[getNext(i)] = true;
        }

            for(int i = 1; i<10001;i++){
                if(!arr_bool[i]) System.out.println(i);
        }
    }


    // 각 자릿수 합 구하기
    private static int getNext(int num){
        int sum = num;
        while(num!=0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
