package com.linked_list.double_ended_list;

class Link{
	public long dData;
	public Link next; 
	
	public Link(long d){
		dData=d;
	}
	
	public void displayLink(){
		System.out.println(dData+" ");
	}
}

class FirstLastList{
	private Link first;
	private Link last;
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void insertFirst(long dd){
		Link newLink=new Link(dd);
		
		if(isEmpty()){
			last=newLink;
		}
		
		newLink.next=first;
		first=newLink;
	}
	
	public void insertLast(long dd){
		Link newLink=new Link(dd);
		
		if(isEmpty()){
			first=newLink;
		}
		else{
			last.next=newLink;
		}
		last=newLink;
	}
	
	public void displayList(){
		System.out.println("List  (first --> last): ");
		Link current=first;
		while (current != null) {
			current.displayLink();
			current=current.next;
		}
		System.out.println(" ");
	}
}


public class Double_ended {
	public static void main(String[] args) {
		
		FirstLastList theList=new FirstLastList();
		
		theList.insertFirst(22);
		theList.insertFirst(33);
		theList.insertFirst(44);
		theList.insertFirst(55);
		theList.insertFirst(66);
		
		theList.displayList();		
		
		theList.insertLast(101);
		theList.insertLast(102);
		theList.insertLast(103);
		theList.insertLast(104);
		theList.insertLast(105);
		
		theList.displayList();
		
		theList.insertFirst(77);
		theList.insertFirst(88);
		
		theList.displayList();
		
		theList.insertLast(106);
		theList.insertLast(107);
		
		theList.displayList();
	}
}