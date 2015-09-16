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
public class Rectangle extends Polygon {
    
    private int width;
    private int length;
    
    public Rectangle(){
        setNumberOfSides(4);
        System.out.println("Calling Rectangle Constructor");
    }

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
        System.out.println("Calling overloaded rectangle constructor");
    }
    
    // overloaded in Box
    public void setDimensions(int width, int length){
        this.width = width;
        this.length = length;
    }
    
    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getArea(){
        return this.length * this.width;
    }
    
    @Override
    public String toString(){
        return String.format("Length: %d, Width: %d", getLength(), getWidth());
    }
}
