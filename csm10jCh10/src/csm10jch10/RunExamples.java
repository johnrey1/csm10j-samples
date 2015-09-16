/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch10;

import csm10jch10.Inheritance.*;
import csm10jch10.Polymorphism.Lockable;
import csm10jch10.Polymorphism.LockableBox;
import csm10jch10.Polymorphism.SafeDepositBox;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author johnr
 */
public class RunExamples {

    private static void RunInheritanceExamples() {
        // Inheritance Examples

        // Constructor call hierarchy
//        System.out.println(">> new Polygon");
        Polygon p = new Polygon();
        System.out.println(p);
//        
//        System.out.println(">> new Rectangle");
//        Rectangle r = new Rectangle();
//        
//        System.out.println(">> new Square");
//        Square sq = new Square();

//        Box b = new Box();
//        b.setDimensions(3, 4, 5);
//        System.out.println(b);
        // example using final
//        LockBox lb = new LockBox();
//        System.out.println(lb.toString());
//        
//        // toString overrides
//        Polygon p = new Polygon();
//        System.out.println(p.toString());
//        
//        Rectangle r = new Rectangle();
//        System.out.println(r.toString());
//        
//        Box b = new Box();
//        System.out.println(b);
    }

    private static void RunPolymorphismExamples(){
        
        // Using the instanceof operator
        System.out.println("----- instanceof -----");
        Rectangle box = new Box();                
        System.out.println("Is box instanceof Box? " + (box instanceof Box));
        System.out.println("Is box instanceof Rectangle? " + (box instanceof Rectangle));
        System.out.println("Is box instanceof Object? " + (box instanceof Object));
    
        Rectangle rect = new Rectangle();
        System.out.println("Is rect instanceof Rectangle? " + (rect instanceof Rectangle));        
        System.out.println("Is rect instanceof Box? " + (rect instanceof Box));
        
        LockableBox lockBox = new LockableBox();
        System.out.println("Is lockbox instanceof Lockable? " + (lockBox instanceof Lockable));
        
//      Polymorhism with interfaces
        SafeDepositBox sdb = new SafeDepositBox();
        sdb.InsertKey();
        
        List<Lockable> lockItems = new LinkedList();
//         Vector lockItems = new Vector();
        lockItems.add(lockBox);
        lockItems.add(sdb);
        
        for(Lockable l : lockItems){
            l.lock();
            System.out.printf("%s is locked? %s%n", l.getClass().getSimpleName(), l.isLocked());
        }       
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        RunInheritanceExamples();
        RunPolymorphismExamples();
    }

}
