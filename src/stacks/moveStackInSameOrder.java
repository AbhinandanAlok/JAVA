package stacks;
import java.util.Stack;
import java .util.Scanner;
public class moveStackInSameOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
     int n;
     System.out.println("enter the number  of stacks : ");
     n=sc.nextInt();
        System.out.println("enter the element of the stcks : ");
        for(int i=1;i<=n;i++){
            int  x   = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        Stack<Integer> xt = new Stack<>();
        while(gt.size()>0){
            xt.push(gt.pop());
        }
        System.out.println(xt);
    }



}
