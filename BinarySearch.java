package ARRAY.inputoutput;

public class BinarySearch {
        public static int binarySearch(int[] arr, int target) {

            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid;
                }

                else if (arr[mid] < target) {
                    low = mid + 1;
                }

                else {
                    high = mid - 1;
                }
            }

            return -1;
        }

        public static void main(String[] args) {

            int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

            int target = 14;

            int ans = binarySearch(arr, target);

            if (ans == -1) {
                System.out.println("Target Not Found");
            } else {
                System.out.println("Target Found at Index: " + ans);
            }
        }
    }

