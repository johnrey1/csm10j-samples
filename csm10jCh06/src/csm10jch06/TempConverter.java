/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch06;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author johnr
 */
public class TempConverter {
    
    double OFFSET_DEGREES = 32.0;
    double C_TO_F = 9.0 / 5.0;
    double F_TO_C = 5.0 / 9.0;
    
    JTextField centigradeTxt = new JTextField(10);
    JTextField fahrenheitTxt = new JTextField(10);
    
    
    private class CentigradeChangeHandler implements ActionListener{
       
        @Override
        public void actionPerformed(ActionEvent e) {
           
            // implement logic
           fahrenheitTxt.setText("implement!");
        }
    }
    
    private class FahrenheitChangeHandler implements ActionListener{
       
        @Override
        public void actionPerformed(ActionEvent e) {
           // implement logic
            centigradeTxt.setText("implement!");
            
        }
    }
    
    public static double ConvertToF(double centigrade){
        // fill in the logic
        return centigrade;
    }
    
    public static double ConvertToC(double fahrenheit){
        // fill in the logic
        
        return fahrenheit;
    }
    
    public void Solution(){
        JFrame app = new JFrame();
        app.setSize(640,50);
        app.setTitle("Temperature Conversion");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.getContentPane().setLayout(new GridLayout(1,4));
        app.getContentPane().add(new JLabel("Temp in Celsius:", SwingConstants.RIGHT));
        app.getContentPane().add(centigradeTxt);
        
        app.getContentPane().add(new JLabel("Temp in Fahrenheit:", SwingConstants.RIGHT));
        app.getContentPane().add(fahrenheitTxt);
        
        fahrenheitTxt.addActionListener(new FahrenheitChangeHandler());
        centigradeTxt.addActionListener(new CentigradeChangeHandler());
        
        app.setVisible(true);
    
    }
}
