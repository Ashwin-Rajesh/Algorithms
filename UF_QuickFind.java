public class QuickFind
{
	/*
	About QuickFind
	-----------------------------------------------
	The array id[] stores a number for each point. The
	points are represented by numbers from 0, and this
	number can be called their 'index'. The structure 
	of Quick find is such that the value stored in id[]
	for each index is same for all connected points.
	
	constructor():	Initialises id[]
	All points are initialised with id[] equal to their
	index. This takes *linear time*
	
	connected(): 	Function checks if two points of given indices are connected
	The structure of Quick find is such that the value
	stored in id[] for each index is same for all 
	connected points. So, to check if two points are
	connected, we just need to check the value of 
	id[] at that index. So, find takes *constant time*.
	
	union(): 	Function connects two points whose indices are given
	To connect two points together, we change the id[]
	of all points connected to one point to the id[]
	of the other. This takes *linear time*.
	-----------------------------------------------
	*/
	private int[] id;
	
	public QuickFind(int N)
	{
		id = new int[N];
		for(int i = 0; i < N; i++)
			id[i] = i;
	}
	
	public void union(int p, int q)
	{
		int p_id = id[p];
		int q_id = id[q];
		for(int i = 0; i < id.length(); i++)
			if(id[i] == p_id) id[i] = q_id;
	}
	
	public boolean connected(int p, int q)
	{
		return id[p] == id[q];
	}
}
