package com.user_input_using_scanner;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffer_Reader {
	
	public static void main(String[] args) throws Exception{
			
		FileReader fReader=new FileReader("D:\\Writer");
		BufferedReader breader=new BufferedReader(fReader);
		
		int i;
		while((i=breader.read())!= -1){
			System.out.print((char)i);
		}
		breader.close();
		fReader.close();
	}
}
