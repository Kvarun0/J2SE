/**
 * how to increase array size
 * 
 * Insertion and deletion of array and size of array is changed according to need
 */

package com.array;

public class Array_insertion_deletion {

	public static void insert(long[] a, int i, int x) {
		int n=a.length;
		
		long temp=0;
		for (int j = n-1 ; j > i-1 ; j--) {
			temp=a[j];
			a[j] = a[j-1];
		}
		a[n]=temp;
		
		a[i-1] = x;
		n = n + 1;
		
		for (int j = 0; j < n-1; j++) {
			System.out.print(a[j]);
		}
		System.out.println();	
		
		System.out.println(a.length);
	}
	
	public static void main(String[] args) {
		
		long array[] = { 1, 2, 4, 5, 6};

		insert(array, 2, 3);
	}
}
