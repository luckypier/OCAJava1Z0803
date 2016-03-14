package com.zyx.ocaexamples.chapter01.incrementdecrement;

public class IncrementDecrement {

	/*
	 * Variable++ means: Increment variable AFTER evaluating the expression.
	 * ++Variable means: Increment variable BEFORE evaluating the expression.
	 */
	public static void main(String[] args) {
		int i=1;
		int j=1;
		
		int k=1;
		int l=1;

		System.out.println("INCREMENT");
		System.out.println(i++); //1
		System.out.println(++j); //2
		
		System.out.println("DECREMENT");
		System.out.println(k--); //1
		System.out.println(--l); //0
		
		for(int aux=1;
				aux<4;
				++aux
				){
			System.out.println("aux "+aux);
		}
		
	}
	
}
