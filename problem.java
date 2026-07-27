package ARRAY.inputoutput;

class Problem {

    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {

                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        Problem obj = new Problem();

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int answer = obj.minSubArrayLen(target, nums);

        System.out.println("Minimum Length = " + answer);
    }
}