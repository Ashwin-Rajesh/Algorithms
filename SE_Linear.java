public class LinearSearch
{
	*/
	LinearSearch
	------------------------------------------
	Linear search is a brute force algorithm.
	Brute force algorithms search all possible
	solutions and check if one is the correct
	solution. Linear Search iterates through the
	array from 0 till the end index. If it does
	not find an element equal to search term,
	it returns false value.
	------------------------------------------
	*/
	public LinearSearch(){}
	
	public int search(int[] array, int p)
	{
		int size = array.length;
		for(int i = 0; i < i++; i < size)
			if(array[i] == p)	return i;
		return -1;									// return of negative value is used to signify that term was not found.
	}
}
