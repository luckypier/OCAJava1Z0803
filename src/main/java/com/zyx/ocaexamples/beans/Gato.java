package com.zyx.ocaexamples.beans;

public class Gato extends Animal {
	
	private int idMascota;
	private String nombre;
	private String sobreNombre;
	private Integer edad;
	private String duenio;
	
	
	public Gato(){
		
	}
	
	//Deep Copy Constructor
	public Gato(Gato gatoParametro){
		this.sobreNombre = gatoParametro.sobreNombre;
		this.edad = gatoParametro.edad;
		this.duenio = gatoParametro.duenio;
	}
	
	//EQUALS
	
	//Equals implementation one field
//	@Override
//	public boolean equals(Object gatoInstance){
//		if(gatoInstance == null) return false;
//		if(gatoInstance instanceof Gato == false) return false;
//		
//		Gato gato = (Gato)gatoInstance;
//		return this.idMascota == gato.idMascota;
//	}
	
	//Equals implementation of "significant" fields
	@Override
	public boolean equals(Object gatoInstance){
		if(gatoInstance==null) return false;
		if( !(gatoInstance instanceof Gato) ) return false;
		
		Gato otraInstancia = (Gato) gatoInstance;
		if( this.idMascota == otraInstancia.idMascota 
				&& this.nombre.equals(otraInstancia.nombre) )
			return true;
		
		return false;
	}
	
	//HASHCODE
	
//	@Override
//	public int hashCode(){
//		return (int)this.idMascota;
//	}
	
	
	@Override
	public int hashCode(){
		return (int) this.idMascota * this.nombre.hashCode();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getSobreNombre() {
		return sobreNombre;
	}
	public void setSobreNombre(String sobreNombre) {
		this.sobreNombre = sobreNombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getDuenio() {
		return duenio;
	}
	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}
	
}
