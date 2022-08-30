package ps.boj.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B10814{
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        List<Person> list = new ArrayList<>();
        
        
        for(int i = 0; i<n; i++){
        	list.add(new Person(br.readLine(),i));
        }
        
        Collections.sort(list,(p1, p2) -> {
            if(p1.age>p2.age)
            	return 1;
            else if(p1.age == p2.age){
                if(p1.index>p2.index){
                    return 1;
                } else if(p1.index == p2.index){
                    return 0;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
                
        });
        list.forEach(System.out::println);
    }
    
    static class Person{
        int age;
        String name;
        int index;
        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }
        
        public Person(String input,int index){
            String[] arr = input.split(" ");
            this.index = index;
            this.age = Integer.parseInt(arr[0]);
            this.name = arr[1];
        }
        
        
        @Override
        public String toString(){
            return age + " " + name;
        }
        
        
    }
}