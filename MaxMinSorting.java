public class MaxMinSorting
{
	public static int a = 100;
	public static int b = 15;
	public static int c = 30;
	public static int d = 1;
	public static int max;
	public static int min;
		
	public static void main (String [] args)
	{
		System.out.println(getMax());
		System.out.println(getMin());
	
	}
	
	public static int getMax()
	{
		if (a > b)
			max = a;
		if (b > a)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		return max;
	}
	
	public static int getMin()
	{
		if (a < b)
			min = a;
		if (b < a)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;
	
		return min;
	}
			
		
}
