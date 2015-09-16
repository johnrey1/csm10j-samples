/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


/**
 *
 * @author johnr
 * In chapter 6 this was a java application
 * for chapter 12 we are converting the application to an applet
 * 
 */
public class GuiRectangle extends JApplet {
    
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
            try
            {
                Thread.sleep(1000);
            }catch(Exception ex){}
            
            System.exit(0);        
        }
    }
    
    // #1 - add the graphics 
    @Override
    public void paint(Graphics g){
    // what happens if i dont call super?
    super.paint(g);
        
//  does this work?        
//  RectangleComputeGridLayout();    
        // what about this?
//        g.fillRect(10, 10, 20, 20);
    }
    
    @Override
    public void init(){
            RectangleComputeGridLayout();
    }
    
    @Override
    public void start(){
//            RectangleComputeGridLayout();
    }
    
    
    public void RectangleComputeGridLayout(){
//        JFrame rectApp = new JFrame();
//        rectApp.setSize(400, 300);
        
        // this .getContentPane()
        Container content = this.getContentPane();
        GridLayout layout = new GridLayout(5,2);
        // this.setLayout
        this.setLayout(layout);
        
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
        exitBtn.addActionListener(new ExitButtonHandler());
        calcBtn.addActionListener(new CalcButtonHandler());
        calcBtn.addActionListener(new CalcButtonHandler());
        
        // Don't need this anymore
//         rectApp.setVisible(true);
        
//        rectApp.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }
}
