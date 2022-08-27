package ps.boj.binarysearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
*   입력 100,000개
*   sort후 이진탐색 -> O(NlogN * 2) vs 그냥 탐색 -> O(N^2)
*
* */

public class B1920 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> listA = new ArrayList<>();
        StringTokenizer stA = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            listA.add(Integer.parseInt(stA.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        List<Integer> listB = new ArrayList<>();
        StringTokenizer stB = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<m; i++){
            listB.add(Integer.parseInt(stB.nextToken()));
        }

        Collections.sort(listA);

        for (Integer integer : listB) {
            int result = Collections.binarySearch(listA, integer);
            System.out.println(result<0 ? "0" : "1");
        }
    }
}
