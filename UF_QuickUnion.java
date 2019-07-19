public class QuickUnion
{
	/*
	About QuickUnion
	-----------------------------------------------
	The array id[] stores a number for each point. The
	points are represented by numbers from 0, and this
	number can be called their 'index'. The structure 
	of Quick Union is such that the value stored in id[]
	of an index of a point will be of points immediately
	connected to it.
	
	constructor():	Initialises id[]
	All points are initialised with id[] equal to their
	index. This takes *linear time*
	
	connected(): 	Function checks if two points of given indices are connected
	The structure of Quick Union is such that the id[]
	stores index of its immediate neighbour. So, to
	check connection, we need to find the 'root' of the
	points, ie, the point whose id[] is equal to its index,
	and compare their roots. Takes *linear time*. Most
	time is used to compute root.
	
	union(): 	Function connects two points whose indices are given
	To connect two points together, we change the id[]
	of root of one point to the index of the root of 
	the other. This takes *linear time*. Most time is
	used to compute root.
	
	root():		Calculates the 'root' of the point whose index is given
	Is a recurssive function that returns the index
	of point whose id[] is equal to its index. Takes
	*linear time*
	-----------------------------------------------
	*/
	private int[] id;
	
	public QuickUnion(int N)
	{
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
	}
	
	public int root(int i)
	{
		while( id[i] != i) i = id[i];
		return i;
	}
	
	public void union(int p, int q)
	{
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
	
	public void find(int p, int q)
	{
		return root(p) == root(q);
	}
}
