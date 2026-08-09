import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int[] a = new int[input.length];

        int max = 0;
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
            max = Math.max(max, a[i]);
        }

        long MOD = 1000000007L;

        // Fibonacci numbers
        ArrayList<Integer> f = new ArrayList<>();
        f.add(1);
        f.add(2);

        while (f.get(f.size() - 1) <= 2 * max) {
            int n = f.size();
            f.add(f.get(n - 1) + f.get(n - 2));
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        long ans = 0;

        for (int x : a) {
            for (int v : f) {
                int y = v - x;

                if (freq.containsKey(y)) {
                    ans += freq.get(y);
                }
            }

            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        System.out.println(ans % MOD);
    }
}
