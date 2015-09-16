/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch07;

// you can wrap primitives to set as objects
class IntWrapper{
    private int myInt;
    
    public int getNum(){
        return myInt;
    }
    
    public void setNum(int num){
        myInt = num;
    }
}

/**
 *
 * @author johnr
 */
public class ParamPassing {
        
    public static void setStringToHello(String myStr){
        System.out.println("setStringToHello");
        myStr = "hello!";
    }
    
    public static void runSetStringToHello(){
        String name = "john";
        setStringToHello(name);
        
        // What is the value of name?
        System.out.println("runSetStringToHello name == " + name);
    }
    
    public static int AddXtoY(int x, int y){
        System.out.println("Add x to y");
        y += x;
        return y;
    }
    
    public static void RunAddXtoY(){
        int a = 1;
        int b = 2;
        
        // what do we expect the value of b to be?
        AddXtoY(a,b);
        // note that the identifiers a, b do not need to match x, y to call
        System.out.println("RunAddXtoY b == " + b);
    }
    

    public static int AddXtoYWithWrapper(IntWrapper x, IntWrapper y){
        System.out.println("Add x to y wrapper");
        y.setNum(x.getNum() + y.getNum());
        
        return y.getNum();
    }
    
    public static void RunAddXtoYWithWrapper(){
        IntWrapper a = new IntWrapper();
        a.setNum(1);
        IntWrapper b = new IntWrapper();
        b.setNum(2);
        
        // what do we expect the value of b to be?
        AddXtoYWithWrapper(a,b);
        // remember to use the getNum method. what happens if you dont?
        System.out.println("RunAddXtoYIntWrapper b == " + b);
        System.out.println("RunAddXtoYIntWrapper b == " + b.getNum());
    }
}
