
import java.util.Arrays;

public class coinchange {

    public static int coinChange(int[] coins, int amount) {
       
        if (amount == 0) return 0;

       
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, Integer.MAX_VALUE);
        minCoins[0] = 0; 

        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && minCoins[i - coin] != Integer.MAX_VALUE) {
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coin]);
                }
            }
        }

        
        return minCoins[amount] == Integer.MAX_VALUE ? -1 : minCoins[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 6, 5};
        int amount = 11;

        int result = coinChange(coins, amount);
        System.out.println("Minimum coins required: " + result);
    }
}
