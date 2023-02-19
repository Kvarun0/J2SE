/**
 * In This Using Stack We Can Match Delimiter of Given String
 *
 *  like {a(b[c]d)e} --- > it true 
 *  but  {a(b[c]d}e its not true
 *  
 *  in simple we add delimiter into stack and if right side element found than we remove it from stack and
 *  match it if its same than we go ahead 
 *  
 *  in this we found three type of error
 *  -stack have at the end elements
 *  -stack is empty but in right side some element 
 *  -order of element that  found
 *  
 */


package com.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stac{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	//constructor
	public Stac(int s){
		maxSize=s;
		stackArray=new char[maxSize];
		top=-1;
	}	
	
	//push element into stack
	public void push(char  j){
		stackArray[++top]=j;
	}
	
	//pop element from stack
	public char pop(){
		return stackArray[top--];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}

}

class BracketChecker{
	private String input;
	
	public BracketChecker(String in){
		input=in;
	}
	
	public void check(){
		int stackSize= input.length();
		Stac s=new Stac(stackSize);
		
		for (int i = 0; i < input.length(); i++) {
			char ch=input.charAt(i);
			
			switch (ch) {
			case '{':
			case '(':
			case '[':
				s.push(ch);
				break;
				
			case '}':
			case ')':
			case ']':
				
				if (!s.isEmpty()) {
					char chx=s.pop();
					
					
					//check opened element is closed or not { } // [ ] // ()
					if ((ch == '}' && chx != '{') || 
						(ch == ')' && chx != '(') ||
						(ch == ']' && chx != '[')) {
						System.out.println("Error : "+ ch +" at " + i);
					}
				}
				
				//for empty stack
				else{
					System.out.println("Error : "+ ch +" at "+ i);
				}
				
				break;
				
			default:
				break;
			}
		}
		if (!s.isEmpty()) {
			System.out.println("Error : Missing right delimiter");
		}
	}
}




public class Delimiter_Matching_Using_Stack {
	public static void main(String[] args) throws IOException {
		
		String input;
		
		while(true){
			System.out.println("Enter The String Containing delimiters : ");
			System.out.flush();
			input= getString();
			
			if (input.equals("")) {
				break;
			}
			
			BracketChecker br=new BracketChecker(input);
			
			br.check();
		}
		
	}
	
	public static String getString() throws IOException{
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		String s=br.readLine();
		
		return s;
	}
}



