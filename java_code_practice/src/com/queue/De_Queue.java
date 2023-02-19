/**
 * In This We Create Double ended queue 
 * 
 *  for insertion : insertLeft , insertRight
 *  for deletion : deleteLeft , deleteRight
 *  
 */

package com.queue;


class Queue_de{
	private int maxSize;
	private long[] dequeArray;
	private int frontLeft,frontRight;
	private int rearLeft, rearRight;
	
	public Queue_de(int s){
		maxSize = s;
		dequeArray = new long[maxSize];
		frontLeft = 0;
		rearLeft = -1;
		frontRight = maxSize-1;
		rearRight = maxSize;
	}
	
	
	
	//For left side 
	public void insertLeft(long j){
		if (rearLeft == maxSize-1) {
			rearLeft = -1;
		}
		dequeArray[++rearLeft] =j;
		
	}
	public long deleteLeft(){
		long temp=dequeArray[frontLeft++];
		if (frontLeft == maxSize) {
			frontLeft=1;
		}
		return temp;
	}
	
	
	//For Right side
	public void insertRight(long k){
		if (rearRight == -1) {
			rearRight = maxSize;
		}
		dequeArray[--rearRight] = k;
	}
	
	public long deleteRight(){
		long tem=dequeArray[frontRight--];
		if (frontRight == 1) {
			frontRight = maxSize-1;
		}
		return tem;
	}
	
	
	//Is Full And Empty Condition
	public boolean isEmpty(){
		return false;
	}
	
	public boolean isFull(){
		return true;
	}
	
}





public class De_Queue {

}
