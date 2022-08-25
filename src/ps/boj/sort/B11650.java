package ps.boj.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B11650 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Coordinate> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(new Coordinate(br.readLine()));
        }

        Collections.sort(list, (o1, o2) -> {
            if(o1.x>o2.x) {
               return 1;
            }else if(o1.x==o2.x){
                if(o1.y>o2.y)
                    return 1;
                else if(o1.y==o2.y)
                    return 0;
                else
                    return -1;
            } else {
                return -1;
            }
        });

        list.forEach(System.out::println);
    }

    static class Coordinate{
        int x;
        int y;
        public Coordinate(String input){
            StringTokenizer st = new StringTokenizer(input," ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
        }

        @Override
        public String toString() {
            return x+" "+y;
        }
    }
}
