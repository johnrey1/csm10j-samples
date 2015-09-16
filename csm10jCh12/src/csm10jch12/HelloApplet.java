/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch12;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author johnr
 */
public class HelloApplet extends JApplet {
    @Override
    public void init(){
        super.init();
        
    }
    
    @Override
    public void paint(Graphics g){
        // in the browser, run the applet, then uncomment this and reload the page
        // is the background updated?
//        getContentPane().setBackground(Color.red);
        
        g.drawString("Hello CS M10J!", 20, 20);
        
        
    }
    
}
