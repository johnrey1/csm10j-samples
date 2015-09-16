/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch13;

/**
 *
 * @author johnr
 */
public class TowerHanoi {
    
    public static void moveDisks(int count, int needle1, int needle3, int needle2){
        if(count > 0){
            moveDisks(count - 1, needle1, needle2, needle3);
            System.out.println("Move disk " + count + " from needle " + needle1
            + " to needle " + needle3 + ".");
            moveDisks(count - 1, needle2, needle3, needle1);
        }
    }
}
