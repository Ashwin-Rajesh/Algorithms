/************************************************
		Bottom-up Merge Sort
-------------------------------------------------
	This is an alternative version of Merge Sort
that does not need recursion. It achieves this by
using loops to first sort in pairs in the whole array,
then in sets of 4, then in sets of 8 and so on. Performance
characteristics are similiar to original Merge Sort.
************************************************/
public class SO_MergeNoRec()
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
	
	public vooid sort(Comparable[] array)
	{
		Comparable[] temp = array.clone();
		
		int n = array.length;
		
		for(int i = 1; i < n; i *= 2)
		{
			for(int j = 0; j < n - i; j+= i * 2)
			{
				merge(array, temp, j, j + i - 1, j + Math.min((2 * i) - 1, n - 1));
			}
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
