package stacks;
import java.util.Stack;
import java.util.arraylist;
public class arraylist {
    static class stack{
        static arraylist<integer> list=new arraylist<>();
        public static boolean isempty() {
            return list.size()==0;

        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            int top=list.get(list.size()-1);
            return top;

        }
    }
    public static void main(string args[]){
        stack s =new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty()){
            system.out.println(s.peek());
            s.pop();
        }





    }
}
