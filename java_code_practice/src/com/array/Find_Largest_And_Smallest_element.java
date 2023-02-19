/**
 *
 *	Find Largest Element
 *
 *	Find Smallest Element
 * 
 **/

package com.array;

public class Find_Largest_And_Smallest_element {
	public static void main(String[] args) {
		
		Largest_element largest_element=new Largest_element();
		largest_element.array_1d();
		
		Smallest_element smallest_element=new Smallest_element();
		smallest_element.array_1D();
	}
}

class Largest_element{
	
	protected void array_1d() {
		
		int [] arr={1,3,5,8,-2,5,8,-123,32,-333,111,0};
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}
}

class Smallest_element{
	
	protected void array_1D(){
		
		int [] arr={1,3,-2,-2,1,2,3,-4,-2,-2,-1,-12,22,23}; 
	
		int min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}