/*******************************************
		Quick Select
--------------------------------------------
	Quick select is a way to select kth largest
or smallest number from an array. It works similarly
to quick sort, hence the name. It uses the same
partition() function.
*******************************************/

public class SE_QuickSel
{
	public Comparable select(Comparable[] array, int k)
	{
		shuffle(array);
		
		int low = 0; high = array.length - 1;
		while(high > low)
		{
			int pos = partition(a, low, high);
			if(pos > k)		high = pos - 1;
			else	if(pos < k)	low = pos + 1;
			else			return array[k];
		}
		return array[k];
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
	
	public void shuffle(Comparable[] array)
	{
		Random random = new Random();
		int n = array.length;
		for(int i = size; i > 1; i--)
			swap(array, i-1, random.nextInt(i));
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
}
