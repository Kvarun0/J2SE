/*
 * we do insertion sort on object 
 */
package com.array.sorting;


//	%%%%%%%%%%%%%%%%%%%%%%%
class Pearson{
	private String firstName;
	private String lastName;
	private int age;
	
	public  Pearson(String last,String first,int a){
		lastName=last;
		firstName=first;
		age=a;
	}
	
//	--------------------------------------------------------
	public void displayPerson(){
		System.out.print(" Last Name : " + lastName);
		System.out.print(" First Name : "+ firstName);
		System.out.println(" Age : " + age);
	}

//	--------------------------------------------------------
	public String getLast(){
		return lastName;
	}
}


//	%%%%%%%%%%%%%%%%%%%%%%%%
class ArrayInOb{
	private int nElems;
	private Pearson[] a;
	
	public ArrayInOb(int max){
		a=new Pearson[max];
		nElems=0;
	}
	
	
//	--------------------------------------------------------
	public void insert(String last,String first,int age){
		a[nElems]=new Pearson(last, first, age);
		nElems++;
	}
	
//	--------------------------------------------------------
	public void display(){
		for (int i = 0; i < nElems; i++) {
			a[i].displayPerson();
		}
		System.out.println(" ");
	}
	
//	--------------------------------------------------------
	
	public void insertionSort(){
		int i,j;
		
		for(i=1 ; i < nElems ;i++){
			
			Pearson temp=a[i];
			j=i;
			
			while (j>0 &&  a[j-1].getLast().compareTo(temp.getLast())>0) {
				a[j]=a[j-1];
				--j;
			}
			a[j]=temp;
		}
	}
}


//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public class Sorting_Object_Insertion {

	public static void main(String[] args) {
		int maxSize=100;
		
		ArrayInOb arr;
		arr=new ArrayInOb(maxSize);
		
		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Doc", 59);
		arr.insert("Smith", "Paul", 37);
		arr.insert("Yee", "Tom", 43);
		arr.insert("Hashimoto", "Sato", 21);
		arr.insert("Velasquez", "Jose", 72);
		arr.insert("Vang", "Minh", 22);
		arr.insert("Creswell", "Lucinda", 18);
		
		arr.display();
		
		arr.insertionSort();
		
		arr.display();
	}
}
