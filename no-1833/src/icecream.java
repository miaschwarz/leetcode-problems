import java.util.ArrayList;
import java.util.Arrays;

public class icecream {
    public static void main(String[] args) {
        int[] costs1 = {1, 3, 2, 4, 1};
        int[] costs2 = {10, 6, 8, 7, 7, 8};
        int[] costs3 = {1, 6, 3, 1, 2, 5};
        int[] costs4 = {7,3,3,6,6,6,10,5,9,2};
        int coins = 56;
        maxIceCream(costs4, coins);
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        int spent = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] < coins && spent < coins) {
                spent += costs[i];
                if (spent > coins) {
                    spent -= costs[i];
                    count --;
                }
                count ++;
            }
        }
        return count;
    }
}
