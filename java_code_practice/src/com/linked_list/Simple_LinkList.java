package com.linked_list;

class Link{
	public int iData; //key
	public double dData; //data item
	public Link next; //next link in list
	
	//constructor
	public Link(int id ,double dd){
		iData=id;
		dData=dd;
	}
	
	public void displayLink(){
		System.out.println("{ "+iData+" , "+ dData +"} ");
	}
}


class LinkList{
	private Link first;
	
	//constructor
	public LinkList(){
		first=null;
	}
	
	public boolean isEmpty(){
		return (first==null);
	}
	
	
	//For Insert
	public void insertFirst(int id,double dd){
		Link newLink=new Link(id,dd);
		newLink.next=first;
		first=newLink;
	}
	
	//For Delete
	public Link deleteFirst(){
		Link temp=first;
		first=first.next;
		return temp;
	}
	
	//For Display
	public void displayList(){
		System.out.println("List (first --> last) : ");
		Link current=first;
		while (current !=null) {
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}
}


public class Simple_LinkList {
	public static void main(String[] args) {
		
		LinkList theList=new LinkList();
		
		theList.insertFirst(22, 2.22);
		theList.insertFirst(33, 3.33);
		theList.insertFirst(44, 4.44);
		theList.insertFirst(55, 5.55);
		theList.insertFirst(66, 6.66);
		theList.insertFirst(77, 7.77);
		
		theList.displayList();
			
		while(!theList.isEmpty()){
			Link aLink=theList.deleteFirst();
			System.out.println("Deleted ..");
			
			aLink.displayLink();
			System.out.println("");
		}
		
		theList.displayList();
	}	
}

