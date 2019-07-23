/***********************************************
		Quick Find
------------------------------------------------
	Quick Find is a solution to the union-find
problem. It stores an id, for each point, which
can be used to identify connected points. All connected
points have the same id. 
	This makes checking if two points are 
connected very easy and fast(constant time), hence 
the name, Quick Find. Union, however is expensive.
The whole set of points have to searched for those
having id equal to one of them, and then their
id has to be changed to that of the other.
***********************************************/

public class UF_QuickFind
{
	private int[] id;
	
	public UF_QuickFind(int N)
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
