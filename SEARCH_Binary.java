public class BinarySearch
{
	/*
	BinarySearch
	---------------------------------------------------------------------------------------------------------------------------
	Binary search is a searching algorithm, that is logarithmic(base 2). It works only for sorted arrays. It works by comparing middle element of the array with the search item. If search item is supposed to go before the middle element, it considers the first half of the array and repeats the same process on that part. If the search item is supposed to go after the search element, it considers the second half. It repeats this untill either the middle element corresponds with the search element, or the part of array considered by the sorting algorithm vanishes, ie when the part of array to be considered has just one element and it isnt equal to search item.
	---------------------------------------------------------------------------------------------------------------------------
	*/
	public BinarySearch() {}
	
	public static int search(int[] array, int p)
	{
		return search(array,0,array.length - 1,p);
	}
	
	public static int search(int[] array, int low, int high, int p)
	{
		int mid = low + (high - low)/2;
		if(array[mid] == p)
			return mid;
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
