package ARRAY.inputoutput;
import java.util.HashMap;
public class subarray {

        public static int subarraySum(int[] nums, int k) {

            // Prefix Sum -> Frequency
            HashMap<Integer, Integer> map = new HashMap<>();

            // Base Case
            map.put(0, 1);

            int sum = 0;
            int count = 0;

            for (int i = 0; i < nums.length; i++) {

                // Current Prefix Sum
                sum += nums[i];

                // Check if (sum - k) already exists
                if (map.containsKey(sum - k)) {
                    count += map.get(sum - k);
                }

                // Store current prefix sum
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return count;
        }

        public static void main(String[] args) {

            int[] nums = {1, 1, 1};
            int k = 2;

            int result = subarraySum(nums, k);

            System.out.println("Number of Subarrays = " + result);
        }
    }

