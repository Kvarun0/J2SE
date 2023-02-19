package com.user_input_using_scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Buffer_Writer {

	public static void main(String[] args) throws Exception{
		
		FileWriter writer= new FileWriter("D:\\Writer");
		BufferedWriter bWriter=new BufferedWriter(writer);
		
		bWriter.write("This is Example of Bufferd Writer");
		bWriter.close();
		
		System.out.println("Donr");
	}
}
