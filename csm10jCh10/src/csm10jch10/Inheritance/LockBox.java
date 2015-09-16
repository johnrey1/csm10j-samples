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
public class LockBox extends Box {
    private boolean locked = true;
    
    public void unlock(){
        locked = false;
    }
    
    public void lock(){
        locked = true;
    }
    
    public boolean isLocked(){
        return locked;
    }
    
    public String toString(){
        return String.format("%s, locked = %b", super.toString(), locked);
    }
}
