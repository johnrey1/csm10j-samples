/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch12;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Rect3dFrame extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics gee = this.getContentPane().getGraphics();

        Polygon p = new Polygon(new int[]{0, 5, 10}, new int[]{0, 5, 20}, 3);

        gee.drawPolygon(p);

//        g.setColor(Color.gray);
//        g.draw3DRect(25, 10, 50, 75, true);
//        g.draw3DRect(25, 110, 1000, 75, false);
//        g.fill3DRect(100, 10, 50, 75, true);
//        g.fill3DRect(100, 110, 50, 75, false);
    }

}

// The font example in the book is an applet, but the same principles apply
class FontExample extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setFont(new Font("Courier", Font.BOLD, 24));
        g.drawString("Courier bold 24pt font", 30, 36);

        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("Arial plain 30pt font", 30, 70);

        g.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 36));
//                g.setColor(new Color(new Random().nextFloat(),new Random().nextFloat(),new Random().nextFloat()));
        g.drawString("Dialog italic bold 36pt font", 30, 110);

        // book is incorrect, shoudl be 42
        g.setFont(new Font("Serif", Font.ITALIC, 42));
//        g.setColor(new Color(new Random().nextFloat(),new Random().nextFloat(),new Random().nextFloat()));
        g.drawString("Serif italic 42pt font", 30, 156);
    }
}

// color example in the book is japplet
class ColorExample extends JFrame {

    JLabel topLeft, topRight, bottomLeft, bottomRight;

    public void setup() {

        Container c = getContentPane();

        topLeft = new JLabel("Red", SwingConstants.CENTER);
        topRight = new JLabel("Green", SwingConstants.CENTER);
        bottomLeft = new JLabel("Blue", SwingConstants.CENTER);
        bottomRight = new JLabel("Random", SwingConstants.CENTER);

        c.setLayout(new GridLayout(2, 2));

        c.add(topLeft);
        c.add(topRight);
        c.add(bottomLeft);
        c.add(bottomRight);
    }

    public void colorUp() {
        topLeft.setForeground(Color.red);
        topRight.setForeground(Color.green);
        bottomLeft.setForeground(Color.blue);
        bottomRight.setForeground(new Color(new Random().nextFloat(), new Random().nextFloat(), new Random().nextFloat()));
    }
}

/**
 *
 * @author johnr
 */
public class RunExamples {

    private static void ListFonts() {
        // list fonts availalble
        String[] fontList = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String name : fontList) {
            System.out.println(name);
        }
    }

    private static void FontExample() {
        FontExample f = new FontExample();
        f.setSize(500, 190);
        f.setVisible(true);
    }

    private static void ColorExample() {
        ColorExample c = new ColorExample();
        c.setup();
        c.setSize(400, 200);
        c.setVisible(true);
        c.colorUp();
    }

    private static void GraphicsExample() {
        RandomShapes r = new RandomShapes();
        r.setSize(400, 300);
        // does paint get called if setVisible is not true
        r.setVisible(true);
    }

    private static void TextAreaExample() {
        TextAreaExample teEx = new TextAreaExample();
        teEx.setVisible(true);
    }

    private static void CheckBoxExample() {
        CheckboxExample chkEx = new CheckboxExample();
        chkEx.setVisible(true);
    }

    private static void RadioButtonExample() {
        RadioButtonExample radioEx = new RadioButtonExample();
        radioEx.setVisible(true);
    }

    private static void ComboboxExample() {
        ComboboxExample comboEx = new ComboboxExample();
        comboEx.setVisible(true);
    }

    private static void ListboxExample() {
        ListboxExample listEx = new ListboxExample();
        listEx.setVisible(true);
    }

    private static void MenuExample() {
        MenuExample meEx = new MenuExample();
        meEx.setVisible(true);
    }
    
    private static void KeyListenerExample(){
        KeyListenerFrame keyFrame = new KeyListenerFrame();
        
        keyFrame.setVisible(true);
    }
    
    private static void MouseListenerExample() {
        MouseListenerFrame mouseFrame = new MouseListenerFrame();
        
        mouseFrame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ListFonts();
//        FontExample();
//        ColorExample();

        // try adding color to the font example
//        GraphicsExample();
//        TextAreaExample();
//        CheckBoxExample();
//        RadioButtonExample();
//        ComboboxExample();
//        ListboxExample();
//        MenuExample();
//        KeyListenerExample();

        MouseListenerExample();
        
// TODO code application logic here
// Drawing examples        
//        Rect3dFrame threeDee = new Rect3dFrame();
//        threeDee.setSize(100, 100);
//        threeDee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        threeDee.setVisible(true);
//        
//        System.out.println("Hello");
    }

    

}
