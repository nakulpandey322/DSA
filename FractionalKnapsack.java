import java.util.*;
public class FractionalKnapsack {

    static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    static double fractionalKnapsack(int[] value, int[] weight, int capacity) {

        int n = value.length;

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(value[i], weight[i]);
        }

        // Sort according to value/weight ratio
        Arrays.sort(items, (a, b) ->
                Double.compare(
                        (double) b.value / b.weight,
                        (double) a.value / a.weight
                )
        );

        double totalValue = 0;

        for (Item item : items) {

            if (capacity >= item.weight) {

                // Take complete item
                capacity -= item.weight;
                totalValue += item.value;

            } else {

                // Take fraction of item
                totalValue += ((double) item.value / item.weight) * capacity;
                capacity = 0;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};

        int capacity = 50;

        System.out.println(fractionalKnapsack(value, weight, capacity));
    }
}