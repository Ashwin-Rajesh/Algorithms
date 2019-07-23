/*************************************************
		Stack as Array
--------------------------------------------------
	Stack implements the LIFO(Last In First Out)
concept. The element that is entered or pushed into
the stack the last is the one to be retrieved the first.

	here, it is implemented using a non-resizing array.
*************************************************/

public class SQ_StackArray <Item>
{
	private Item[] stack;
	
	private int size;
	
	public SQ_StackArray(int n)
	{
		stack = (Item[])new Object[n];
		size = 0;
	}
	
	public void push(Item item)
	{
		if(size >= stack.length)		throw new java.lang.IndexOutOfBoundsException("The stack is full");
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
