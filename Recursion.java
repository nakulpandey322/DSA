
import java.util.Scanner;
public class Recursion4{
    void printNumbers(int i, int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        printNumbers(i-1,n);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        Recursion4 obj= new Recursion4();
        obj.printNumbers(n,n);
        sc.close();
    }
}
