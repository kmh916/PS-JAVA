package ps.boj.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
*     요세푸스 : https://ko.wikipedia.org/wiki/%EC%9A%94%EC%84%B8%ED%91%B8%EC%8A%A4_%EB%AC%B8%EC%A0%9C
*     N명의 사람들중 K번째를 제거하고 "K+1번째 사람부터 다시 순서를 세서" K번째를 제거하며 모두 제거할때 까지 반복한다.
*
*
*       구현 : 큐를 사용하여 K번째를 제거해나간다.
*       -> 카운트하며 poll+add 로 맨 앞 요소를 뒤로보내고 하나씩 카운트하며 K번째가 될때 poll해서 문자열에 누적시킨다.
*       -> 큐가 빌때 까지 반복한다.
* */

public class B1158 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<n; i++){
            queue.add(i+1);
        }
        StringBuilder sb = new StringBuilder("<");
        int count = 1;
        while(!queue.isEmpty()){

            if(count!=k) {
               queue.add(queue.poll());
               count++;
            } else {

                sb.append(queue.poll());
                if(queue.size()!=0) sb.append(", ");
                count = 1;
            }
        }
        sb.append(">");

        System.out.println(sb);
    }
}
