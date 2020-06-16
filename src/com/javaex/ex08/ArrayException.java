package com.javaex.ex08;

public class ArrayException {

	public static void main(String[] args) {
		
		int intArray[] = new int[] {3, 6, 9, 12};

		
		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어남");
		}


	}

}
