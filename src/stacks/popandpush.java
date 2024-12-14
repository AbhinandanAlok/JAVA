package stacks;

import java.util.Stack;
public class popandpush {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(2);
        st.push(5);
        st.push(6);
        st.push(49);
        System.out.println(st.isEmpty());
        System.out.println(st);
        System.out.println(" the size of the stack is : "+st.size());
        while(st.size()>3){
            st.pop();
        }
        System.out.println(st);


    }
}
