package ps.boj.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B15904 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] arr_char = {'U', 'C', 'P', 'C'};

        int flag = 0;
        String result = "hate";
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == arr_char[flag]){
                flag++;
            }
            if(flag == 4) {
                result = "love";
                break;
            }
        }

        System.out.println("I "+result+" UCPC");
    }
}
