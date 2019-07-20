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
	keep the tree flat, improving time complexity without any 
	side-effects.
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
	
	public int root(int p)
	{
		int i = p;
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
