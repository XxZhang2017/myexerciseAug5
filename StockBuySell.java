
import java.util.*; 

public class StockBuySell {
	public int maxProfit(int[] prices) {
		if (prices.length == 0 || prices.length == 1)
			return 0;
		int[] Mindp = new int[prices.length];
		int reg = 0;

		int[] Maxdp = new int[prices.length];

		Mindp[0] = prices[0];
		int buyday, sellday, smallest;

		buyday = 0;
		sellday = 0;
		smallest = 0;

		for (int i = 1; i < prices.length; i++) {
					
			Maxdp[i] = prices[i] - Mindp[i -1];

			if (Maxdp[i] > reg && i > buyday)
			{
				reg = Math.max(reg, Maxdp[i]);
//				System.out.println("max update: " + reg);
				sellday = i;
			}
			else
				Maxdp[i] = Maxdp[i - 1];
			Mindp[i] = Math.min(Mindp[i - 1], prices[i]);
			
			
			if (Mindp[i - 1] > prices[i])
				smallest = i;
			
			if (smallest < sellday)
				buyday = smallest;
		}

		System.out.println("the buy day is " + (buyday + 1));
		System.out.println("the sell day is " + (sellday + 1));
		return reg;
	}

	public static void main(String args[]) {
		int[] arr = { 3, 8, 1, 55, 38, 7, 7, 42, 56, 53, 1 };
		StockBuySell sb = new StockBuySell();
		int reg = sb.maxProfit(arr);
		System.out.println("the output is " + reg);
	}
}
