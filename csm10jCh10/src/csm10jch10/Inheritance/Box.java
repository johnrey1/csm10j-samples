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
// public final class Box extends Rectangle {
public class Box extends Rectangle {
    private int height;
    
    // shadowing the variable from the polygon class
    public int toBeShadowed;

    public Box(){
        
       this.toBeShadowed = 4;
    }
    
    public void printShadow(){
        System.out.println("Box " + toBeShadowed);
        System.out.println("Rectangle " + super.toBeShadowed);
    }
    
    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setLength(int height) {
        this.height = height;
    }
    
    // this overloads the setDimensions in rectangle class
    public void setDimensions(int width, int length, int height){
        setDimensions(width, length);
        this.height = height;
    }
    
    @Override
    public int getArea(){
        return 2 * (
                getLength() * getHeight() + 
                getLength() * getWidth() + 
                getWidth() * getHeight()
                );
    }
    
    public int getVolume(){
        // why do we need to call super here?
        return super.getArea() * height;
    }
    
    // What happens if i dont override again?

    public String toString(){
        return String.format("%s, Height: %d", super.toString(), getHeight());
    }
}
