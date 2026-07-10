
package LOGICBUILDING;
import java.util.*;
public class divbyfive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        if(a%5==0||a%3==0){
            System.out.println("Yes The Number is Divisible by 5 and 3");
        }else{
            System.out.println("No The Number is Not Divisible by 5 and 3");
        }
    }

}