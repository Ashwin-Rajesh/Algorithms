/*******************************************************
	Weighted Quick Union with Path Compression
--------------------------------------------------------
	Path compression is a technique in which the trees
in Quick Union is made flatter by changing id[] of the elements
to that of a point lower on the tree dynamically, while 
traversing through the tree when computing root. There are
2 ways in which it is implemented here:

1) A 2-pass variation in which the id is set to the root of
the tree after computing root. This is better in the long run.

2) A single- pass variation which sets the id to that of the
points grandfather. This is better in the short run.
*******************************************************/
public class UF_WeightedQuickUnionPathCompr
{
	private int[] id;
	
	private int[] size;
	
	public UF_WeightedQuickUnionPathCompr(int N)
	{
		id = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i++)
		{
			id[i] = i;
			size[i] = i;
		}
	}
	
	public int root(int p)
	{
		int i = p;
		while( id[i] != i)
		{
			// id[i] = id[id[i]];					// This is the one-pass variation. It sets the id of each point to that of its grandfather
			i = id[i];
		}
		
		// This is the compression pass code. Check how it works!
		int j= p;
		while( id[j] != j)
		{
			id[j] = i;
			j= id[j];
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
	
	public void find(int p, int q)
	{
		return root(p) == root(q);
	}
}
