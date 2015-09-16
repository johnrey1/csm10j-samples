/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author johnr
 */
public class Sierpinski extends JFrame {

    int order = 0;
    long now = (new Date()).getTime();
    int side = 500;
    int height = (int) (Math.sqrt(3) * (side / 2));
    int xPad = 20, yPad = 20;

    Point A = new Point(side / 2 + xPad, yPad);
    Point B = new Point(xPad, yPad + height);
    Point C = new Point(xPad + side, yPad + height);

    public Sierpinski() {
        setTitle("Sierpinski");
        setSize(600, 700);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                order = Integer.parseInt(JOptionPane.showInputDialog("Enter Sierpinski level"));
                repaint();
            }
        });
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        drawSierpinski(g, A, B, C, order, 0);
    }

    // failed first attempt playing around
//    private void drawSierpinski(Graphics g, Point A, Point B, Point C, int order, int currentLevel) {
//        if(currentLevel > order)
//            return;
//        
//        Random r = new Random((long) (currentLevel));
//        g.setColor(new Color(r.nextFloat(), r.nextFloat(), r.nextFloat()));
//        g.fillPolygon(new int[]{A.x, B.x, C.x}, new int[]{A.y, B.y, C.y}, 3);
//        
//        drawSierpinski(g, midPoint(A,B), midPoint(A,C), midPoint(B,C), order, currentLevel + 1);
//        
//        if (order == currentLevel) {
//            return;
//        }
//    }

    // why did i do this differently than the book?
    private void drawSierpinski(Graphics g, Point A, Point B, Point C, int order, int currentLevel) {
        Random r = new Random(now * currentLevel+1);
        g.setColor(new Color(r.nextFloat(), r.nextFloat(), r.nextFloat()));

        g.fillPolygon(new int[]{A.x, B.x, C.x}, new int[]{A.y, B.y, C.y}, 3);
        
        if(order == currentLevel)
            return;
        
        Point P = midPoint(A,B), Q = midPoint(A,C), R = midPoint(B,C);
        
        drawSierpinski(g, A, P, Q, order, currentLevel + 1);
        drawSierpinski(g, P, B, R, order, currentLevel + 1);
        drawSierpinski(g, Q, R, C, order, currentLevel + 1);       
    }
    
    private Point midPoint(Point A, Point B) {
        return new Point((B.x + A.x) / 2, (B.y + A.y) / 2);
    }

}
