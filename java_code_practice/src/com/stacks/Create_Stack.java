package com.stacks;

class StackX{
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public StackX(int s){
		maxSize=s;
		stackArray=new long[maxSize];
		top=-1;
	}
	
	//put item on top
	public void push(long j){
		stackArray[++top]=j;
	}
	
	
	//pop item from top
	public long pop(){
		return stackArray[top--];
	}
	
	//select item from top
	public long peek(){
		return stackArray[top];
		
	}
	
	
	// Stack empty condition check
	public boolean isEmpty(){
		return (top == -1);
	}
	
	// Stack Full Condition check
	public boolean isFull(){
		return (top==maxSize-1);
	}
	
}



public class Create_Stack {
	
	public static void main(String[] args) {
		StackX thestack=new StackX(10);
		thestack.push(10);
		thestack.push(20);
		thestack.push(30);
		thestack.push(40);
		thestack.push(50);
		thestack.push(60);
		thestack.push(70);
		

		while(!thestack.isEmpty()){
			long value =thestack.pop();
			System.out.print(value+" ");
		}
		
	}
	
}
