/********************************************************
		Queue as Linked List
---------------------------------------------------------
	Queue implements the FIFO(First In First Out) concept.
The first value to be entered is the one that will be retrieved
the first.
	Here, it is implemented as a linked list. The class
maintains two nodes of the linked list, one of the end and one
of the beginning. The nodes are added to the end and removed
from the beginning.
********************************************************/

public class SQ_QueueLinked <Item>
{
	private class Node
	{
		public Item item;
		
		public Node next;
	}
	
	private Node end;
	
	private Node beg;
	
	public SQ_QueueLinked()
	{
		end = null;
		beg = null;
	}
	
	public void push(Item item)
	{
		Node temp = new Node();
		temp.item = item;
		temp.next = null;
		if(end == null)
		{
			end = temp;
			beg = temp;
		}
		else
		{
			end.next = temp;
			end = temp;
		}
	}
	
	public Item pop()
	{
		if(beg == null)				throw new java.util.NoSuchElementException();
		Node temp = beg;
		beg = beg.next;
		return temp.item;
	}
	
	public boolean IsEmpty()
	{
		if(beg == null)	return true;
		return false;
	}
}
