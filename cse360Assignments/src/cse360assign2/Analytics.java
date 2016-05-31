package cse360assign2;
/**
 * <h1>Analytics class</h1>
 * This program implements a child class that extends OrderedIntList class
 *  
 * @author  Alexander S. M. Kimani PIN#30
 * @version 1.0
 * @since   05/28/2016
 */
public class Analytics extends OrderedIntList
{
	/**
	 * Variable helps with debugging
	 */
	private boolean debug = false;
	
	/**
	 * uses the base class's constructor to initialize members inherited from it
	 */
	public Analytics()
	{
		super ();
	}
	
	/**
	 * This method calculates mean of the ordered list
	 * 
	 * @return the mean of the list as a double, returns -1 if list is empty.
	 */
	public double mean()
	{
		double sum = 0.0;
		double mean = 0.0;
		
		if (count == 0)
			mean = -1;
		
		else 
		{
			for (int index = 0; index < count; index++)
			{
				if (debug)
				{
					if (index % 5 == 0)
						System.out.println();
					
					System.out.print(numArray[index] + "\t");
				}
				sum = sum + numArray[index] ;
				
			}
			System.out.println();
			mean = sum / count ;
		}
		
		return mean;
		
	}
	
	/**
	 *Calculates median of the ordered list
	 *
	 * @return returns the median of the ordered list as an integer, returns -1 if list is empty.
	 */
	public int median()//modify
	{
		int median = 0 ;
		int midIndex = 0;
		
		if (count == 0)
			median = -1;
		
		else 
		{
			if (count % 2 == 0)
			{
				midIndex = count / 2;
				median = (numArray[midIndex - 1] + numArray [midIndex]) / 2;
				
				if (debug)
				{
					System.out.print("\n midIndex = " + midIndex);
					System.out.print("\n middle numbers are => " + numArray[midIndex - 1] + " and " + numArray[midIndex]  );
				}
				
			}
			else
			{
				midIndex = (count + 1) / 2;
				
				if (debug)
					System.out.print("\n midIndex = " + midIndex);
				
				median = numArray[midIndex - 1] ;
				
			}
		}
		return median ;
	}
	
	/**
	 * This method is used to get the highest value in the list.
	 * 
	 * @return the highest value from the ordered list, returns -1 if list is empty.
	 */
	public int high()
	{
		int highest = 0;
		
		if (count == 0)
			highest = -1;
		else 
			highest = numArray[count - 1];
		
		return highest;
	}
	
	/**
	 * This method used to get the lowest value in the list
	 * 
	 * @return the lowest number in the ordered list, returns -1 if list is empty.
	 */
	public int low()
	{
		int lowest = 0;
		
		if (count == 0)
			lowest = -1;
		else 
			lowest = numArray[0];
		
		return lowest;
	}
	
	/**
	 * This method is used to get the number of integers in the list.
	 * 
	 * @return the number of integers in the ordered list.
	 */
	public int numInt()
	{
		int numOfInts = 0;
		
		numOfInts = count;
		
		return numOfInts;
	}
	

}
