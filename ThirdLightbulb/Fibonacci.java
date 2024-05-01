package homework;

public class Fibonacci {
	public static void main(String[] args)
	{
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.FibonacciGen(8));
	}
	
	public int FibonacciGen(int n)
	{
		if(n < 0)
		{
			return -1;
		}
		else if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		else
		{
			int firstNum = 0;
			int secondNum = 1;
			for(int i = 0; i < n - 1; i++)
			{
				int tempSecond = secondNum;
				secondNum = firstNum + secondNum;
				firstNum = tempSecond;
			}
			return secondNum;
		}
	}
}
