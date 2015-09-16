/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch10.Polymorphism;

import csm10jch10.Inheritance.*;

/**
 *
 * @author johnr
 */
public class LockableBox extends Box implements Lockable {
    private boolean locked = true;
    
    @Override
    public void unlock(){
        locked = false;
    }
    
    @Override
    public void lock(){
        locked = true;
    }
    
    @Override
    public boolean isLocked(){
        return locked;
    }
    
    @Override
    public String toString(){
        return String.format("%s, locked = %b", super.toString(), locked);
    }
}
