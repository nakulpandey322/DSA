package LOOP;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
//        int digits = String.valueOf(num).length();  String conversion method
        // for counting digit process
        int temp = num;
        int digits = 0;
        while(temp>0){
            digits++;
            temp = temp/10;
        }

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number");
        }

        sc.close();
    }
}