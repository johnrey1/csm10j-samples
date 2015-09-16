/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 *
 * @author johnr
 */
public class MouseListenerFrame extends JFrame {

    final int NUM_CIRCLES = 7;
    final int WIDTH = 500;
    final int HEIGHT = 500;
    ColorCircle[] myGraph = new ColorCircle[NUM_CIRCLES];

    class ColorCircle {

        private int x, y;

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        // why do we give this class a paint method?
        public void paint(Graphics g) {
            g.fillOval(x - 10, y - 10, 20, 20);
        }

        // determine if this circle has been selected
        public boolean selected(int xCoord, int yCoord) {
            if (xCoord >= this.x - 10 && xCoord <= this.x + 10) {
                if (yCoord >= this.y - 10 && yCoord <= this.y + 10) {
                    System.out.println("Selected");
                    return true;
                }
            }
            
            System.out.println("Not selected");
            return false;
        }
        
       
    }

    private void initFrame() {
        setSize(WIDTH, HEIGHT);
        addMouseMotionListener(new CustomMouseMotionAdapter());

        // what does this do initially
        for (int i = 0; i < NUM_CIRCLES; i++) {
            ColorCircle vertex = new ColorCircle();
            vertex.setX(((int) (Math.random() * (WIDTH - 50))));
            vertex.setY(((int) (Math.random() * (HEIGHT - 50))));
            myGraph[i] = vertex;
        }

    }

    @Override
    public void paint(Graphics g) {
        // why is there no call to super?
        //super.paint(g);
        
        Color[] myColor = {Color.black, Color.red, Color.blue, 
            Color.green, Color.cyan, 
            Color.orange, Color.yellow};

        if (NUM_CIRCLES > 0) {
            for (int i = 0; i < NUM_CIRCLES; i++) {
                System.out.println("Setting color " + i);
                g.setColor(myColor[i]);
                myGraph[i].paint(g);
            }
        }
    }

    class CustomMouseAdapter extends MouseAdapter {

    }

    class CustomMouseMotionAdapter extends MouseMotionAdapter {

        @Override
        public void mouseDragged(MouseEvent me) {
           
            int x = me.getX();
            int y = me.getY();

            for (int i = 0; i < NUM_CIRCLES; i++) {
                
                if (myGraph[i].selected(x, y)) {
                    
                    myGraph[i].setX(x);
                    myGraph[i].setY(y);
                    break;
                }
            }
            
            // what exactly are we repainting??
            repaint();
        }

//        @Override
//        public void mouseMoved(MouseEvent me) {
//            System.out.println("Mouse moved " + me.getX() + "," + me.getY());
//        }
    }

    public MouseListenerFrame() {
        initFrame();
    }
}
