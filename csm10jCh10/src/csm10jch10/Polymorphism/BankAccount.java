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
abstract public class BankAccount {
    private double balance;
    
    abstract public double getInterestRate();
    
    public double getBalance(){
        return balance;
    }
}
