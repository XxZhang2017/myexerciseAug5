
import java.util.*; 

public class StockBuySell {
    public int maxProfit(int[] prices) {
        if(prices.length==0 || prices.length==1) return 0; 
        int[] Mindp=new int[prices.length];
        int reg=0;
        int[] Maxdp=new int[prices.length];
        
        Mindp[0]=prices[0];
        
        for(int i=1;i<prices.length;i++){
            Mindp[i]=Math.min(Mindp[i-1],prices[i]);
			
        //    Mindp[i-1]=Mindp[i];
        //    System.out.println("No "+i+" min buying price "+Mindp[i]);
            Maxdp[i]=prices[i]-Mindp[i];
            
            reg=Math.max(reg,Maxdp[i]);
            
        }
        return reg;
    }
	public static void main(String args[])
	{
		int[] arr = {3, 8, 8, 55, 38, 1, 7, 42, 54};
		StockBuySell sb = new StockBuySell();
		int reg = sb.maxProfit(arr);
		System.out.println("the output is " + reg);
	}
}
