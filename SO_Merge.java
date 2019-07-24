/************************************************
		Merge Sort
-------------------------------------------------
	Merge sort uses the divide-and-conquer approach
to algorithm design. It breaks the array down into pairs,
and then sort the pair. Then, it takes two pairs and forms
a set of 4 from the pairs that is sorted. Then it takes 2 such sets
and forms a set of 8 that is sorted, and so on... This
merging is done by the merge() function. Really, all
the sorting is done in the merge() function. The sort()
functions are for providing the recursive character.
	Note that size of array needs to be a power
of two.
************************************************/

public class SO_Merge()
{
	public void merge(Comparable[] array, Comparable[] temp, int low, int mid, int high)
	{
		// This loop just copies required part of array[] to temp[]
		for(int i = low; i < high; i++)		temp[i] = array[i];
		
		int i = low, j = mid + 1;
		for(int k = low; k <= high; k++)
		{
			if(i > mid)				array[k] = temp[j++];
			else if(j > high)			array[k] = temp[i++];
			else if(less(temp[j],temp[i]))		array[k] = temp[j++];
			else					array[k] = temp[i++];
		}
		
		// This loop copies the merged section back to array[]
		for(int i = low; i < high; i++)		array[i] = temp[i];
	}
	
	public void sort(Comparable[] array, Comparable[] temp, int low, int high)
	{
		if(low >= high)		return
		int mid = low + (high - low) / 2;
		sort(array, temp, low, mid);
		sort(array, temp, mid + 1, high);
		merge(array, temp, low, mid, high);
	}
	
	public vooid sort(Comparable[] array)
	{
		Comparable[] temp = array.clone();
		sort(array, temp, 0, array.length)
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
