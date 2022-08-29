package ps.boj.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B20299 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i<n; i++){
            StringTokenizer stn = new StringTokenizer(br.readLine()," ");
            int[] arr_rate = {
                    Integer.parseInt(stn.nextToken()),
                    Integer.parseInt(stn.nextToken()),
                    Integer.parseInt(stn.nextToken())
            };

            if(arr_rate[0]+arr_rate[1]+arr_rate[2]>=k){
                if(arr_rate[0]>=l&&arr_rate[1]>=l&&arr_rate[2]>=l){
                    count++;
                    for(int j = 0; j<arr_rate.length;j++){
                        sb.append(arr_rate[j]).append(" ");
                    }
                }
            }
        }

        System.out.println(count);
        System.out.println(sb.toString());
        }
    }
