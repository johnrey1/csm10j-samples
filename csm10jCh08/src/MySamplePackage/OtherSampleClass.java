/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySamplePackage;

/**
 *
 * @author johnr
 */
public class OtherSampleClass {
    // what is the access level of this member?
    ModifierExample m = new ModifierExample();
    
    public void TryPackage(){
        m.packageMethod();
        System.out.println(m.packageLevelField);
    }
    
    public void TryPrivate(){
//        m.privateMethod();
//        System.out.println(m.privateField);
    }
    
    public void TryProtected(){
        m.protectedMethod();
        System.out.println(m.protectedField);
    }
    
    public void TryPublic(){
        m.publicMethod();
        System.out.println(m.publicField);
    }
}
