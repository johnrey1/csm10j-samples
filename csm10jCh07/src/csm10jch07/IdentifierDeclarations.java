/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch07;

class OtherClass{
    public int x = 0;
}

/**
 *
 * @author johnr
 */
public class IdentifierDeclarations {
    
    static String name = "John";
    
    private String lastName = "Reynolds";
    
    public static void NameResolution(){
        System.out.println("Name Resolution");
        // what if i have an identifier named 'name' and i want the static one
        String name = "Joe";
        
        System.out.println(name + ", " + IdentifierDeclarations.name);
    }
    
    public static void MyStaticMethod(){
        System.out.println("Called MyStaticMethod");       

        
        // illegal, cannot call non-static from static
        // MyInstanceMethod();
        
        // legal, create a new instance, and call a the instance method
        // why do i need to use new first ?
        IdentifierDeclarations myNewInstance = new IdentifierDeclarations();
        myNewInstance.MyInstanceMethod();
        
        // illegal
        // myNewInstance.MyStaticMethod();
        
        // legal regardless of scope, because same class
        System.out.println(myNewInstance.lastName);
        
        // legal if scope is public, try changing to private
        OtherClass other = new OtherClass();
        System.out.println("Other x = " + other.x);
        
    }
    
    public void MyInstanceMethod(){
        System.out.println("Called MyInstanceMethod");
               
        // legal, i can call a static from a non-static
        // these two statements are equivalent. Java infers the classname
        MyStaticMethod();
        IdentifierDeclarations.MyStaticMethod();        
        
        // legal
        System.out.println(name);   // equivalently: System.out.println(IdentifierDeclarations.lastName);
        System.out.println(lastName);   
    }
    
    public static void LegalNamingBlocks(){
        System.out.println("LegalNamingBlocks");
        // blocks can be defined without loops or selection
        {
            int y = 0;
            y++;
            System.out.println("y == " + y);
        }
        
        // these blocks are at the same level, so identifier names do not conflict
        {
            int y = 2;
            y++;
            System.out.println("y == " + y);
        }
        
        // blocks can be nested
        {
            int x = 0;
            
            {
                int y = 1;
                int z = x + y;
                System.out.println("z == " + z);
            }
        }
    }
    
    // Try uncommenting the lines inside the IF
    public void IllegalNaming(){
        int x = 0;
        
        if(true){
            // variable 'x' has already been defined in an outer block
            // regardless of data type
//            int x = 1;
//            String x = "new string";
        }       
    }
}
