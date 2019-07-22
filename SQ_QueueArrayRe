/*********************************************************
		Resizing Queue Array
----------------------------------------------------------
	Resizing Queue Array implements FIFO concept, using
dynamic resizing arrays. Resizing is done when either current
array's end is reached, in which case it doubles array size,
or if the array is only quarter filled, in which case its size
is halved.

	The resizing process is expensive, so it continuous
resizing has ti be avoided, without wasting too much memory.
*********************************************************/
public class ResizeableQueueArray<Item>
{
	private Item[] queue;
	
	private int beg;
	
	private int end;
	
	public ResizeableQueueArray()
	{
		queue = (Item[]) new Object[1];
		beg = 0;
		end = 0;
	}
	
	public void push(Item item)
	{
		resize();
		queue[end++] = item;
	}
	
	public Item pop()
	{
		resize();
		return queue[beg++];
	}
	
	private int resize()
	{
		if(end >= queue.length)
		{
			Item[] queue_o = queue.clone();
			queue = (Item[]) new Object[(end - beg) * 2];
			for(int i = 0; i < end - beg; i++)
				queue[i] = queue_o[i + beg];
			end = end - beg;
			beg = 0;
			return 1;
		}
		if(end != beg && end- beg <= queue.length / 4)
		{
			Item[] queue_o = queue.clone();
			queue = (Item[]) new Object[(end - beg) * 2];
			for(int i = 0; i < end - beg; i++)
				queue[i] = queue_o[i + beg];
			end = end - beg;
			beg = 0;
			return 1;
		}
		return 0;
	}
	
	public boolean IsEmpty()
	{
		if(end == beg)	return true;
		return false;
	}
	
	public int size()
	{
		return end - beg;
	}
}
