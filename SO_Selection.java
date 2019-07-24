/************************************************
		Selection Sort
-------------------------------------------------
	In selection sort, the array is passed over
n times(n = size of array). In each pass, the
least element in the unsorted part of the array
is brought to its correct position. So, the algorithm
passes from left to right in the array, and brings
the correct element to each position from left to right.
It does this by finding the least value in unsorted part.
	It takes n^2 compares and n exchanges, regardless
of initial array arrangement.
************************************************/

public class SO_Selection()
{
	public void sort(Comparable[] array)
	{
		int n = array.length;
		for(int i = 0; i < n - 1; i++)
		{
			int min = i;
			
			for(int j = i; j < n; j++)
			{
				if(less(array[j], array[min]))	min = j;
			}			
			exchange(array,i,min);
		}
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
