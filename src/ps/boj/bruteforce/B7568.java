package ps.boj.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
*   2 ≤ N ≤ 50 이기 때문에 1초를 O(N^2)로 가능
*
* */
public class B7568 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(new Person(br.readLine()));
        }

        for(int i = 0; i<list.size();i++){
            for(int j = 0; j<list.size(); j++){
                if(i!=j) {
                    list.get(i).increaseGrade(list.get(j));
                }
            }
        }

        for (int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i).grade+(i==list.size()-1?"":" "));
        }
    }

    static class Person{

        int height;
        int weight;
        int grade = 1;

        public Person(String input){
            this.weight = Integer.parseInt(input.split(" ")[0]);
            this.height = Integer.parseInt(input.split(" ")[1]);
        }

        public void increaseGrade(Person person){
            if(this.height<person.height && this.weight < person.weight)
                grade++;
        }
    }
}
