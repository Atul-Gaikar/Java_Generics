package com.bridgelabz.javagenerics;


public class GenericsRunner {
	public static void main(String[] args) {
		GenericsEx<Integer> obj = new GenericsEx();
		obj.print(25);
		GenericsEx<String> obj1 = new GenericsEx();
		obj1.printf("Atul");
	}
}
