/*
 *	Addition of all element of array
 *
 **/

package com.array;

public class Addition_of_all_element {
	public static void main(String[] args) {
		
		Addition addition=new Addition();
		addition.addition_1d();
	}
}

class Addition{
	protected void addition_1d() {
		
		int [] arr ={1,4,5,7,3,8,-23,34,65};
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println(sum);
	}
}