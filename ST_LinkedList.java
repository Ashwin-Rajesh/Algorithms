public class ST_LinkedList<Key, Value>
{
	private class Node
	{
		private Key k;
		private Value v;
		private Node next;
	}
	Node first;
	
	public ST_LinkedList()
	{
		first = null;
	}
	
	public void put(Key k, Value v)
	{
		if(first == null)
		{
			first = new Node();
			first.k = k;
			first.v = v;
			first.next = null;
			return;
		}
		
		Node temp = first
		while(true)
		{
			if(temp.k.equals(k))
			{
				temp.v = v;
				return;
			}
			if(temp.next == null)
				break;
			temp = temp.next;	
		}
		
		Node new = new Node();
		new.k = k;
		new.v = v;
		new.next = first;
		first = new;
	}
	
	public Value get(Type t)
	{
		Node temp = first;

		while(true)
		{
			if(temp.k.equals(k))
				return temp.v;
			if(temp.next == null)
				break;
			temp = temp.next;	
		}
		return null;
	}
	
	public void contains(Type t)
	{
		Node temp = first;
		
		while(true)
		{
			if(temp.k.equals(k))
				return true;
			if(temp.next == null)
				break;
			temp = temp.next;	
		}
		return false;
	}
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
	int size()
	{
		if(first == null)
			return 0;
		
		int count = 0;	
		Node temp = first;
		
		while(true)
		{
			if(temp.next == null)
				break;
			temp = temp.next;
			count++;
		}
		
		return count;
	}
	
	public void delete(Type t)
	{
		Node temp = first;
		Node prev = null;
		
		while(true)
		{
			if(temp.k.equals(k))
			{
				if(temp == first)
				{
					first = first.next;
					return;
				}
				prev.next = temp.next;
			}
			
			if(temp.next == null)
				break;
			
			prev = temp;	
			temp = temp.next;	
		}
		return null;
	}
	
	public Iterable<Key> keys()
	{
		if(first == null)
			return null;
	
		Stack<Key> kys = new Stack();
		temp = first;
		
		while(true)
		{
			kys.push(temp.k);
			
			if(temp.next == null)
				break;
			
			temp = temp.next;
		}
		
		return kys;
	}
}
