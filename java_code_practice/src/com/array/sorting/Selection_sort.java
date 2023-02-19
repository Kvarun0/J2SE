/*
 * Selection sort in java
 */
package com.array.sorting;

class ArraySel{
	
	private long[] a;
	private int nElement;
	
//	---------------------------
	public ArraySel(int max) {
		a=new long[max];
		nElement=0;
	}

	
//	---------------------------
	public void insert(long value){
		a[nElement] = value;
		nElement++;
	}
	
	
//	---------------------------
	public void display(){
		for (int i = 0; i < nElement; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
	}

	
//	---------------------------
	public void selesort(){
		int out,in,min;
		
		
		for (out = 0; out < nElement-1; out++) {
			min=out;
			
			for(in = out+1 ;in <nElement ;in++) {
				if(a[in] < a[min]){
					min=in;
				}
			}
			swap(out, min);
		}
	}
	
//	---------------------------
	private void swap(int one,int two){
		long temp= a[one];
		a[one]=a[two];
		a[two]=temp;
	}
}



public class Selection_sort {
	public static void main(String[] args) {
		
		
		int maxSize=100;
		
		ArraySel arr;
		arr=new ArraySel(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display();
	
		
		arr.selesort();
		
		arr.display();
	}
}
