package com.bridgelabz.workshop2;
public class BinarySearchTree {
	
	int binarySearch(int arr[], int l, int r, int x)
	{
		if (r>=l)
		{
			int mid = l + (r - l)/2;

			if (arr[mid] == x) // element is present at the mid
			{
			return mid;
			}
			 /*
			  * If element is smaller than mid, then
			  *  it is present in left subarray
			  */
			if (arr[mid] > x)
				return binarySearch(arr, l, mid-1, x);
			else
				return binarySearch(arr, mid+1, r, x); // element present in right subarray
		}
	
		return -1; // element is not present
	}

}
