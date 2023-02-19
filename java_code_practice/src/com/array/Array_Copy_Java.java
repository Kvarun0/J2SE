/**
 *	 Copy Given Array Into Another array
 *	
 *	1>	Copy 1D int array
 *	
 *	2>	Copy 1D string array
 *	
 *	3>	Copy 2D int array
 *	
 *	4>	Copy 2D string array
 *		-select only some column of array
 *
 **/

package com.array;

public class Array_Copy_Java {
	public static void main(String[] args) {

		Array_copy acopy = new Array_copy();

		 acopy.array_one_d_int();
		 acopy.array_one_d_string();
		 acopy.array_two_d_int();
    	 acopy.array_two_d_string();
		
	}
}

class Array_copy {

	public void array_one_d_int() {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("Main Array");
		for (int i : arr1) {
			System.out.println(i);
		}

		System.out.println("Copied Array");
		for (int i : arr2) {
			System.out.println(i);
		}

		System.out.println();
		System.out.println();
	}

	public void array_one_d_string() {

		String[] arr1 = { "varun", "mayur", "dhruve", "bhautik" };
		String[] arr2 = new String[arr1.length];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("main Array");
		for (String string : arr1) {
			System.out.println(string);
		}

		System.out.println("copied array");
		for (String string : arr2) {
			System.out.println(string);
		}
		System.out.println();
		System.out.println();
	}

	public void array_two_d_int() {

		int[][] main_arr = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
		int[][] copy_arr = new int[main_arr.length][main_arr.length];

		for (int i = 0; i < main_arr.length; i++) {
			for (int j = 0; j < main_arr.length; j++) {
				copy_arr[i][j] = main_arr[i][j];
			}
		}

		System.out.println("Main array");
		for (int[] is : main_arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("Copy array");
		for (int[] is : copy_arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void array_two_d_string() {

		String[][] student_Details = { { "Roll No", "Name Of Student" }, { "1", "varun" }, { "2", "mayur" },{ "3", "bharat" } };
		String[][] student_details_copy = new String[4][2];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				student_details_copy[i][j] = student_Details[i][j];
			}
		}

		System.out.println("Student Details");
		for (String[] strings : student_Details) {
			for (String string : strings) {
				System.out.print(string + " ");
			}
			System.out.println();
		}

		System.out.println("Student Details Copy");
		for (String[] strings : student_details_copy) {
			for (String string : strings) {
				System.out.print(string);
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("Student name");
		for (int i = 0; i < student_details_copy.length; i++) {
			for (int j = 0; j < student_details_copy.length; j++) {
				if (j > 0) {
					System.out.println(student_details_copy[i][j]);
					break;
				}
			}
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("Roll Number Of Students");
		for (int i = 0; i < student_details_copy.length; i++) {
			 for (int j = 0; j < student_details_copy.length; j++) {
				if (j < 1) {
					System.out.println(student_details_copy[i][j]);
					break;
				}
			}
		}
		
	}
}
