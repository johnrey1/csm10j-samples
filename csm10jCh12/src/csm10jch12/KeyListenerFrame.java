/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch12;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author johnr
 */
public class KeyListenerFrame extends JFrame implements KeyListener {

    JTextField key = new JTextField(1);
    
    public KeyListenerFrame(){
        initFrame();
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Got key typed");
        // why this line?
        key.setText(" ");
        key.setFont(new Font("Arial", Font.BOLD, 100));
        key.setText(String.valueOf(e.getKeyChar()));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Got keypress " + e.getKeyChar());

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Got key released " + e.getKeyChar());
    }

    private void initFrame() {
        
        setSize(300,300);
        getContentPane().add(key);
        this.addKeyListener(this);
        key.setFocusable(false);
        
    }
    
}
