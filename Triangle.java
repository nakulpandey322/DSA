package LOOP;
import java.util.Scanner;
public class Triangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("--- Triangle Validity Checker ---");
            System.out.print("Enter the length of side A: ");
            double sideA = scanner.nextDouble();

            System.out.print("Enter the length of side B: ");
            double sideB = scanner.nextDouble();

            System.out.print("Enter the length of side C: ");
            double sideC = scanner.nextDouble();


            if (isValidTriangle(sideA, sideB, sideC)) {
                System.out.println("Success: These side lengths form a VALID triangle.");
            } else {
                System.out.println("Error: These side lengths form an INVALID triangle.");
            }


            scanner.close();
        }

        public static boolean isValidTriangle(double a, double b, double c) {
            if (a <= 0 || b <= 0 || c <= 0) {
                return false;
            }

            return (a + b > c) && (a + c > b) && (b + c > a);
        }
    }


