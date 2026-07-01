package METHODS;
import java.util.*;
public class smallest {
    public static int Smallestnumber(int a,int b, int c){
        if(a<b){
            return a;
        } else if (b<c) {
            return b;
        }else{
            return c;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = sc.nextInt();
        System.out.println("Enter second number");
        int num1 = sc.nextInt();
        System.out.println("Enter third number");
        int num2 = sc.nextInt();

        System.out.println("The Smallest Number is:-"+Smallestnumber(num,num1,num2));
    }
}
