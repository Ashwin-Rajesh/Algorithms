/*******************************************************
		Stack as Linked List
--------------------------------------------------------
	Stack implements LIFO(Last In First Out) concept.
So, the first element to be added will be the first one
to be retreived.
	Here, it is implemented as a Linked list, maintaining
only a pointer to the last node. This node switches to
the next when that value is retreived.
*******************************************************/

public class StackLinkedList <Item>
{
	private class Node
	{
		public Item item;
		
		public Node next;
	}
	
	private Node end;
	
	public StackLinkedList()
	{
		end = null;
	}
	
	public void push(Item item)
	{
		Node temp = new Node;
		temp.item = item;
		temp.next = end;
		end = new;
	}
	
	public Item pop()
	{
		if(end == null)			throw new java.util.NoSuchElementException();
		Node temp = new Node;
		temp = end;
		end = end.next;
		return temp.item;
	}
	
	public boolean IsEmpty()
	{
		if(end == null)	return true;
		return false;
	}
}
