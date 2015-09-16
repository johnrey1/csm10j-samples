/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;
import javax.swing.JFrame;



/**
 *
 * @author johnr
 */
public class RandomShapes extends JFrame{
    
    private static final int SIZE = 200;
    
    private static Color getRandomColor(){
        return new Color(new Random().nextFloat(), new Random().nextFloat(), new Random().nextFloat());
    }
    
    private static void drawRandomPolygon(Graphics g){
        int numPoints = (int)(new Random().nextFloat() * 5 + 3); 
        
        int[] x = new int[numPoints];
        int[] y = new int[numPoints];
        
        for(int i = 0; i < numPoints; i++){
            int randomX = (int)(new Random().nextFloat() * SIZE);
            int randomY = (int)(new Random().nextFloat() * SIZE);
            x[i] = randomX;
            y[i] = randomY;
        }
        
        g.drawPolygon(x,y,numPoints);
    }
    
    private static void drawRandom(Graphics g){
        int x, y, width, height;
        x = (int)(new Random().nextFloat()*SIZE);
        y = (int)(new Random().nextFloat()*SIZE);
        width = (int)(new Random().nextFloat()*SIZE);
        height = (int)(new Random().nextFloat()*SIZE);
        
        g.setColor(getRandomColor());
        
        int shapeType = (int)(new Random().nextFloat()*5);
        switch(shapeType){
            case 0:                
                g.drawRect(x,y,width,height);
                break;
            case 1:
                g.fillRect(x,y,width,height);
                break;
            case 2:
                 g.drawOval(x,y,width,height);
                break;
            case 3:
                g.fillOval(x,y,width,height);
                break;
            case 4:
                drawRandomPolygon(g);
                break;
        }
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        System.out.println("Painting Random Shapes");
        
        int numberShapes = 5 + (int)(new Random().nextFloat()*10);
        
        for(int i = 0; i < numberShapes; i++){
            drawRandom(g);
        }
    }
}
