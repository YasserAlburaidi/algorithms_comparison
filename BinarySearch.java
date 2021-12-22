/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package binarysearch;
class BinarySearch { 
	int binarySearch(int arr[], int x) 
	{ 
		int l = 0, r = arr.length - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 
                        
			if (arr[m] == x) 
				return m; 
                        
			if (arr[m] < x) 
				l = m + 1; 
			else
				r = m - 1; 
		} 
		return -1; 
	} 
	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = {10,20,30,40,50,60,70,80,90 }; 
		int n = arr.length; 
		int x = 50; 
		int result = ob.binarySearch(arr, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
							+ "index " + result); 
	} 
} 

