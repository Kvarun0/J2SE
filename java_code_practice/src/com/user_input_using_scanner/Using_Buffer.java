/*
 *  User input using Buffer reader  
 */

package com.user_input_using_scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Using_Buffer {
	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		//Getting User input Using BufferedReader
	
		System.out.println("Enter Your Name");
		String name = null;
		try {
			name= br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);	
		
	}
}
