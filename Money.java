
import java.util.ArrayList;

public class Money{
	public ArrayList<Integer> change(int num)
	{
		ArrayList<Integer> reg = new ArrayList<Integer>(4);
		int cur = 0;
		if (num < 0)
		{
			System.out.println("everything is 0");
			return null;
		}
		if (num >= 25)
		{
			cur = num / 25;
			num = num - cur * 25;
			reg.add(cur);
			cur = 0;
		}
		else
			reg.add(0);
		if (num >= 10)
		{
			cur = num / 10;
			num = num - cur * 10;
			reg.add(num);
			cur = 0;
		}
		else
			reg.add(0);
		if (num >= 5)
		{
			cur = num / 5;
			num = num - cur * 5;
			reg.add(cur	);
		}
		else
			reg.add(0);
		reg.add(num);
		return reg;
	}
	public static void main(String args[])
	{
		Money m = new Money();
		ArrayList<Integer> s = m.change(83);
		System.out.println("quarters: "+ s.get(0));
		System.out.println("dimes: "+ s.get(1));
		System.out.println("nickels: "+ s.get(2));
		System.out.println("pennys: "+ s.get(3));
	}
}
			