package Array_Hashing;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        
        int least = Integer.MAX_VALUE, profit = Integer.MIN_VALUE;

        for (int price : prices) {
            if (price < least) {
                least = price;
            } else {
                if (profit < (price - least)) {
                    profit = price - least;
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int prices[] = { 2, 4, 1 };

        BuySellStock obj = new BuySellStock();
        System.out.println(obj.maxProfit(prices));
    }
}
