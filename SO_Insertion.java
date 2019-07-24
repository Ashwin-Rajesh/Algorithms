/************************************************
		Insertion Sort
-------------------------------------------------
	In insertion sort, the algorithim makes
n(n = size of array) passes over the array, and in
each sort, it makes the first i elements in the
right order(not the right poisition, just the order)
Then, it goes on incrementing this i in each pass
and brings the next element to the correct order.
	It has linear compares and exchanges for
partially/completely sorted array. For average
case, it takes n^2/4 compares and exchanges and for
workst case it takes n^2/2 compares and exchanges.
************************************************/

public class SO_Insertion()
{
	public sort(Comparable[] array)
	{
		int n = array.length;
		for(int i = 1; i < n; i++)
			for(int j = i; j > 0; j--)
				if(less(array[j], array[j-1]))	exchange(array,j,j-1);
	}
	
	public boolean less(Compmarable a, Comparable b)
	{
		return(a.compareTo(b)) < 0;
	}
	
	public void exchange(Comparable[] array, i, j)
	{
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
