public class ST_BinarySearch<Key, Value>
{
	private Key[] 	keys;
	private Value[] values;
	private int 	size;
	private int 	lim;
	
	public ST_BinarySearch()
	{
		lim  	= 10;
		keys 	= new key[lim];
		values 	= new values[lim];
		size 	= 0;
	}
	
	// Inputs data into
	public void put(Key k, Value v)
	{
		int index = find(k, 0, size);
		
		
	}
	
	// This is a binary search
	private int find(Key k, int low, int high)
	{
		int mid = (high + low)/ 2;
		
		if(low > high)
			return index * -1;
		if(k > keys[mid])
			return find(k, mid, high);
		if(k < keys[mid])
			return find(k, low, mid);
		if(k == keys[mid])
			return mid;
	}
}
