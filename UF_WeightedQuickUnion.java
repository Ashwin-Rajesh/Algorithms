public class WeightedQuickUnion
{
	/*
	About WeightedQuickUnion
	-----------------------------------------------
	Weighted Quick Union is a small improvement over
	Quick Union, that reduces steps needed to find a root
	in worst case. The array, id[] stores connected points'
	index. Another array, size[] is needed to keep size of
	trees in track. This will be referred when the size is
	checked while connecting elements together. Smaller trees
	are connected onto the root of larger ones. This can help
	keep the tree flat.

	constructor():	Initialises id[]
	All points are initialised with id[] equal to their
	index. This takes *linear time*
	
	connected(): 	Function checks if two points of given indices are connected
	The structure of Quick Union is such that the id[]
	stores index of its immediate neighbour. So, to
	check connection, we need to find the 'root' of the
	points, ie, the point whose id[] is equal to its index,
	and compare their roots. Takes *linearithmetic time*.
	
	union(): 	Function connects two points whose indices are given
	To connect two points together, we change the id[]
	of root of one point to the index of the root of 
	the other. The size[] array is referred to ensure that
	smaller arrays are connected onto larger ones to reduce
	steps needed to compute root. This takes *linearithmetic time*.
	
	root():		Calculates the 'root' of the point whose index is given
	Is a recurssive function that returns the index
	of point whose id[] is equal to its index. Takes
	*linearithmetic time*. Better than just QuickUnion.
	-----------------------------------------------
	*/
  
	private int[] id;
	
	private int[] size;
	
	public QuickUnion(int N)
	{
   		id = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i++)
		{
			id[i] = i;
			size[i] = i;
		}
	}
	
	public int root(int i)
	{
		while( id[i] != i)
		{
			i = id[i];
		}
		return i;
	}
	
	public void union(int p, int q)
	{
		int i = root(p);
		int j = root(q);
		if(size[i] > size[j])
		{
			id[j] = i;
			size[i] += size[j];
		}
		else
		{
			id[i] = j;
			size[j] += size[i];
		}	
	}
  
	public void connected(int p, int q)
	{
		return root(p) == root(q);
	}
}
