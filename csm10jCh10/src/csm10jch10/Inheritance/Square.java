/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch10.Inheritance;

/**
 *
 * @author johnr
 */
public class Square extends Rectangle{
    public Square(){
        // what happens if i use this call
        // super(10,10);
        System.out.println("Calling Square constructor");
    }
}
