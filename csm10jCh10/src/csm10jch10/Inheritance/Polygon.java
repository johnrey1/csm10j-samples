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

// should polygon be a class or an interface
public class Polygon {
    private int numberOfSides;
        
    protected int toBeShadowed;
    
    public Polygon(){
        System.out.println("Calling polygon constructor");
    }
    
    /**
     * @return the numberOfSides
     */
    public int getNumberOfSides() {
        return numberOfSides;
    }

    /**
     * @param numberOfSides the numberOfSides to set
     */
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    
    // should this method be here
    // public double getPerimeter();
}
