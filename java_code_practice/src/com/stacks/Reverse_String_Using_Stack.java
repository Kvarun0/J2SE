/**
 * Reverse the word using stack
 */

package com.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Staclx{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Staclx(int max){
		maxSize=max;
		stackArray=new char[maxSize];
		top=-1;
	}
	
	public void push(char j){
		stackArray[++top]=j;
	}
	
	public char pop(){
		return stackArray[top--];
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return (top ==-1);
	}
	
}

class Reverse{
	private String input;
	private String output;
	
	public Reverse(String in){
		input=in;
	}
	
	public String doRev(){
		int stackSize=input.length();
		StackX stack=new StackX(stackSize);
		
		
		//add element to stack
		for (int i = 0; i < input.length(); i++) {
			char ch=input.charAt(i);
			stack.push(ch);
		}
		
		//pop element from list
		output ="";
		
		while(!stack.isEmpty()){
			char ch=(char) stack.pop();
			output=output+ ch;
		}
		
		return output;
	}
}


public class Reverse_String_Using_Stack {
	
	public static void main(String[] args) throws IOException{
		String input,output;
		
		while(true){
			System.out.println("Enter A  String  : ");
			System.out.flush();
			input= getString();
			if (input.equals("")) {
				break;
			}
			
			Reverse rv=new Reverse(input);
			output=rv.doRev();
			System.out.println("Reversed String : "+ output);
		}
	}
	
	public static String getString() throws IOException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String s=br.readLine();
		return s;
	}
}







