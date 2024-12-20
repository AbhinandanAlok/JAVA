package stacks;
import java.util.Stack;
public class reverseBYrecursion {
    public static void pushAtbottom(Stack<Integer>st,int x){
        if(st.size()==0){
            st.push(x);
            return ;
        }
        int top= st.pop();
        pushAtbottom(st,x);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtbottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print(st);
        reverse(st);
        System.out.print(st);

    }
}
