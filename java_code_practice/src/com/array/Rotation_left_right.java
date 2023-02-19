/**
 * In this we left and right shift of array
 * 
 * 
 * */
package com.array;

public class Rotation_left_right {

	public static void main(String[] args) {
		
		Rotation_left rLeft=new Rotation_left();
		rLeft.left_int_1d();
		rLeft.left_char_1d();
		
		Rotation_right rRight=new Rotation_right();
		rRight.right_int_1d();
		rRight.right_char_1d();
	}
}


/**
 * Algorithm
 * 
 * For Given Number n 
 * 	for(0--->n)
 * 		j,first;
 * 		first=arr[0]
 * 		for(j=0 -->arr.length-1)
 * 			arr[j]=arr[j+1]
 * 		arr[j]=first 
 * */


class Rotation_left{
	
	protected void left_int_1d(){
		int [] arr={1,2,3,4,5,6,7,8,9};
		
		int n=2;//How much rotation you need
		
		for (int i = 0; i < n; i++) {
			int j,first;
			first=arr[0];
			
			for (j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
			
		}
		
		//print rotated array
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		} 
		
		System.out.println();
		System.out.println();
		
	}
	
	protected void left_char_1d(){
		
		char c_array[]={'a','b','c','d','e'};
		char first;
		int j,n;
		n=2;
		
		for (int i = 0; i < n; i++) {
			first=c_array[0];
			
			for ( j = 0; j < c_array.length-1; j++) {
				c_array[j]=c_array[j+1];
			}
			c_array[j]=first;
		}
		
		for (char c : c_array) {
			System.out.print(c);
		}
		System.out.println();
		System.out.println();
	
	}
}


class Rotation_right{
	
	protected void right_int_1d(){
		
		int [] arr={1,2,3,4,5,6,7,8,9};
		
		int last,j;
		
		int n=2;
		
		for (int i = 0; i < n; i++) {
			
			last=arr[8];
				
			for (j = arr.length-1; j > 0 ; j--) {
				arr[j]=arr[j-1];
			}
			
			arr[j]=last;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println();
	}
	
	protected void right_char_1d(){
		
		char [] c_array={'a','b','c','d','e'};
		
		int last,j;
		int n=2;
		
		for (int i = 0; i < n; i++) {
			last=c_array[4];
			
			for (j = c_array.length-1; j >  0; j--) {
				c_array[j]=c_array[j-1];
			}
			c_array[j]=(char) last;
		}
		
		for (char c : c_array) {
			System.out.print(c);
		}
	
		System.out.println();
		System.out.println();
	}

}