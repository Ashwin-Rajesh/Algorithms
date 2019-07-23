/**************************************************
		Linear Search
---------------------------------------------------
	Linear Search is a brute force algorithm,
meaning it checks all possible solutions and checks
if each is the correct solution.
	Linear search iterates through the entire array
from start to finish. If it finds the search term,
it returns its index. else, it returns -1 to indicate
it was not able to find it.
***************************************************/

public class SE_Linear
{
	public static int search(int[] array, int p)
	{
		int size = array.length;
		for(int i = 0; i < size; i++)
			if(array[i] == p)	return i;
		return -1;									// return of negative value is used to signify that term was not found.
	}
}
