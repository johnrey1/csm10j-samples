/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch13;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Math.sqrt;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author johnr
 */
public class ExP13_16 extends JFrame {
    
    HashMap<Integer, Color> map = new HashMap<>();
    
    int yPad = 20;
    int xPad = 50;
    
    int side = 500;
    int height = (int) (Math.sqrt(3) * (side / 2));
    
    int order = 0;
    
    Random r = new Random();
    
    public ExP13_16() {
        setSize(600, 700);
        setTitle("Koch Snowflake");
        
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {                
                order = Integer.parseInt(JOptionPane.showInputDialog("Order of Koch Snowflake"));
                repaint();
            }
        });
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        if (order == 0) {
            g.setFont(new Font("Arial", Font.PLAIN, 24));
            g.setColor(Color.black);
            g.drawString("Click to draw snowflake", 50, 50);
            return;
        }
        
        int[] x = new int[3];
        int[] y = new int[3];
        
        x[0] = 0;
        y[0] = side;
        
        x[1] = side;
        y[1] = side;
        
        x[2] = side / 2;
        y[2] = side - height;
        
        addPadding(x, y);
        drawKochLine(g, x[0], y[0], x[1], y[1], order);
        drawKochLine(g, x[1], y[1], x[2], y[2], order);
        drawKochLine(g, x[2], y[2], x[0], y[0], order);
        
    }
    
    private void addPadding(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            x[i] += xPad;
        }
        for (int i = 0; i < y.length; i++) {
            y[i] += yPad;
        }
    }
    
    private void drawKochLine(Graphics g, int x1, int y1, int x5, int y5, int order) {
        if (order == 0) {
            // randomize the colors
            g.setColor(new Color(r.nextFloat(), r.nextFloat(), r.nextFloat()));
            g.drawLine(x1, y1, x5, y5);
        } else {
            // compute new set of line segments
            int deltaX = x5 - x1;
            int deltaY = y5 - y1;

            // split into three line segments
            int x2 = x1 + deltaX / 3;
            int y2 = y1 + deltaY / 3;
            
            int x3 = (int) (.5 * (x1 + x5) + sqrt(3) * (y1 - y5) / 6);
            // wow, i reversed x5 and x1 and caused myself a world of pain
            int y3 = (int) (.5 * (y1 + y5) + sqrt(3) * (x5 - x1) / 6);
            
            int x4 = x1 + 2 * deltaX / 3;
            int y4 = y1 + 2 * deltaY / 3;
            
            drawKochLine(g, x1, y1, x2, y2, order - 1);
            drawKochLine(g, x2, y2, x3, y3, order - 1);
            drawKochLine(g, x3, y3, x4, y4, order - 1);
            drawKochLine(g, x4, y4, x5, y5, order - 1);
        }
    }
    
}
