package ARRAY.inputoutput;

public class Movezeroes {

    public void Movezero(int[] nums) {

        int write = 0;

        // Move all non-zero elements to the front
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
        }

        // Fill remaining positions with zeros
        while (write < nums.length) {
            nums[write] = 0;
            write++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        // Create object
        Movezeroes obj = new Movezeroes();

        // Call method
        obj.Movezero(nums);

        // Print updated array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}