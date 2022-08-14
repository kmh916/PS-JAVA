package ps.boj.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
/*
*
*
*        () 를 * 로 바꿈 -> (레이저 == *)
*        1. ( 은 스택에 푸쉬
*        2. * 만나면 정답 += 스택사이즈
         3. ) 만나면 +1 하고 팝
*
*       ( 는 막대의 시작 )는 막대의 끝 이기 때문에
*       스택의 사이즈는 아직 끝나지 않은? 존재하는 막대의 갯수를 의미하고
*       레이저를 만나면 해당 갯수만큼 결과에 누적 해준다.
*       )를 만나면 pop을 하고 +1을 해주는 이유는 맨 끝 부분도 하나의 토막이기 때문이다.
*
*       처음에는 (를 만나면 스택에 index를 푸쉬하고 )를 만났을때 pop한 index와 현재 index를 이용해
*       substring으로 '*'의갯수+1 만큼 결과에 누적해주는 코드를
*       짰는데 substring의 시간 복잡도가 O(N)이라 총 시간복잡도가 O(N^2) 이 되어 시간 초과가 발생했다.
*
* */
public class B10799 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String star = input.replace("()","*");

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int i = 0; i<star.length();i++){
            char c = star.charAt(i);
            if(c=='('){
                stack.push(i);
            }
            else if(c == '*' && !stack.isEmpty()) {
                result += stack.size();
            } else if(c == ')' && !stack.isEmpty()){
                result ++;
                stack.pop();
            }
        }
        System.out.println(result);
    }

}
