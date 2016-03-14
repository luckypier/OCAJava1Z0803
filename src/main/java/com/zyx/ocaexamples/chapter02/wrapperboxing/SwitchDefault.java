package com.zyx.ocaexamples.chapter02.wrapperboxing;

public class SwitchDefault {

	public static void main(String[] args) {

		System.out.println("1 ====================");
		char letra = 'A';

		switch (letra) {
		default:
			System.out.println("default");
		case 'A':
			System.out.println("letra A");

		}

		System.out.println("2 ====================");
		
		/**
		 * Si NO existe, imprime los primeros hasta llegar al primer break.
		 */

		char lape = 'P';

		switch (lape) {
		default:
			System.out.println("default");
		case 'A':
			System.out.println("letra A");
		case 'B':
			System.out.println("letra B");
			break;
		case 'C':
			System.out.println("letra C");
			break;
		case 'Z':
			System.out.println("letra B");
		}

		// default
		// letra A
		// letra B
		
		System.out.println("3 ====================");
		/**
		 * Si existe, no imprime los que FALTA break.
		 */

		char laeme = 'M';

		switch (laeme) {
		default:
			System.out.println("default");
		case 'A':
			System.out.println("letra A");
		case 'B':
			System.out.println("letra B");
			break;
		case 'C':
			System.out.println("letra C");
			break;
		case 'M':
			System.out.println("letra M");
			break;
		}
		
		// letra M
		
		System.out.println("4 ====================");
		/**
		 * Si existe SIN BREAK, imprime los siguientes SIN break.
		 */

		char laese = 'S';

		switch (laese) {
		default:
			System.out.println("default");
		case 'A':
			System.out.println("letra A");
		case 'B':
			System.out.println("letra B");
			break;
		case 'C':
			System.out.println("letra C");
			break;
		case 'S':
			System.out.println("letra S");
		case 'T':
			System.out.println("letra T");
		case 'U':
			System.out.println("letra U");
		}
		
		// letra S
		// letra T
		// letra U

	}

}
