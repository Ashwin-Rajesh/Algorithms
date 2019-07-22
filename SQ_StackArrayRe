/****************************************************
		Resizing Stack Array
-----------------------------------------------------
	Resizing Stack Arrays implement FIFO using arrays,
but does not need to be initialised with max size. Their
size changes dynamically, managed by the object.
	When stack becomes full, the array size is
doubled. When the array is quarter-full, its size is
halved. This resizing is an expensive process. This
way of resizing reduces frequency of resizing needed.
****************************************************/

public class ResizeableStackArray <Item>
{
	private Item[] stack;
	
	private int size;				// Note : not actual size of array, but number of elements stored in stack
	
	public ResizeableStackArray()
	{
		stack = (Item[]) new Object[1];
		size = 0;
	}
	
	public void push(Item item)
	{
		resize();
		stack[size++] = item;
	}
	
	public Item pop()
	{
		resize();
		return stack[--size]; 
	}
	
	private int resize()
	{
		if(size >= stack.length)
		{
			Item[] stack_o = stack.clone();
			stack = (Item[]) new Object[size * 2];
			for(int i = 0; i < size; i++)
				stack[i] = stack_o[i];
			return 1;
		}
		if(size != 0 && size <= stack.length/4)
		{
			Item[] stack_o = stack.clone();
			stack = (Item[]) new Object[size * 2];
			for(int i = 0; i < size; i++)
				stack[i] = stack_o[i];
			return 1;
		}						// Return of 0 => Resizing was not done	
		return 0;					// Return of 1 => Resizing was needed,
	}
	
	public boolean IsEmpty()
	{
		if(size == 0)	return true;
		return false;
	}
	
	public int size()
	{
		return size;
	}
}
