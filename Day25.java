// Maximum profit by buying and selling a share at most twice

public class Day25 {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;

        for (int price : prices) {
            buy1 = Math.max(buy1, -price);          // First buy
            sell1 = Math.max(sell1, buy1 + price);  // First sell
            buy2 = Math.max(buy2, sell1 - price);   // Second buy
            sell2 = Math.max(sell2, buy2 + price);  // Second sell
        }

        return sell2;
    }

    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}

