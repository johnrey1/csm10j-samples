/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch11;

import csm10jch11.Rectangle;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author johnr
 */
public class GuiRectangle extends JFrame {
    
    // why do the text fields need to be declared here instead of in the method?
    public JTextField lengthTxt = new JTextField(10);
    public JTextField widthTxt = new JTextField(10);
    public JTextField areaTxt = new JTextField(10);
    public JTextField perimTxt = new JTextField(10);
    
    public JLabel lengthLbl = new JLabel("Enter the length:",SwingConstants.RIGHT);
    public JLabel widthLbl = new JLabel("Enter the width:",SwingConstants.RIGHT);
    public JLabel areaLbl = new JLabel("Area:",SwingConstants.RIGHT);
    public JLabel perimLbl = new JLabel("Perimeter:",SwingConstants.RIGHT);
      
    public JButton calcBtn = new JButton("Calculate");
    public JButton exitBtn = new JButton("Exit");
    
    
    // why should we use this rectangle class
    // instead of just doing computation in the app?
    public Rectangle rect = new Rectangle();
    
    // why do we need to put these handler classes inside the GUI Rectangle class?
    private class CalcButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ActionCommand: " + e.getActionCommand());
            System.out.println("Modifiers: " + e.getModifiers());
            System.out.println("Source: " + e.getSource().toString());
            
            System.out.println("Calc button clicked");
            rect.setLength(Double.parseDouble(lengthTxt.getText()));
            rect.setWidth(Double.parseDouble(widthTxt.getText()));
            
            areaTxt.setText(String.valueOf(rect.computeArea()));
            perimTxt.setText(String.valueOf(rect.computePerimeter()));
            
        }
    }

    private class ExitButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Exit button clicked");
            System.exit(0);        
        }
    }
    
    
    public void RectangleGridLayout(){
        JFrame rectApp = new JFrame();
        rectApp.setSize(400, 300);
        
        Container content = rectApp.getContentPane();
        GridLayout layout = new GridLayout(5,2);
        rectApp.setLayout(layout);
       
        content.add(lengthLbl);
        content.add(lengthTxt);
        
        content.add(widthLbl);
        content.add(widthTxt);
        
        content.add(areaLbl);
        content.add(areaTxt);
        
        content.add(perimLbl);
        content.add(perimTxt);

        content.add(calcBtn);
        content.add(exitBtn);
        

        exitBtn.addActionListener(new ExitButtonHandler());
        calcBtn.addActionListener(new CalcButtonHandler());
        
        rectApp.setVisible(true);
        rectApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
}
