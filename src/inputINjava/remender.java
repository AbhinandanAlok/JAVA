package inputINjava;
import java.util.Scanner;
public class remender {
     public static  void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the diviser ");
        int d= sc.nextInt();
        System.out.println(" enter the  divident ");
        int  div = sc.nextInt();
        System.out.println("enter the quoesent ");
        int q= div/d;
        System.out.println(" the reminder is ");
        int rem = div - (d*q);
        System.out.println(rem);

    }

}
