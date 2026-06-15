public class GridWays {

    public static long uniquePaths(int m, int n) {

        int totalMoves = m + n - 2;
        int choose = Math.min(m - 1, n - 1);

        long result = 1;

        for (int i = 1; i <= choose; i++) {
            result = result * (totalMoves - choose + i) / i;
        }

        return result;
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 7;

        System.out.println(uniquePaths(m, n));
    }
}