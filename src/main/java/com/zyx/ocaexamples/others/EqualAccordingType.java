package com.zyx.ocaexamples.others;

import java.util.Set;
import java.util.TreeSet;

import com.zyx.ocaexamples.beans.Animal.AnimalColor;
import com.zyx.ocaexamples.beans.Gato;

public class EqualAccordingType {
	
public static void main(String[] args) {
		
		//Enum, = and equals
		EqualAccordingType.compareEnum();
		
		//Posible Null Object field, =
		EqualAccordingType.posibleNullObjectField();
		EqualAccordingType.posibleNullObject();
		
		//Primite Data Types, =
		EqualAccordingType.comparePrimitiveDataType();
		
		
	}
	
	public static void objectFields(){
		//Collection
		Gato aristoCatFather = new Gato();
		
		Set<Gato> childrens = new TreeSet<Gato>();
//		TreeSet<Gato> childrens = new Set<Gato>(); //Error
		
		Gato marie = new Gato();
		marie.setNombre("Marie");
		childrens.add(marie);
		Gato berlioz = new Gato();
		berlioz.setNombre("Berlioz");
		childrens.add(berlioz);
		Gato toulous = new Gato();
		toulous.setNombre("Toulous");
		childrens.add(toulous);
		
		aristoCatFather.setChildren(childrens);
		
	}
	
	public static void compareEnum(){
		
		Gato cSucio = new Gato();
		cSucio.setAnimalColor(AnimalColor.YELLOW);
		
		Gato yellow = new Gato();
		yellow.setAnimalColor(AnimalColor.YELLOW);
		
		if(cSucio.getAnimalColor() == yellow.getAnimalColor()){
			System.out.println("Equals operator for enum");
		}
		
		if(cSucio.getAnimalColor().equals( yellow.getAnimalColor() )){
			System.out.println("Equals method for enum");
		}
	}

	public static void posibleNullObjectField(){
		Gato barrio = new Gato();
		barrio.setNombre("barrio");
		
		if(barrio.getEdad()==null){
		//ERROR if(barrio.getEdad().equals(null)){
			System.out.println("barrio.edad null");
		}
	}
	
	public static void posibleNullObject(){
		Gato fino = null;
		if(fino==null){
		//ERROR if(fino.equals(null)){
			System.out.println("fino null");
		}
	}
	
	public static void comparePrimitiveDataType(){
		
		//byshinlo flodo
		
		byte byteVar= 0;
		short shortVar = 0;
		int intVar = 0;
		long longVar = 0L;
		float floatVar = 0f; //convert to int using Float.floatToIntBits
		double doubleVar = 0d; //convert to long using Double.doubleToLongBits
		
		if(byteVar == intVar){
			System.out.println("byte and int are equals");
		}
		
		if(shortVar == longVar){
			System.out.println("short and long are equals");
		}
		
		if(Float.floatToIntBits(floatVar) == intVar){
			System.out.println("float conversion and int are equals");
		}
		
		if(Double.doubleToLongBits(longVar) == longVar){
			System.out.println("double conversion and long are equals");
		}
		
		
	}

}
