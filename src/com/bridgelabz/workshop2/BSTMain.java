package com.bridgelabz.workshop2;
import java.util.Scanner;

public class BSTMain {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		BinarySearchTree bTree = new BinarySearchTree();
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements of binary tree");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("elemets are : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("enter value for x");
	 	int x = sc.nextInt();
			int result = bTree.binarySearch(arr,0,n-1,x);
		if (result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index " +
												result);
	}

}


