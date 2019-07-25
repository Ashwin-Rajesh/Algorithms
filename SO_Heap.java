/********************************************
		Heap Sort
---------------------------------------------
	Heap sort uses binary heaps for sorting.
A binary heap is a data structure, shaped like
a tree, with a 'root' element, typically stored
in index 1 that has 2 branches. These two branches
contain elements that are smaller than the root.
These elements have indices 2, 3. These elements
themselves have 2 branches n each with indices
4, 5, 6, 7 and so on. The rule that the parent
element > its daughters is always followed. Hence,
the first element is always the largest.
	The heap is actually stored in an array.
Parent of an element is the half of that elements
index(integer division). The children of an element
is 2x and 2x + 1.
********************************************/
