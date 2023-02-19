/*
 * Bubble sort in java 
 * 
 */
package com.array.sorting;


class ArrayBub{
	
	private long[] a;
	private int nElement;
	
//	-------------------------------	
	public ArrayBub(int max) {		//constructor
		
		a=new long[max];			// create array
		nElement=0;
		
	}


//	-------------------------------
	public void insert(long value) {	//put element into array
		
		a[nElement] = value;	//insert
		nElement++;
		
	}

	
//	-------------------------------	
	public void display(){		//display array content
		
		for (int i = 0; i < nElement; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
	}
	

//	-------------------------------
	public void bubbleSort(){
		
		for (int i = 0; i < nElement - 1; i++) {
			for (int j = 0; j <  nElement-i-1  ; j++) {
				if (a[j+1] < a[j]) {
					swap(j,j+1);
				}
			}
		}
	}

	
//	-------------------------------
	private void swap(int one,int two){
		long temp=a[one];
		a[one]=a[two];
		a[two]=temp;
	}


} //end of ArrayBub class



public class Bubble_sort {
	public static void main(String[] args) {
		
		int maxSize=100;
		
		ArrayBub arr;
		
		arr=new ArrayBub(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(-5);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(4);
		
		
		arr.display();
		
		arr.bubbleSort();
		
		arr.display();
	}
}
