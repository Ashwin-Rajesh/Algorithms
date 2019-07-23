/*************************************************
		Weighted Quick Union
--------------------------------------------------
	Weighted Quick Union is an improvement over
Quick Union. The process of finding root is the
bottneck in Quick Union, Because the 'trees' can
get very tall. The trees can be made a bit flatter
if the union process is 'weighed', i.e the smaller
tree is attached onto the larger one, than vice-versa.
This means average case performance of finding root
improves.
*************************************************/
public class WeightedQuickUnion
{  
	private int[] id;
	
	private int[] size;
	
	public QuickUnion(int N)
	{
   		id = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i++)
		{
			id[i] = i;
			size[i] = 1;
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
