/**
 * 
 * 	In This We Create A Array Using Users Input
 * 
 * */

package com.array;

import java.util.Scanner;

public class Array_Using_Users_Input {
	public static void main(String[] args) {
		
		int i,j;
		
		System.out.println("Enter Rows And Columns of Array : ");
		
		Scanner sc=new Scanner(System.in);
		
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int [][] array=new int[row][column];
		
		System.out.println("Enter Element ");
		for ( i = 0; i < row; i++) {
			for ( j= 0; j < column; j++) {
				array[i][j]=sc.nextInt();
				System.out.print("");
			}
		}
		sc.close();
		
		for (int[] ks : array) {
			for (int k : ks) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}
