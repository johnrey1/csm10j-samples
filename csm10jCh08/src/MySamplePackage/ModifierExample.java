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
public class ModifierExample {
    int packageLevelField = 42;
    private int privateField = 2;
    protected int protectedField = 5;
    public int publicField = 11;
    
    // static versions
    static int staticPackageLevelField = 42;
    static private int staticPrivateField = 2;
    static protected int staticProtectedField = 5;
    static public int staticPublicField = 11;
    
    void packageMethod(){
        System.out.println("I have package level access");
    }
    
    private void privateMethod(){
        System.out.println("I have private level access");
    }
    
    protected void protectedMethod(){
        System.out.println("I have protected level access");
    }
    
    public void publicMethod(){
        System.out.println("I have public level access");
    }
    
    // why might this be a bad idea?
    public void callPrivateAndProtectedMethod(){
        System.out.println("Calling private and protected methods");
        privateMethod();
        protectedMethod();
    }
}
