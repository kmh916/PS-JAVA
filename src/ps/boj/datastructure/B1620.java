package ps.boj.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
*       String을 입력받아서 String <--> Integer(인덱스)로 양방향 탐색 구현하기 -> 양방향 모두 O(1)
*       Map<String,Integer> 로 String으로 탐색시 Integer
*       String[] 로 Integer(인덱스)로 탐색시 String
*
* */

public class B1620 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Map<String,Integer> map = new HashMap<>();
        String[] arr = new String[n];

        for(int i = 0; i<n;i++){
            String pokemonName = br.readLine();
            map.put(pokemonName,i+1);
            arr[i] = pokemonName;
        }

        for(int i = 0; i<m;i++){
            String question = br.readLine();
            if(isNumber(question)) {
                System.out.println(arr[Integer.parseInt(question)-1]);
            } else {
                System.out.println(map.get(question));
            }


        }

    }

    private static boolean isNumber(String str){
        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
