/**
 * 	In This Find The Nth Largest Element And Nth Smallest Element
 * 
 * 
 * */

package com.array;


public class Get_Nth_Largest_And_Nth_Smallest_Element {
	public static void main(String[] args) {
		
		Nth_Largest largest=new Nth_Largest();
		largest.second_Largest();
		largest.third_Largest();
		
		Nth_Smallest smallest=new Nth_Smallest();
		smallest.second_Smallest();
		smallest.third_Smallest();
		
	}

}


//Ascending

class Nth_Largest{

	protected void second_Largest() {
		
		System.out.println("Find The Second Largest ");
		
		int [] arr={1,2,3,4,5,6,7,8,9,0,-1,-2,-3,-8,-9,-10};
		
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
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(arr[arr.length-2]);
	}
	
	protected void third_Largest() {
		
		System.out.println();
		System.out.println("Find The Second Largest ");
	
		int [] arr={1,2,3,4,5,6,7,8,9,0,-1,-2,-3,-8,-9,-10};
		
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]<arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(arr[arr.length-3]);
	}
}



//Descending

class Nth_Smallest{
	
	protected void second_Smallest(){
		
		System.out.println();
		System.out.println("Find the second smallest");
		
		int [] arr={1,2,3,4,5,6,7,8,9,0,-1,-2,-3,-8,-9,-10};
		
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(arr[arr.length-2]);
	}
	
	protected void third_Smallest(){
		System.out.println();
		System.out.println("Find the Third Smallest");
		
		int [] arr={1,2,3,4,5,6,7,8,9,0,-1,-2,-3,-8,-9,-10};
		
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(arr[arr.length-3]);
	}
	
	
}