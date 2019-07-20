public class WeightedQuickUnion
{
	/*
	WeightedQuickUnionPathCompr
	------------------------------------------
	This implements Weighted quick union, but adds
	path compression, a system in which the root function
	compresses the path to the root, by setting id[] of
	that point is set to the root.This reduces steps 
	needed to compute root to a very low
	number, and very high long-term improvements are observed.
	
	There is also a one-pass variation possible,
	which sets id[] of each point to that of
	its grand-parent, halving path length to root.
	It saves time on the short term, but compression
	is not as effective, hence it is less effective
	in the long term.
	------------------------------------------
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
