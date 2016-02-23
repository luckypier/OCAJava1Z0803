package com.zyx.ocaexamples.chapter02.wrapperboxing;

public class Boxing {

	public static void main(String[] args) {
		
		//A
		Boolean wrapper = new Boolean("true");
		
		if(wrapper){ //unboxing
			System.out.println("i'm a wrapper");
		}
		
		//B
		boolean b = true;
		Boolean wrapper2 = (b = false); //assigment statement
		
		System.out.println("wrapper2 "+wrapper2);
		
		//C
		boolean primitive = wrapper2;
		System.out.println("primitive "+primitive);
		
		//D
		Integer thousandWrapper = new Integer("1000");
		int thousand = thousandWrapper;
		System.out.println("thousand "+thousand);
		

	}

}
