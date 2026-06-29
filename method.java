package LOOP;

public class method {
        static int largest(int a, int b) {
            if (a > b)
                return a;
            else
                return b;
        }

        public static void main(String[] args) {
            int result = largest(25, 18);
            System.out.println("Largest Number = " + result);
        }
    }

