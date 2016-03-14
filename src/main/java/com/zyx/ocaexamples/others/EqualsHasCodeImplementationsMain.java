package com.zyx.ocaexamples.others;

import java.util.ArrayList;

import com.zyx.ocaexamples.beans.Gato;

public class EqualsHasCodeImplementationsMain {

	public static void main(String[] args) {
		EqualsHasCodeImplementationsMain.compareObjects();
		EqualsHasCodeImplementationsMain.containsInList();
	}
	
	
	public static void compareObjects() {
		Gato garfieldToday = new Gato();
		garfieldToday.setIdMascota(1);
		garfieldToday.setNombre("garfield");
		
		Gato garfieldYesterday = new Gato();
		garfieldYesterday.setIdMascota(1);
		garfieldYesterday.setNombre("garfield");
		garfieldYesterday.setEdad(10); //aditional Field
		garfieldYesterday.setDuenio("John"); //aditional Field
		
		if(garfieldToday.equals(garfieldYesterday)){
			System.out.println("Equals mascots");
			System.out.println(">>>garfieldToday hascode "+garfieldToday.hashCode());
			System.out.println(">>>garfieldYesterday hascode "+garfieldYesterday.hashCode());
		}else
			System.out.println("Different mascots");
	}
	
	public static void containsInList() {
		
		ArrayList<Gato> gatos = new ArrayList<Gato>();
		Gato garfieldToday = new Gato();
		garfieldToday.setIdMascota(1);
		garfieldToday.setNombre("garfield");
		gatos.add(garfieldToday);
		
		Gato garfieldYesterday = new Gato();
		garfieldYesterday.setIdMascota(1);
		garfieldYesterday.setNombre("garfield");
		garfieldYesterday.setEdad(10); //aditional Field
		garfieldYesterday.setDuenio("John"); //aditional Field
		
		if(gatos.contains(garfieldYesterday))
			System.out.println("gatos contains garfieldYesterday");
		else
			System.out.println("gatos doesn't contains garfieldYesterday");
		
	}
	
}
