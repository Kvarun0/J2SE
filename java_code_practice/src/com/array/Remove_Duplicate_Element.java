/**
 *	
 *	Remove Duplicate Element Of Array
 *	
 *	-Using Temporary Array
 *	-Using Separate Index
 * 
 **/
package com.array;

public class Remove_Duplicate_Element {
	public static void main(String[] args) {
		
		Remove_Duplicate_Temporary rdtemp=new Remove_Duplicate_Temporary();
		rdtemp.shorted_Array();
		
	}
}	

/*
 * 	- Short The Array(If An Shorted Array Is Reseved)
 * 	-
 * 
 * */


class Remove_Duplicate_Temporary{
	
	//Shorted Array
	protected void shorted_Array() {
		
		int [] arr={10,20,22,23,44,44,49,50,55,55,90};
		int n=arr.length;
		if (n==0 || n==1) {
			System.out.println("There Is no Duplicate element");
		}
		
		int temp[] =new int[n];
		int j=0;
		
		for (int i = 0; i < n-1 ; i++) {
			if (arr[i] != arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		
		temp[j++]=arr[n-1];
		
		for (int i = 0; i < j; i++) {
			arr[i]=temp[i];
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
}











