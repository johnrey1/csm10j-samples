/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch06;

import java.util.Vector;

/**
 *
 * @author johnr
 */
public class VectorExamples {
    
    public static void VectorProperties(Vector<Integer> v){
        System.out.println("Vector Properties");
        System.out.printf("First element: %d, Size: %d; Capacity: %d%n%n",
                v.firstElement(), v.size(), v.capacity());
    }
    
    public static void VectorPassing(){
        System.out.println("VectorPassing");
        
        Vector<Integer> v = new Vector<Integer>(20);
        for(int i = 0; i < 10; i++){
            v.addElement(i * 10);            
        }     
        
        VectorProperties(v);
    }
    
    // valid and invalid vector declaration
    // remember, vector must contain object types, not primitives
    public static void VectorDeclareAndBox(){
        System.out.println("VectorDeclare");
        // will this work? what should we do if we want ints
        // Vector<int> v = new Vector<int>();
           
        Vector<Integer> v = new Vector<Integer>(20);
        for(int i = 0; i < 10; i++){
            // autoboxing
            v.addElement(i * i);            
        }     
        
        // can declare any object type
        Vector<String> vStr = new Vector<String>();
        Vector<Object> vObject = new Vector<Object>();
        Vector<Vector> vVector = new Vector<Vector>();       
    
        
    }
    
    // we cant use the subscript operator like an array
    // but we can use elementAt which performs a similar operations
    public static void IndexVector(int index){
    System.out.println("IndexVector");
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(5);
       
        // zero indexed like arrays
        System.out.println("v.elementAt(0): " + v.elementAt(0));
        
        System.out.println("v.elementAt(" + index + "): " + v.elementAt(index));
    }
    
    // when we tell an array how many elements there will be, what is the length?
    // how does this compare to the size method of vector?
    public static void VectorLength(int capacity){
        System.out.println("VectorLength");
        
        Vector<Integer> v = new Vector<Integer>(capacity);
        
        System.out.println("v.size(): " + v.size());
        
        v.add(1);
        v.add(2);
        
        System.out.println("v.size() after 2 elements: " + v.size());
        
        for(int i = 0; i < 100; i++)
            v.addElement(new Integer(i));
        
        // why does capacity not equal length
        System.out.printf("After 100 more. v.size(): %d, v.capacity(): %d%n%n",
                v.size(), v.capacity());
    }
}
