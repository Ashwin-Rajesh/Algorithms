public class StackArray <Item>
{
	/*
	Stack as an Array
	------------------------------------------------
	Stack implements the LIFO(Last In First Out) concept.
	The last entered element is retreived first.
	
	Here, stack is implemented as an array.
	------------------------------------------------
	*/
	private Item[] stack;
	
	private int size;
	
	public StackArray(int n)
	{
		stack = new Item[n];
		size = 0;
	}
	
	public void push(Item item)
	{
		if(size >= stack.length())		throw new java.lang.IndexOutOfBoundsException("The stack is full");
		else
		
		stack[size] = item;
		size++;
	}
	
	public Item pop()
	{
		if(size == 0)				throw new java.util.NoSuchElementException("The stack is empty");
		else
		
		size--;
		return stack[size];
	}
	
	public boolean IsEmpty()
	{
		if(size == 0)				return true;
		return false;
	}
	
	public int size()
	{
		return size;
	}
}