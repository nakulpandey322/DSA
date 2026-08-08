package ARRAY.inputoutput;

public class PrefixSum {
        public static void main(String[] args) {

            int[] arr = {5, 3, 8, 6, 2};

            int[] prefix = new int[arr.length];

            prefix[0] = arr[0];

            for (int i = 1; i < arr.length; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }

            System.out.print("Prefix Sum Array: ");

            for (int num : prefix) {
                System.out.print(num + " ");
            }

            System.out.println();

            int left = 1;
            int right = 4;

            int sum;

            if (left == 0)
                sum = prefix[right];
            else
                sum = prefix[right] - prefix[left - 1];

            System.out.println("Range Sum = " + sum);
        }
    }

