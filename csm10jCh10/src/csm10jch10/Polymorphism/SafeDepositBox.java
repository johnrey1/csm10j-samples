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
public class SafeDepositBox implements Lockable {
    private boolean hasKey;
    private boolean lock;
    
    public void InsertKey(){
        hasKey = true;
    }
    
    public void RemoveKey(){
        hasKey = false;
    }
    
    @Override
    public void lock() {
        if(hasKey)
            this.lock = true;
    }

    @Override
    public void unlock() {
        if(hasKey)
            this.lock = false;
    }

    @Override
    public boolean isLocked() {
        return lock;
    }
    
}
