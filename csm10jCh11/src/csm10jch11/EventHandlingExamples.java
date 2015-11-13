/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author johnr
 */
public class EventHandlingExamples {

    public static void InnerClassPoints() {
        InnerClassPointsExample ex = new InnerClassPointsExample();

        System.out.println("Adding points");
        ex.addPoint(1, 1, 1);
        ex.addPoint(0, 0, 0);

        System.out.println("Does it contain (0,0,0)? " + ex.hasPoint(0, 0, 0));

        System.out.println("Does it contain (0,0,1)? " + ex.hasPoint(0, 0, 1));

        // can i create an instance of Point3D?
        // InnerClassPointsExample.Point3D point = new InnerClassPointsExample.Point3D(1,2,3);
        // what is this? why should i make the inner class private
        // InnerClassPointsExample.Point3D point = ex.new Point3D(1,2,3);
    }

    public static void RectActionEvent() {
        GuiRectangle rect = new GuiRectangle();
        rect.RectangleGridLayout();
    }

    // why did i have to make this class static
    private static class RectMouseAdapter extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("MouseEvent.toString(): " + e.toString());
            System.out.println("MouseButton: " + e.getButton());
            System.out.printf("Points: %d, %d; Onscreen: %d, %d%n%n",
                    e.getX(), e.getY(), e.getXOnScreen(), e.getYOnScreen());
        }
    }

    public static void RectMouseEvent() {
        GuiRectangle rect = new GuiRectangle();
        rect.calcBtn.addMouseListener(new RectMouseAdapter());
        rect.RectangleGridLayout();
    }

    public static void RectAnonymousListener() {
        GuiRectangle rect = new GuiRectangle();

        // Does this work? why or why not?
        rect.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.toString());
                System.out.println("Char: " + e.getKeyChar());
            }
        });

        // Does this work?
        rect.lengthTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("isConsumed(): " + e.isConsumed());
                System.out.println(e.toString());
                System.out.println("Char: " + e.getKeyChar());
            }
        });

        rect.RectangleGridLayout();

    }

    public static void RectLamdbaListener() {
        GuiRectangle guiRect = new GuiRectangle();
        guiRect.RectangleGridLayout();

        ActionListener[] listeners = guiRect.calcBtn.getActionListeners();
        for (ActionListener l : listeners) {
            guiRect.calcBtn.removeActionListener(l);
        }

        //why cant i do a lambda expression with mouse listeners
        // why is the concept of moving the code to the data important
        // remember, if i were doing this inside GuiRectangle, i wouldnt need the public
        // references to data
        guiRect.calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("my anonymous class was called");
                ((JButton) (event.getSource())).setEnabled(false);
                guiRect.rect.setLength(Double.parseDouble(guiRect.lengthTxt.getText()));
                guiRect.rect.setWidth(Double.parseDouble(guiRect.widthTxt.getText()));

                guiRect.areaTxt.setText(String.valueOf(guiRect.rect.computeArea()));
                guiRect.perimTxt.setText(String.valueOf(guiRect.rect.computePerimeter()));

            }
        });

        guiRect.calcBtn.addActionListener(event -> {
            System.out.println("Lambda calc button clicked");

        });

    }

    public static void CalcExample() {
        Calculator c = new Calculator();
        c.setVisible(true);
    }
}
