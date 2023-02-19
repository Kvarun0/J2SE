/**
 *	Print the element of array that is on odd location  
 * 	-integer
 * 	-char
 * 
 * 	Print the element of array that is on even location
 *  -integer
 *  -string
 *  
 *  
 *  Find the odd and even element from given array
 *   
 **/


package com.array;

public class Element_On_Odd_Add_Even_Location {
	public static void main(String[] args) {
		
		//odd position element
		Odd_Position odd_Position=new Odd_Position();
		odd_Position.array_1D_int();
		odd_Position.array_1D_char();

		//Even position element
		Even_Position even_Position=new Even_Position();
		even_Position.array_1D_int();
		even_Position.array_1D_String();
		
		
		//Find Odd and Even Element
		
		Find_Element felement=new Find_Element();
		felement.find_odd_element();
		felement.find_even_element();
		
	}
}


/*
 * 1,3,5,7,9,..........
 * 
 * */

class Odd_Position{
	
	protected void array_1D_int() {
		
		int [] arr_1d={0,1,2,3,4,5,6,7,8,9};
		
		System.out.println("Odd Position 1D Int Array");
		
		for (int i = 0; i < arr_1d.length; i++) {
			if (i%2!=0) {
				System.out.print(arr_1d[i]+" ");
			}
		}
		
	}
	
	protected void array_1D_char(){

		char [] arr_1d_char={'a','b','c','d','e','f','g','h','i','j'};
		System.out.println();
		
		System.out.println("Odd Position 1D Char Array");
		
		for (int i = 0; i < arr_1d_char.length; i++) {
			if (i%2 != 0) {
				System.out.print(arr_1d_char[i]+" ");
			}
		}
	}
}



/*
 * 
 * 0,2,4,6,8,.........
 * 
 * */

class Even_Position{

	protected void array_1D_int() {

		int [] arr_int_1d={0,1,2,3,4,5,6,7,8,9};
		
		System.out.println();
		System.out.println("Even Position 1D Array");
		
		for (int i = 0; i < arr_int_1d.length; i++) {
			if (i%2 ==0) {
				System.out.print(arr_int_1d[i]+" ");
			}
		}
	
		
	}
	
	
	protected void array_1D_String(){
		
		String [] string_1d={"varun","mayur","dhruve","ketan"};
		
		System.out.println();
		System.out.println("Odd Position 1D Array");
		
		for (int i = 0; i < string_1d.length; i++) {
			if (i%2==0) {
				System.out.print(string_1d[i]+" ");
			}
		}
	}

}

class Find_Element{

	int [] arr={2,4,6,8,10,11};
	
	protected void find_odd_element(){
			
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}

	protected void find_even_element() {
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	
}



