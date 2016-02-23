package com.zyx.ocaexamples.chapter02.flow;

public class SwitchStatement {

	public static void main(String[] args) {

		char letra = 'P';

		switch (letra) {
		default:
			System.out.println("Es otra letra");
//			break;
		case 'A':
			System.out.println("Es una A");
//			break;
		case 'B':
			System.out.println("Es una B");
//			break;
		case 'C':
			System.out.println("Es una C");
			break;
		case 'F':
			System.out.println("Es una F");
			break;
		

		}

		/*
		// with Short primitive wrapper
		Short siete = 7;

		switch (siete) {
		case obtValor(siete): //compilation problem: case expressions must be constant expressions
			System.out.println("Es uno");
			break;
		case 2:
			System.out.println("Es dos");
			break;
		case 3:
			System.out.println("Es tres");
			break;
		case 7:
			System.out.println("Es siete");
			break;
		default:
			System.out.println("No se encontó valor");
		}
		*/

	}

	private static Short obtValor(Short valor) {
		System.out.println("Devuelve " + valor);
		return valor;
	}

}
