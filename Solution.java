package ARRAY.inputoutput;
public class Solution{

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Agar current price minimum hai to update karo
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Current profit calculate karo
            int profit = prices[i] - minPrice;

            // Maximum profit update karo
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int ans = maxProfit(prices);

        System.out.println("Maximum Profit = " + ans);
    }
}