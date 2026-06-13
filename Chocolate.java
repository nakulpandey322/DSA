import java.util.Scanner;
public class Chocolate {
    public static void main(String args[]){
        System.out.println("Which chocolates do you like?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st favourite : ");
        String a = sc.nextLine();
        System.out.println("Enter your 2nd favourite : ");
        String b = sc.nextLine();
        System.out.println("My most favourite chocolates are "+a +" & " +b + "!!!");
        sc.close();
    }
}
