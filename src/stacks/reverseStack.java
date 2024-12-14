package stacks;
import java.util.Stack;
import java.util.Scanner;
public class reverseStack {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        Stack<Integer> rt = new Stack<>();
        System.out.println(st);
        while(st.size()>0){
            int x= st.peek();
            rt.push(x);
            st.pop();

        }
        System.out.println(rt);

    }
}
