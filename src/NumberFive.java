public class NumberFive{

	static boolean selfNumCheck(int n)
	{	
		for(int m = 1; m <= n; m++)
		{
			
		if (m + sumOfSelfNum(m) == n)
			return false;
		}
		return true;
	}
	
	static int sumOfSelfNum(int x) 
	{
		int total = 0;
		while (x != 0)
		{
			total = total + x % 10;
			x = x / 10;
		}
		return total;
	}

	public static void main(String[] args)
	{
		int x = 200;
		int answer = 0;
		for(int i = 0 ; i<x;i++) {
			if (selfNumCheck(i) == true)
			{
				answer++;
			}
		}
		
		System.out.println("The total self-Number below 200 is " + answer);
		
	}
}