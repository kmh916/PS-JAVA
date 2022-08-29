package ps.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
*       숫자 입력중 1번째(준원이의 공격력)를 제외하고 나머지를 배열로 만들어
*       정렬시키고 반복시키며 준원이의 공격력과 비교해가며
*       준원이의 공격력이 더 클 경우 준원이의 공격력에 누적하고
*       더 작을경우 No 출력하고 종료
*       반복문이 모두 완료됬을경우(다 이겼을떄) Yes 출력
* */
public class B22993 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long atk = Long.parseLong(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<n-1;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        for(Integer i : list){
            if(atk>i)
                atk += i;
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
