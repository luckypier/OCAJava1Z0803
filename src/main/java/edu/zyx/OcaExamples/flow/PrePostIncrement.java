package edu.zyx.OcaExamples.flow;

//Illegal modifier for (top level class) PrePostIncrement; only public, abstract & final are permitted
//https://blogs.oracle.com/darcy/entry/nested_inner_member_and_top
class PrePostIncrement {

	public static void main(String[] args) {
		
		//Post Increment(n++) : First execute the statement then increase the value by one.
		//Pre Increment (++n) : First increase the value by one then execute the statement.
		
		int n=0;
		System.out.println(n);		//0
		System.out.println(++n);	//1
		System.out.println(n);		//1
		
		int m=0;
		System.out.println(m);		//0
		System.out.println(m++);	//0
		System.out.println(m);		//1

		/*Para los for en PRE y POST increment
		 * es lo mismo, el incremento ya esta realizado 
		 * para el body del for  
		 */
		for(int i=1;i<3;++i){
			System.out.println("PRE "+i);
		}
		
		for(int i=1;i<3;i++){
			System.out.println("POST "+i);
		}
		
		String g;
		g = new String("D");
	}

}
