package com.array;

public class Array_Reverse_Order {
	
	public static void main(String[] args) {
		Reverse reverse=new Reverse();
		reverse.array_1D_int();
	}
}


class Reverse{
	protected void array_1D_int() {
		
		int [] a={1,2,3,4,5,6};
		
		for (int i = a.length-1; 0 <= i ; i--) {
			System.out.print(a[i]);
		}
	}
	
}