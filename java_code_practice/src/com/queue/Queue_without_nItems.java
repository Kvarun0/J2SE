/**
 * In this we deal with create queue without tracking the number of element queue have
 */
package com.queue;


class Queue_1{
	private int maxSize;
	private long[] queArrya;
	private int front;
	private int rear;

	public Queue_1(int s){
		maxSize=s;
		queArrya= new long[maxSize];
		front= 0;
		rear= -1;	
	}
	
	//inserting items into queue
	public void insert(long j){
		if (rear == maxSize-1) {
			rear=-1;
		}
		
		queArrya[++rear]=j;
	}
	
	//deletion of items
	public long remove(){
		long temp=queArrya[front++];
		if (front == maxSize) {
			front=0;
		}
		return temp;
	}
	
	//select item
	public long peek(){
		return queArrya[front];
	}
	
	//is full condition
	public boolean isFull(){
		return (rear+2 == front);
	}
	
	//is Empty condition
	public boolean isEmpty(){
		return (rear+1 == front);
	}
}




public class Queue_without_nItems {
	public static void main(String[] args) {
		
		Queue_1 qu=new Queue_1(10);
		
		qu.insert(10);
		qu.insert(20);
		qu.insert(30);
		qu.insert(40);
		qu.insert(50);
		
		qu.remove();
		qu.remove();
		qu.remove();
		qu.remove();
		
		while(! qu.isEmpty()){
			long temp=qu.remove();
			System.out.print(temp+" ");
		}
		
	}
}
