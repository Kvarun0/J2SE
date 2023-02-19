package com.linked_list;


class Link_Find{
	public int iData;
	public double dData;
	public Link_Find next;
	
	public Link_Find(int id,double dd){
		iData=id;
		dData=dd;
	}
	public void displayLink(){
		System.out.println("{ "+iData+" , "+dData+" }");
	}
}

class LinkList_Find{
	private Link_Find first;
	
	public LinkList_Find(){
		first=null;
	}
	
	//for insert
	public void insertFirst(int id,double dd){
		Link_Find newLink_Find=new Link_Find(id, dd);
		newLink_Find.next=first;
		first=newLink_Find;
	}
	
	//for finding
	public Link_Find find(int key){
		Link_Find current = first;
		while(current.iData != key){
			if(current.next==null){
				return null;
			}
			else{
				current=current.next;
			}
		}		
		return current;
	}
	
	
	//for delete
	public Link_Find delete(int key){
		Link_Find current=first;
		Link_Find previous=first;
		
		while(current.iData != key){
			if(current.next==null){
				return null;
			}
			else{
				previous=current;
				current=current.next;
			}
		}
		
		if(current == first){
			first=first.next;
		}
		else{
			previous.next=current.next;
		}
		
		return current;
	}
	
	
	//for display
	public void displayList(){
		System.out.println("List (first --> last) : ");
		Link_Find current=first;
		
		while (current!=null) {
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}
}



public class Simple_LinkList_Find_Delete {
	public static void main(String[] args) {
		
		LinkList_Find newLink_List=new LinkList_Find();
		
		newLink_List.insertFirst(1, 1.11);
		newLink_List.insertFirst(2, 2.22);
		newLink_List.insertFirst(3, 3.33);
		newLink_List.insertFirst(4, 4.44);
		newLink_List.insertFirst(5, 5.55);
		newLink_List.insertFirst(6, 6.66);
		newLink_List.insertFirst(7, 7.77);
		newLink_List.insertFirst(8, 8.88);
		newLink_List.insertFirst(9, 9.99);
		
		newLink_List.displayList();
		
		
		Link_Find f=newLink_List.find(6);
		if(f != null){
			System.out.println("Found link with key "+ f.dData);
		}
		else{
			System.out.println("Can't find link ");
		}
		
		Link_Find d=newLink_List.delete(1);
		if(d!=null){
			System.out.println("Deleted link with key "+ d.dData);
		}
		else{
			System.out.println("Can't delete link");
		}
		
		newLink_List.displayList();
	}
}
