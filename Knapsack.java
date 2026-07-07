import java.util.*;

public class Knapsack {

    static int knapsack(int[] weight, int[] value, int capacity, int n) {

        int[][] dp = new int[n + 1][capacity + 1];

        // Build DP table
        for (int i = 0; i <= n; i++) {

            for (int w = 0; w <= capacity; w++) {

                // Base Case
                if (i == 0 || w == 0)
                    dp[i][w] = 0;

                    // If current item's weight is less than or equal to capacity
                else if (weight[i - 1] <= w) {

                    dp[i][w] = Math.max(
                            value[i - 1] + dp[i - 1][w - weight[i - 1]],
                            dp[i - 1][w]);

                }

                // Cannot include current item
                else {

                    dp[i][w] = dp[i - 1][w];

                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {

        int[] weight = {1, 3, 4, 5};
        int[] value = {1, 4, 5, 7};

        int capacity = 7;
        int n = value.length;

        int maxValue = knapsack(weight, value, capacity, n);

        System.out.println("Maximum Value = " + maxValue);
    }
}
