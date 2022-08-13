package ps.boj.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B10828 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        MyStack stack = new MyStack();

        for(int i = 0; i<n; i++){
            String command = br.readLine();

            stack.execute(command);
        }
    }
}

class MyStack{

    private final List<Integer> stack;

    public MyStack(){
        stack = new ArrayList<Integer>();
    }

    private void push(Integer value){
        stack.add(value);
    }

    private Integer pop(){
        return stack.isEmpty()?-1:stack.remove(stack.size()-1);
    }

    private Integer size(){
        return stack.size();
    }

    private boolean isEmpty(){
        return stack.isEmpty();
    }

    private Integer top(){
        return stack.isEmpty()?-1:stack.get(stack.size()-1);
    }

    public void execute(String command){
        if(command.contains("push")){
            push(Integer.parseInt(command.split(" ")[1]));
        } else if(command.equals("pop")){
            System.out.println(pop());
        } else if(command.equals("size")){
            System.out.println(size());
        } else if(command.equals("empty")){
            System.out.println(isEmpty()?1:0);
        } else if(command.equals("top")){
            System.out.println(top());
        }
    }
}
