/************************************************
		Shell Sort
-------------------------------------------------
	Shell sort improves over insertion sort.
In a way, it is a type of insertion sort. A concept
called h-sorting is to be introduced first. The basic
prinnciple of shell sorting is that insertion sort
gets easier for partially sorted arryays. 
	This partial sorting is done by h-sorting, 
in which the array is divided into sub-array, with 
h differerence between their elements, i.e for h = 3,
the elements 0,2,5,8,... are one sub-array, 1,3,6,9,...
another and 2,4,7,10,... another sub-array. Because 
their lengths are smaller than the original sub-array,
insertion sort is much faster. Donald Knuth proposed
that insertion sort be done for all h = 3*x + 1 
(x being an integer) and h < N/3, in decreasing order.
For example, for n = 100, Shell sorting will be done for
	n =  31, 28, 25, 22, 19, 16, 13, 10, 7, 4, 1
	Because the sub-arrays have been partially
sorted before, the insertion sort is substantially
faster. The set of n can be some other set, too.
For this given set, the worst case performance is
n^(3/2).
************************************************/

public class SO_Shell()
{
	public void sort(Comparable[] array)
	{
		int n = arra.length;
		int h = 1;
		for(int i = 1; h < N/3; i++)	h =  (i * 3) + 1;
		
		// This loop just iterates through the set of h, and h-sorts it for that h. Here, the one by D.Knuth is used
		while(h >= 1)
		{
			h_sort(array, h);
			h = h/3;
		}
	}
	
	private void h_sort(Comparable[] array, int h)
	{
		int n = array.length;
		for(int i = 0; i < n; i++)			
			for(int j = i; j >= h && less(array[j],array[j - h]) ; j -= h)
			exchange(array,j,j-h);
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
