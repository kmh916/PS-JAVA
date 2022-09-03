package ps.boj.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class B10866 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        MyDeQueue<Integer> mdq = new MyDeQueue<>();
        for (int i=0; i<n; i++){
            mdq.execute(br.readLine());
        }
    }

    static class MyDeQueue<E>{
        private final LinkedList<E> dequeue = new LinkedList<>();

        public void execute(String input){
            String[] arr_splitInput = input.split(" ");
            String command = arr_splitInput[0];
            if(command.contains("push")) {
                String[] arr_splitCommand = command.split("_");
                Integer data = Integer.valueOf(arr_splitInput[1]);
                if(arr_splitCommand[1].equals("front")){
                    push_front((E) data);
                } else if(arr_splitCommand[1].equals("back")){
                    push_back((E) data);
                }
            } else {
                switch (command){
                    case "pop_front" :
                        E dataPF = pop_front();
                        System.out.println(dataPF==null?-1:dataPF);
                        break;
                    case "pop_back" :
                        E dataPB = pop_back();
                        System.out.println(dataPB==null?-1:dataPB);
                        break;
                    case "size" :
                        System.out.println(size());
                        break;
                    case "empty" :
                        System.out.println(empty()?1:0);
                        break;
                    case "front" :
                        E dataF = front();
                        System.out.println(dataF==null?-1:dataF);
                        break;
                    case "back" :
                        E dataB = back();
                        System.out.println(dataB==null?-1:dataB);
                        break;
                }
            }

        }

        public void push_front(E data){
            dequeue.addFirst(data);
        }

        public void push_back(E data){
            dequeue.addLast(data);
        }

        public E pop_front(){
            return empty()?null:dequeue.removeFirst();
        }

        public E pop_back(){
            return empty()?null:dequeue.removeLast();
        }

        public int size(){
            return dequeue.size();
        }

        public boolean empty(){
            return dequeue.isEmpty();
        }

        public E front(){
            return empty()?null:dequeue.getFirst();
        }

        public E back(){
            return empty()?null:dequeue.getLast();
        }

    }
}
