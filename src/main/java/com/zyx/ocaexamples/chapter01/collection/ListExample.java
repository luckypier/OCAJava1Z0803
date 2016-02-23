package com.zyx.ocaexamples.chapter01.collection;

import java.util.ArrayList;
import java.util.List;

import com.zyx.ocaexamples.beans.Area;
import com.zyx.ocaexamples.beans.Employee;

/**
 * List, based on positions
 * 
 * Vector for optimize store management, applies a capacity
 *
 */

public class ListExample {
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		List empleados = new ArrayList<Employee>();
		
		Employee ana = new Employee();
		ana.setName("Ana");
		ana.setAge(4);
		empleados.add(ana);
		Area contabilidad = new Area();
		contabilidad.setCantidadEmpleados(6);
		contabilidad.setNombre("Contabilidad");
		ana.setAreaTrabajo(contabilidad);
		
		Employee rose = new Employee();
		rose.setName("rose");
		empleados.add(rose);
		
		try {
			Employee ricardo = (Employee)ana.clone();
			ricardo.setName("ricardo");
			
			System.out.println(">>>"+ana.getName());
			System.out.println(">>>"+ana.getAreaTrabajo().getNombre());
			System.out.println("-----------------");
			System.out.println(">>>"+ricardo.getAreaTrabajo().getNombre());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
