package inputINjava;
import java.util.Scanner;
public class intputinjava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number a ");
        int a = sc.nextInt();
        System.out.print(" enter the number b ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(" the sum is " + sum);


    }
}