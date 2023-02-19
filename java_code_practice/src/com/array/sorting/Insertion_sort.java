package com.array.sorting;



class ArrayIns{

	private long[]a;
	private int nElement;
	private long temp;
	
//	--------------------------------
	public ArrayIns(int max){
		a=new long[max];
		nElement=0;
	}
	
//	--------------------------------	
	public void insert(long value){
		a[nElement]=value;
		nElement++;
	}
	
//	--------------------------------
	public void display(){
		
		for (int i = 0; i < nElement; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
	}
	
//	--------------------------------
	public void insertionSort(){

		int j;
		for (int i = 0; i < nElement; i++) {
			temp= a[i];
			j=i;
			
			while (j>0 && a[j-1] >= temp) {
				a[j]=a[j-1];
				--j;
			}
			a[j]=temp;
		}
		
	}

}


public class Insertion_sort {
	public static void main(String[] args) {
		
		int maxSize=100;
		
		ArrayIns arr;
		arr=new ArrayIns(maxSize);
		
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
		
		arr.insertionSort();
		
		arr.display();
		
	}
}





