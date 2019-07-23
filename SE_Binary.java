/****************************************************
		Binary Search
-----------------------------------------------------
	Binary Search is a search algorithm. It works
only for pre-sorted arrays only. It works by splitting
a sorted array in half, and checking on which side of
the array the search term is likely to be. If the search
term is on the left side, it avoids the righ side and
searches the left side. If it is on the right side, it does
so on that side. The element is found by searching at the
middle of the search range.
	(Here, the middle, high and low values are all
searched. It is implemented as a recursive function.)
****************************************************/

public class SE_Binary
{	
	public static int search(int[] array, int p)
	{
		return search(array,0,array.length - 1,p);
	}
	
	public static int search(int[] array, int low, int high, int p)
	{
		int mid = low + (high - low)/2;
		if(array[mid] == p)
			return mid;
			return -1;
		if(mid == low)
		{
		    if(array[high] == p)    return high;
		    return -1;
		}
		if(low == high)
			return -1;
		if(p > array[mid])
		{
			return search(array,mid,high,p);
		}
		if(p < array[mid])
		{
			return search(array,low,mid,p);
		}
	}
}
