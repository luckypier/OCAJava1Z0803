package edu.zyx.OcaExamples.flow;

public class IfShortCircuit {

	public static void main(String[] args) {
		
		if(isProcessOneEnable() && isProcessTwoEnable() && isProcessThreeEnable() ){
			System.out.println("Complete process");
		}
		
	}
	
	private static boolean isProcessOneEnable(){
		System.out.println("Evaluates isProcessOneEnable");
		return true;
	}
	
	private static boolean isProcessTwoEnable(){
		System.out.println("Evaluates isProcessTwoEnable");
		return false;
	}
	
	private static boolean isProcessThreeEnable(){
		System.out.println("Evaluates isProcessThreeEnable");
		return true;
	}

}
