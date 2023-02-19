/**
 * find the frequency of element 
 * 
 * 	1D	int 	
 * 
 * 
 * print the duplicate element of array
 * 
 * 	1D	
 * 	2D	
 * 
 * */
package com.array;

public class Find_Frequency_Of_Element {
	public static void main(String[] args) {
	
		//Frequency of element
		frequency_of_element felement=new frequency_of_element();
//		felement.frequency_1D_int();
//		felement.frequency_1D_char();
		felement.frequency_2D_int();
		
		//
		//
		//Find duplicate number
		Duplicate_Number dNumber=new Duplicate_Number();
//		dNumber.duplicate_1D_int();
//		dNumber.duplicate_1D_char();
		dNumber.duplicate_2D_int();
		
	}
}


/**
 *	Algorithm For Frequency Count
 *	
 *	1>	create other array of same size (fr)
 *	
 *	2>	set visited its  useful for finding different array(-1)  	
 *
 *	3>	for array
 *		-	set count (1)
 *		  
 *		-	if(arr[i]==arr[j])
 *		-	count++
 *		-	fr[j]=visited
 *		
 *		-	if(fr[i]!=visited)
 *
 *		-	fr[i]=count
 *
 *
 
 */		

class frequency_of_element{
	
	protected void frequency_1D_int() {
		
		int [] arr={1,9,4,7,3,7,2,6,8,3,7,2,3,6,1,5,8,9};
		
		int [] fr=new int[arr.length];
		
		int visited=-1;
		
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
					fr[j]=visited;//Rows Nth element status
				}
			}
			
			if (fr[i] != visited) {
				fr[i]=count;//In Single Element
			}
		}
		
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited) {
				System.out.println(arr[i]+" | "+ fr[i] );
			}
		}
		
	}	

	
	protected void frequency_2D_int() { 
	
		
	}
		
	
	protected void frequency_1D_char(){
		
		char [] arr ={'a','b','c','a','c','r','m','w','o','b'};
		
		int [] fr=new int[arr.length];
		
		int visited=-1;
		
		for (int i = 0; i < arr.length; i++) {
			
			int count=1;
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
				}
			}
			
			if (fr[i] != visited) {
				fr[i]=count;
			}
		}
		
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited) {
				System.out.println(arr[i]+" "+fr[i]);
			}
		}
		
	}

}


/**
 * Algorithm for find duplicate number
 * 
 * 	for loop for i
 * 		for loop for (i+1) Number comparison
 * 			if(arr[i]==arr[j])
 * 				sout(arr[i])
 * 
 * */

class Duplicate_Number{
	
	protected void duplicate_1D_int(){
			int [] arr ={1,2,3,4,5,6,7,8,9,4,5,1,9};
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i]==arr[j]) {
						System.out.println(arr[j]);
					}
				}
			}
	}
	
	protected void duplicate_1D_char(){
		char [] char_arr ={'a','b','z','x','d','c','a','d','z'};
		
		for (int i = 0; i < char_arr.length; i++) {
			for (int j =i+1; j < char_arr.length; j++) {
				if (char_arr[i]==char_arr[j]) {
					System.out.println(char_arr[j]);
				}
			}
		}
	}	
	
	protected void duplicate_2D_int(){
		
		int [][] arr_2d={{1,1},{3,1}}; 
		
		for (int i = 0; i < arr_2d.length; i++) {
			for (int j = 0; j < arr_2d.length; j++) {
			
			}
		}
	}
	
}











