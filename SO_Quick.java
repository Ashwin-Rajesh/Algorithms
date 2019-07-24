/********************************************
		Quick Sort
---------------------------------------------
	Quick sort is a divide and conquer sorting
algorithm. The array is first shuffled to give
better performance. The first element is selected.
Let us call it the pivot. It is brought to its correct
position in the final arrangement, such that all
elements to its left are < it, and all elements to
its rights is >= it. Then, these parts are recursively
sorted. i.e, the first element of these parts are
processed as above, and then the part to its left and
right are also processed so, until a single element
remains, in which  case it is left as such.
	The randomisation helps make quick sort
perform in close to optimum conditions. It is slowest
for aready sorted arrays. It is also slower if the
array contains many duplicates.
********************************************/

public class SQ_Quick
{
	public void sort(Comparable[] array)
	{
		shuffle(array);
		sort(array, 0, array.length - 1);
	}

	public void sort(Comparable[] array, int low, int high)
	{
		if(high <= low)	return;
		int mid = partition(array, low, high);
		sort(array, low, mid - 1);
		sort(array, mid + 1, high);
	}
	
	public int partition(Comparable[] array, int low, int high)
	{
		int i = low, j = high + 1;
		while(true)
		{
			while(less(arr[++i], arr[low]))	if(i == high)	break;
			
			while(less(arr[low], arr[++j]))	if(j == low)	break;
			
			if(i >= j)	break;
			exchange(array, i, j);
		}
		exchange(array,low,j);
		return j;
	}
	
	public boolean less(Comparable a, Comparable b)
	{
		return a.compareTo(b) < 0;
	}
	
	public void exchange(Comparable array[], int i, int j)
	{
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void shuffle(Comparable[] array)
	{
		Random random = new Random();
		int n = array.length;
		for(int i = size; i > 1; i--)
			swap(array, i-1, random.nextInt(i));
	}
}
