package com.zyx.ocaexamples.chapter01.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set, interface abstraction of a mathematical set
 * 
 * HashSet like an employee meeting : elements are unique
 * TreeSet like : unique and order (could have a custumize comparator)
 * LinkedHashSet like a 'banco de la nacion' users line : unique elements and addition order is respect
 *
 *///Hello again

public class SetExample 
{
    public static void main( String[] args )
    {
    	
//      Set myset = new HashSet();
//    	Set<String> myset = new HashSet<String>();
    	Set<String> myset = new TreeSet<String>(); //ordernado 1, 10, 11, 2, 3
//    	Set<String> myset = new TreeSet<String>(comparator);
    	
    	Integer[] elements = {10,2,5,3,8,1,7,9,4,6,6,6,6,11};
    	
    	for(Integer e : elements){
    		myset.add(String.valueOf(e));
    	}
        
        myset.add("11");
        myset.add("12");
        
        System.out.println("set" +myset);
        System.out.println("set with size "+myset.size());
        
        
//        LinkedHashSet linked = new LinkedHashSet<String>();
//        linked.add(5);
//        linked.add(6);
//        linked.add(3);
        
        
        
        
        
    }
}
