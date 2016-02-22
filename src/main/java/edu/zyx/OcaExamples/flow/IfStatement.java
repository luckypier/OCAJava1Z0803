package edu.zyx.OcaExamples.flow;

public class IfStatement {
	
	public static void main(String[] args) {
		boolean b;
//		System.out.println("b "+b);
		boolean bValue = (b=true);
		
		int i;
		int iValue = (i=1);
//		boolean bValue2 = (boolean bool=false);
//		System.out.println("b "+(b=true)); !!
		System.out.println("bValue "+bValue);
		
		if(bValue)System.out.println("TRUE");
		else System.out.println("FALSE");
		
		if(bValue = false) System.out.println("TRUE");
		else System.out.println("FALSE");
		
		if(bValue == false) System.out.println("TRUE");
		else System.out.println("FALSE");
		
		byte vb; 
		byte vb2 = (vb=1); 
		short vs;
		short vs2 = (vs=1);
		int vi;
		int vi2 = (vi=1);
		long vl;
		long vl2 = (vl=1);
		
		float vf;
		float vf2 = (vf=1);
		double vd;
		double vd2 = (vd=1);
		boolean vbo;
		boolean vbo2 = (vbo=false);
		System.out.println("vbo2: "+vbo2);
		vbo2 = (1==1);
		System.out.println("vbo2: "+vbo2);
		char vc;
		char vc2 = (vc=1); //!!!
		
		System.out.println("char "+vc);
		
	}

}
