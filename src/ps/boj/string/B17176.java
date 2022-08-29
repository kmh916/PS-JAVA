package ps.boj.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
*       입력받은 정수들을 array에 저장하고 O(N)
*       String을 int array로 변경하여   O(N)
*       각각을 정렬 후 비교 O(N log N) * 2 + O(N)
*
*       480ms의 효율
* */
public class B17176 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> listA = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<n; i++){
            listA.add(Integer.valueOf(st.nextToken()));
        }
        String str = br.readLine();
        List<Integer> listB = convertStringToList(str);
        Collections.sort(listA);
        Collections.sort(listB);

        System.out.println(listB.equals(listA)?"y":"n");
    }

    private static List<Integer> convertStringToList(String str){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c>=65&&c<=90){
                list.add(c-64);
            } else if(c>=97&&c<=122){
                list.add(c-70);
            } else if(c == 32){
                list.add(0);
            }
        }
        return list;
    }
}
