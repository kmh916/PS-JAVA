package ps.boj.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11721 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] arr = input.toCharArray();

        for(int i = 0; i<arr.length; i++){
            if(i%10==0&& i!=0) System.out.println();
            System.out.print(arr[i]);
        }
    }
}
