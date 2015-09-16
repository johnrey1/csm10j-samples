/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch11;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author johnr
 */
public class Calculator extends JFrame implements ActionListener {

    private String[] keys = {"7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", "C", "=", "+"};
    
    private Object[] keyStrokes = {"7", "8", "9", KeyEvent.VK_SLASH,
        "4", "5", "6", "shift 8",
        "1", "2", "3", KeyEvent.VK_MINUS, 
        "0", "typed C", KeyEvent.VK_EQUALS, KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.SHIFT_DOWN_MASK)};

    private JTextField displayText = new JTextField(30);
    private JButton[] button = new JButton[16];

    private abstract class CustomAction extends AbstractAction{
        protected int index = -1;
        public CustomAction(int index){
            this.index = index;
        }        
    }
    
    // What is going on here? discuss in class
    private void setInputMap() {
        JPanel pane = (JPanel) this.getContentPane();
        
        InputMap imap = pane.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        for (int index = 0; index < button.length; index++) {
            if(keyStrokes[index] instanceof String)
                imap.put(KeyStroke.getKeyStroke((String)keyStrokes[index]), index);
            else if(keyStrokes[index] instanceof KeyStroke)
                imap.put((KeyStroke)keyStrokes[index], index);
            else
                imap.put(KeyStroke.getKeyStroke((int)keyStrokes[index],0), index);
    
            pane.getActionMap().put(index, new CustomAction(index){
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    button[this.index].doClick();
                }                
            });
        }
    }

    // what kind of layout is being used
    public Calculator() {
        this.setTitle("Calculator");
        this.setSize(230, 200);

        Container pane = getContentPane();

        // what happens if i dont set this to null?
        pane.setLayout(null);

        displayText.setSize(200, 30);
        displayText.setLocation(10, 10);
        displayText.setFocusable(false);
        pane.add(displayText);

        addButtons(pane);
        
        setInputMap();

    }

    private void addButtons(Container pane) {
        int x = 10, y = 40;

        for (int ind = 0; ind < button.length; ind++) {
            button[ind] = new JButton(keys[ind]);

            // what is this doing??
            button[ind].addActionListener(this);

            button[ind].setSize(50, 30);
            button[ind].setLocation(x, y);
            pane.add(button[ind]);
            x += 50;

            if ((ind + 1) % 4 == 0) {
                x = 10;
                y += 30;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
    }
}
