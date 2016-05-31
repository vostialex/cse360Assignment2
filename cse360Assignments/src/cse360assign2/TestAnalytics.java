package cse360assign2;
/**
 * This implements the TestAnalytics class used to test the
 * Analytics and OrdereIntList
 * 
 * @author  Alexander S. M. Kimani PIN#30
 * @version 1.0
 * @since   05/28/2016
 *
 */
public class TestAnalytics {

	public static void main(String[] args) {
		/**
		 * Creating an object of class Analytics
		 */
		Analytics list = new Analytics();
		
		/**
		 * Testing out methods with an empty list
		 */
		System.out.print (" mean = " + list.mean());
		System.out.print ("\n median = " + list.median());
		System.out.print ("\n Highest value = " + list.high());
		System.out.print ("\n Lowest value = " + list.low());
		System.out.print ("\n Number of integers in the list = " + list.numInt());
		System.out.println();
		
		/**
		 * Inserting integers into the list
		 */
		//list.insert(14);
		list.insert(10);
		list.insert(6);
		list.insert(3);
		list.insert(2);
		list.insert(1);
		list.insert(5);
		list.insert(8);
		list.insert(9);
		list.insert(11);
		list.insert(12);
		list.insert(13);
		//list.insert(17);
		list.print();
		
		/**
		 * Testing methods with a populated list
		 */
		System.out.print (" mean = " + list.mean());
		System.out.print ("\n median = " + list.median());
		System.out.print ("\n Highest value = " + list.high());
		System.out.print ("\n Lowest value = " + list.low());
		System.out.print ("\n Number of integers in the list = " + list.numInt());
	}

}
