package com.zyx.ocaexamples.others;

import java.util.ArrayList;

import com.zyx.ocaexamples.beans.Gato;


public class DeepCopyConstructorMain {
	
public static void copiarObjeto() {
		
		Gato garfield = new Gato();
		garfield.setSobreNombre("garfield");
		
		//Shalow Copy
//		Gato silvestre = new Gato();
//		silvestre = garfield;
		
		Gato silvestre = new Gato(garfield);
		silvestre.setSobreNombre("silvestre");
		
		System.out.println("NOMBRE: "+garfield.getSobreNombre());

	}
	
	public static void copiarListaDeObjetos() {
		ArrayList<Gato> mascotas = new ArrayList<Gato>();
		Gato tommy = new Gato();
		tommy.setSobreNombre("tommy");
		mascotas.add(tommy);
		Gato rosina = new Gato();
		rosina.setSobreNombre("rosina");
		mascotas.add(rosina);
		
		ArrayList<Gato> gatosFamosos = new ArrayList<Gato>();
		for(Gato gato : mascotas){
			Gato copiaGato = new Gato(gato);
			gatosFamosos.add(copiaGato);
		}
		
		//Solo modifico lista de gatosFamosos
		gatosFamosos.get(0).setSobreNombre("silvestre");
		
		for(Gato gato : mascotas)
			System.out.println(gato.getSobreNombre());
	}
	
	public static void main(String[] args) {
		DeepCopyConstructorMain.copiarObjeto();
		DeepCopyConstructorMain.copiarListaDeObjetos();
	}

}
