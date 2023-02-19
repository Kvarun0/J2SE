/*
 * package java.util.scanner
 * 
 * Scanner class
 * 
 * System.in
 * 
 * Scanner(System.in) 
 * -- > Take Data From Buffer
 * 
 * --> Buffer was create from keyboard data enter 
 * 	
 * 	12 23
 * 	Store in buffer like 1 2 Delimiter 2 3 
 * 	form this sc.nextInt get 12 and 23 
 * 
 */

/*
 *	Methods of Scanner class
 *
 *		next()
 *
 *		nextLine()	-read string from user
 * 
 *		nextBoolean()	- read boolean from user
 *
 *		nextByte()	-read byte from user
 *	
 *		nextDouble()	-read double from user
 *
 * 		nextFloat()		-read float from user
 * 	
 * 		nextInt()	-read integer form user
 * 
 * 		nextLong()	-read long from user
 * 
 * 		nextShort()		- read short from user
 * 
 */

package com.user_input_using_scanner;

import java.util.Scanner;


public class User_Input {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter Your name : ");
		String name=sc.next();
		
		System.out.println("Enter Your Age : ");
		int age=sc.nextInt();
		
		System.out.println("Enter Double : ");
		double dou=sc.nextDouble();
		
		System.out.println("Enter Float : ");
		float flo=sc.nextFloat();
		
		System.out.println("Enter Boolean : ");
		boolean bool=sc.nextBoolean();
		
		System.out.println("Enter long : ");
		long lon=sc.nextLong();
		
		System.out.println("Enter short : ");
		short sho=sc.nextShort();
		
		
		sc.close();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(dou);
		System.out.println(flo);
		System.out.println(bool);
		System.out.println(lon);
		System.out.println(sho);
		
	}
}
