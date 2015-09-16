/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch10.Polymorphism;

/**
 *
 * @author johnr
 */
public class SavingsAccount extends BankAccount {
    
    
    @Override 
    public double getInterestRate(){
        if( getBalance() > 10000 )
            return .05;
        else
            return .01;
    }
    
    // cannot define abstract method in non-abstract class
//    abstract public boolean isPremier();
}
