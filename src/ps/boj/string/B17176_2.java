package ps.boj.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
*
*   A~Z , a~z , 공백 -> 총 입력으로 들어오는 숫자의 갯수는 53개임
*   53크기의 int 배열을 선언한후
*   N개의 정수가 입력으로 들어올때 해당 index의 값을 ++해줌
*   -> 문자열을 입력받고 해당 문자열을 인코딩하여 해당 인덱스에 --해줌
*   int 배열의 모든 요소가 0이 아니라면 서로 일치하지 않는것이기 때문에 n 출력
*
*   O(N)의 시간복잡도 196ms
*
* */
public class B17176_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[53];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[num]++;
        }

        String str = br.readLine();

        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c>='A'&&c<='Z'){
                arr[c-64]--;
            } else if(c>='a'&&c<='z'){
                arr[c-70]--;
            } else if(c==' '){
                arr[0]--;
            }
        }

        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=0) {
                System.out.println("n");
                return;
            }
        }
        System.out.println("y");
    }
}
