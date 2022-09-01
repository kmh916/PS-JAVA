package ps.boj.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
*
*
* */

public class B20301 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i<n; i++){

            deque.add(i+1);
        }
        int count = 1;
        int turn = 0;
        boolean isRight = true;
        while(!deque.isEmpty()){


            if(count!=k) {
                if(isRight){
                    deque.add(deque.poll());
                    count++;
                } else {
                    deque.addFirst(deque.pollLast());
                    count++;
                }

            } else {
                turn++;
                System.out.println(deque.poll());
                count = 1;

                if(turn == m){
                    turn = 0;
                    isRight = !isRight;
                }

                if(!isRight && !deque.isEmpty()) deque.addFirst(deque.pollLast());


            }


        }

    }
}
