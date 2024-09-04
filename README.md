# Searching
searching algorithms in java

Linear Search: Linear search is the simplest search algorithm that checks each element in a list sequentially until the desired element is found or the list ends. It is easy to implement but inefficient for large datasets, with a time complexity of O(n). Linear search is best used when the list is unsorted or small.

Binary Search: Binary search is a more efficient algorithm that works on sorted lists. It repeatedly divides the search interval in half, comparing the target value with the middle element. If the target is equal to the middle element, the search is complete; if not, the search continues in the relevant half of the list. This method has a time complexity of O(log n), making it much faster than linear search for large, sorted datasets.

Interpolation Search: Interpolation search is an improved variant of binary search, designed for uniformly distributed sorted arrays. It estimates the position of the target value based on the value's relation to the range of the list. While more efficient than binary search in some cases, with an average time complexity of O(log log n), its performance can degrade to O(n) if the data is not uniformly distributed.

Git repo link: https://github.com/akhilpgvr/Searching/tree/master/src
