public class QueueArray <Item>
{
	/*
	Queue as Array
	-----------------------------------------------------
	Queue implements the FIFO concept(First In First Out).
	The first element to be entered is retreived first.
	
	Here, queue is implemented as an array.
	-----------------------------------------------------
	*/
	private Item[] queue;
	
	private int beg;
	
	private int end;
	
	public QueueArray(int n)
	{
		queue = new Item[n];
		beg = 0;
		end = 0;
	}
	
	public void push(Item item)
	{
		if(end >= queue.length())
		{
			if(beg == 0)						throw new java.lang.IndexOutOfBoundsException("The queue is full");
			
			for(int i = 0; i < end - beg; i++)
			{
				queue[i] = queue[i + beg];
			}
			end = end - beg;
			beg = 0;
		}
		
		queue[end] = item;
		end++;
	}
	
	public Item pop()
	{
		if(end == beg)							throw new java.util.NoSuchElementException("The queue is empty");
		
		beg++;
		return queue[beg - 1];
	}
	
	public boolean IsEmpty()
	{
		if(beg == end)	return true;
		return false;
	}
	
	public int size()
	{
		return end - beg;
	}
}
