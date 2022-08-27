package ps.boj.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B10845 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        MyQueue queue = new MyQueue();
        for(int i = 0; i<n; i++){
            queue.execute(br.readLine());
        }
    }


    static class MyQueue{
        private final List<Integer> queue;

        public MyQueue(){
            queue = new ArrayList<>();
        }

        public void push(int value){
            queue.add(value);
        }

        public int pop(){
            return queue.isEmpty()?-1:queue.remove(0);
        }

        public int size(){
            return queue.size();
        }

        public int empty(){
            return queue.isEmpty()?1:0;
        }

        public int front(){
            return queue.isEmpty()?-1:queue.get(0);
        }

        public int back(){
            return queue.isEmpty()?-1:queue.get(queue.size()-1);
        }

        public void execute(String input){
            if(input.contains(" ")) {
                push(Integer.parseInt(input.split(" ")[1]));
                return;
            }

            switch (input){
                case "pop" :
                    System.out.println(pop());
                    break;
                case "size" :
                    System.out.println(size());
                    break;
                case "empty" :
                    System.out.println(empty());
                    break;
                case "front" :
                    System.out.println(front());
                    break;
                case "back" :
                    System.out.println(back());
                    break;
                default:
                    break;
            }


        }
    }
}
