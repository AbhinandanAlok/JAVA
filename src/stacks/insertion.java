package stacks;
import java.util.Stack;
public class insertion {
    public static void main(String[] args){
        Stack<Integer> st =  new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        int  index = 2;
        int   x = 7;
         while(st.size()>index){
             temp.push(st.pop());
         }
         st.push(x);
         while(temp.size()>0){
             st.push(temp.pop());
         }
         System .out.println(" the inserted elemnt is that : "+st);
    }
}
