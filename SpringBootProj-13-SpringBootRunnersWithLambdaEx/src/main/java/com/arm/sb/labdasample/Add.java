package com.arm.sb.labdasample;

public class Add {
	public static void main(String[] args) {
//		Addition add1 = (int a, int b) -> {
//			int c = a + b;
//			return c;
//		};
//		int sum = add1.add(5, 13);
//		System.out.println("Sum : "+sum);

//		****************************************

//		Addition add2 = (int a, int b) -> {
//			return a + b;
//		};
//		int sum2 = add2.add(6, 12);
//		System.out.println("Sum : " + sum2);

//		****************************************

//		Addition add3 = (int a, int b) -> a + b;
//		int sum3 = add3.add(7, 11);
//		System.out.println("Sum : " + sum3);

//		****************************************

//		Addition add4 = (a, b) -> a + b;
//		int sum4 = add4.add(8, 10);
//		System.out.println("Sum : " + sum4);

//		****************************************

		Addition add5 = (x, y) -> x + y;
		int sum5 = add5.add(9, 9);
		System.out.println("Sum : " + sum5);
	}

}
