/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch06;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




/**
 *
 * @author johnr
 */
public class GuiRectangle {
    
    // why do the text fields need to be declared here instead of in the method?
    JTextField lengthTxt = new JTextField(10);
    JTextField widthTxt = new JTextField(10);
    JTextField areaTxt = new JTextField(10);
    JTextField perimTxt = new JTextField(10);
    
    // why should we use this rectangle class
    // instead of just doing computation in the app?
    Rectangle rect = new Rectangle();
    
    // why do we need to put these handler classes inside the GUI Rectangle class?
    private class CalcButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
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
    
    public void RectangleComputeNoLayout(){
        JFrame rectApp = new JFrame();
        rectApp.setSize(400, 300);
        
        Container content = rectApp.getContentPane();
        
        // sometimes we use the type in the name for readability
        JLabel lengthLbl = new JLabel("Enter the length:");
        JLabel widthLbl = new JLabel("Enter the width:");
        JLabel areaLbl = new JLabel("Area:");
        JLabel perimLbl = new JLabel("Perimeter:");
        
        JTextField lengthTxt = new JTextField(10);
        JTextField widthTxt = new JTextField(10);
        JTextField areaTxt = new JTextField(10);
        JTextField perimTxt = new JTextField(10);
        
        JButton calcBtn = new JButton("Calculate");
        JButton exitBtn = new JButton("Exit");
        
        content.add(lengthLbl);
        content.add(widthLbl);
        content.add(areaLbl);
        content.add(perimLbl);
        
        content.add(lengthTxt);
        content.add(widthTxt);
        content.add(areaTxt);
        content.add(perimTxt);
        
        content.add(calcBtn);
        content.add(exitBtn);
        
        // try commenting the next line and see what happens to the application
        rectApp.setVisible(true);
    }
    
    public void RectangleComputeGridLayout(){
        JFrame rectApp = new JFrame();
        rectApp.setSize(400, 300);
        
        Container content = rectApp.getContentPane();
        GridLayout layout = new GridLayout(5,2);
        rectApp.setLayout(layout);
        
        // sometimes we use the type in the name for readability
        JLabel lengthLbl = new JLabel("Enter the length:",SwingConstants.RIGHT);
        JLabel widthLbl = new JLabel("Enter the width:",SwingConstants.RIGHT);
        JLabel areaLbl = new JLabel("Area:",SwingConstants.RIGHT);
        JLabel perimLbl = new JLabel("Perimeter:",SwingConstants.RIGHT);
        

        
        JButton calcBtn = new JButton("Calculate");
        JButton exitBtn = new JButton("Exit");
        
        
        // does the order of adding to the grid matter?
//        content.add(lengthLbl);
//        content.add(widthLbl);
//        content.add(areaLbl);
//        content.add(perimLbl);
//        
//        content.add(lengthTxt);
//        content.add(widthTxt);
//        content.add(areaTxt);
//        content.add(perimTxt);

        // how does this order change the gui
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
        
        // uncomment to get the app to exit
        exitBtn.addActionListener(new ExitButtonHandler());
        calcBtn.addActionListener(new CalcButtonHandler());
        
        rectApp.setVisible(true);
        
        // does the exit button exit the app?
    }
}
