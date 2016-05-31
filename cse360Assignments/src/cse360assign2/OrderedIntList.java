/**
* <h1>OrderedIntList class</h1>
* The OrderedIntList program implements a class that
* simply orders integers in acceding order. 
* 
* @author  Alexander S. M. Kimani PIN#30
* @version 1.0
* @since   05/28/2016
*/
package cse360assign2;
public class OrderedIntList 
{
	/**
	 * This is the integer array that contains the Ordered list 
	 */
	protected int[] numArray; 
	
	/**
	 * This keep track of the number of integers entered into the Ordered list 
	 */
	protected int count; 
	
	/**
	 * This variable is used to assist in debugging code if set to true;
	 */
	private boolean debug = true;
	
	/**
	 * This constructor creates an integer array 
	 */
	OrderedIntList ()
	{
		numArray = new int[10];
	}
	
	/**
	 * This inserts integer numbers into the Ordered list.
	 * 
	 * @param num the integer inserted to the Ordered list
	 */
	public void insert (int num) 
	{
		if (debug)
		{
			System.out.println ("debug – starting insert");
			System.out.println ("debug – num = " + num);
		}
		
		if(count == numArray.length)
			grow();
		
		if(count == 0)
		{
			numArray[0] = num;
			count = count + 1;
		}
		else
		{
			int jIndex = 0;
			int index = 0;
			boolean done = false;
			
			while (!done && index < count)
				if(num < numArray[index])
				{
					done = true;
					if (debug)
						System.out.println("debug while loop– num = " + num + " < "+ numArray[index]  );
				}
			
				else
				{
					index++;
					jIndex++;
				}			
			
			for ( index = count; index > jIndex; index--) 
				numArray[index] = numArray[index-1];
			
			numArray[jIndex] = num; 
			if (debug)
			{
				System.out.println("debug ending insert");
				System.out.println("debug - "+ num +" is inserted in index "+ jIndex);
			}
				
			count = count + 1;
		}
	}
	
	/**
	 * This method increases the size of the original integer array
	 */
	private void grow()
	{
		if (debug)
		{
			System.out.println ("debug – starting grow");
		}
		
		int []tempNumArray = new int[count * 2];
		if (debug)
			System.out.println ("debug – count * 2 = " + count * 2);
		
		for (int index = 0; index < count; index++ )
		{
			tempNumArray[index] = numArray[index];
		
			if (debug)
				System.out.println ("debug – tempNumArray index = " + index + " = " + tempNumArray[index]);
		}	
		
		numArray = tempNumArray;
	}
	
	/**
	 * This prints out the Ordered list 5 integers per line 
	 */
	public void print () 
	{
		for (int index = 0; index < count; index++)
		{
			if (index % 5 == 0)
				System.out.println();
			
			System.out.print(numArray[index] + "\t");	
		}
		
		System.out.println();
	}
}
