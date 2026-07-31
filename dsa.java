package ARRAY.inputoutput;
public class dsa{

    public static double myPow(double x, int n) {

        long power = n; // int overflow se bachne ke liye

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double answer = 1.0;

        while (power > 0) {

            // Agar power odd hai
            if (power % 2 == 1) {
                answer *= x;
            }

            // Base ko square karo
            x = x * x;

            // Power ko half karo
            power /= 2;
        }

        return answer;
    }

    public static void main(String[] args) {

        double x = 2.0;
        int n = 10;

        System.out.println("Answer = " + myPow(x, n));
    }
}