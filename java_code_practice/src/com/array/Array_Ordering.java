/*
*	Array Ordering
*
*	-Ascending
*
*	-Descending 
**/
package com.array;

public class Array_Ordering {
	public static void main(String[] args) {
		
		Ascending ascending=new Ascending();
		ascending.array_1d();
		
		Descending descending=new Descending();
		descending.array_1d();
	}
}


class Ascending{
	
	protected void array_1d() {
		int [] arr={1,2,-3,4,0,-2 ,-1,5,7,9,-2,4};
		
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {	
				if (arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
}

class Descending{
	
	protected void array_1d(){
		System.out.println();
		
		int [] arr={0,2,43,-4,-6,12,2,-222,1,22,333,10};
		
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	
}