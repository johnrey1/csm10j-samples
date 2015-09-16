/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch08;

import MySamplePackage.ModifierExample;

/**
 *
 * @author johnr
 */
public class SimpleInheritExample extends ModifierExample {
    public void callProtected(){
        System.out.println("I'm a class outside the MySamplePackage, inheriting"
                + " from a class in that package, accessing a protected method");
        this.protectedMethod();
    }
}
