package ARRAY.inputoutput;

public class smallest
{
    public static void main(String[] args) {
            int[] arr = {10, 25, 7, 89, 45};

            int smallest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }

            System.out.println("Smallest Element: " + smallest);
        }
    }

