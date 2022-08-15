package ps.boj.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1924 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);

        int[] arr_day = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] str_day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int day_sum = 0;

        for(int i = 0 ; i<month;i++){
            day_sum += (month-1 == i)? day : arr_day[i];
        }
        System.out.println(str_day[day_sum%7]);
    }
}
