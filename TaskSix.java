import java.util.ArrayList;
import java.util.Scanner;

	

public class TaskSix {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		long max = 100000000L;
		
		for (int i = 2; i <= max; i++)
		{
			int sqr_root = (int) Math.sqrt(i);
			boolean isPrime = true;
			
			for (int j = 2; j <= sqr_root; j++)
			{
				if (i % j == 0 )
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				 System.out.println(i);
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		long TimeInSeconds = totalTime/1000;
		
		System.out.println("The total time in seconds is " + TimeInSeconds + "s.");
	
	}
}		
		
	
	

		


