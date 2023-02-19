/**
 * Define priority queue using array
 */

package com.queue;

class P_Queue{
	private int maxSize;
	private long[] queArray;
	private int nItems;
	
	public P_Queue(int s){
		maxSize=s;
		queArray=new long[maxSize];
		nItems=0;
	}
	
	public void insert(long item){
		int j;
		
		//If Queue is Empty
		if(nItems==0){
			queArray[nItems++]=item;
		}
		
		//If Queue is not empty
		else{
			for(j=nItems-1;j>=0;j--){
				if (item > queArray[j]) {
					queArray[j+1]=queArray[j];
				}
				else{
					break;
				}
				queArray[j]=item;
				nItems++;
			}
		}	
	}
	
	public long remove(){
		return queArray[--nItems];
	}
	
	public boolean isEmpty(){
		return (nItems==0);
	}
	
	public boolean isFull(){
		return (nItems==maxSize);
	}
}


public class Priority_queue {
	
	public static void main(String[] args) {
		P_Queue p_Queue=new P_Queue(10);
		
		p_Queue.insert(30);
		p_Queue.insert(50);
		p_Queue.insert(10);
		p_Queue.insert(40);
		p_Queue.insert(20);
		
		while(!p_Queue.isEmpty()){
			long item=p_Queue.remove();
			System.out.print(item+" ");
		}
		System.out.println(" ");
	}
	
}
