/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch12;

/**
 *
 * @author johnr
 */
public class Rectangle {
    // in Netbeans, try right clicking on length -> refactor -> encapuslate fields
    private double length = 0;
    private double width = 0;
    
    
    
    public double computeArea(){
        return getLength() * getWidth();
    }
    
    public double computePerimeter(){
        return (2 * getLength()) + (2 * getWidth());
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void print(){
        System.out.printf("Length: %.2f, Width: %.2f; Area: %.2f, Perimeter: %.2f",
                length, width, computeArea(), computePerimeter());
    }
    
}
