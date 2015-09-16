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
public interface Lockable {
    void lock();
    void unlock();
    boolean isLocked();
}
