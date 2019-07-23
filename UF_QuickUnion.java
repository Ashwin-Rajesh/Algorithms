/***********************************************
		Quick Union
------------------------------------------------
	Quick Union is a solution to the Union Find
problem. It does this in a similiar way to QuickFind,
by storing an id[] for each point in the network.
However, all connected points need nod have the same
id. The data structure works by storing the id of a
point as the position or index of some point it is 
directly connected to. Each point will have a
'root' id, the index of the point with which it
is connected to, which has its index as its id.
This can be thought of as a tree-like structure.
	When two points are connected, The id
of one of their roots is the index of the root of
the other point. To check if two points are
connected, their roots are calculated. If they are
equal, they are connected.
	The process of computing root is the bottleneck
here. It has linear complexity.
***********************************************/

public class UF_QuickUnion
{
	private int[] id;
	
	public UF_QuickUnion(int N)
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
