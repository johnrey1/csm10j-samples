/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch08;

import MySamplePackage.ModifierExample;
import MySamplePackage.OtherSampleClass;

/**
 *
 * @author johnr
 */
public class RunExamples {

    public static void FinalizeTest(){
        Clock finalizeTest = new Clock(12,30,30);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
// Examples of accessing class members at different levels of access        
        
//        ModifierExample m = new ModifierExample();
        // can i call the package level method from here?
//        m.packageMethod();
//        OtherSampleClass c = new OtherSampleClass();
        // does this work, it's calling a package method on ModifierExample
//        c.TryPackage();
//        c.TryProtected();
//        
//        SimpleInheritExample s = new SimpleInheritExample();
//        s.callProtected();

        // Constructor examples
        // See the Clock class for the inverted pyramid
        
        // Finalizer test
//        FinalizeTest();
        // why do i have to call gc??
//        System.gc();
        
        // To String Test
//        Clock toStringTest = new Clock(12,30,30);
//        System.out.println(toStringTest);
        
    }
    
}
