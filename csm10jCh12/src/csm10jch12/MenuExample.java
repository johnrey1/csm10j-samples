/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

/**
 *
 * @author johnr
 */
public class MenuExample extends JFrame implements ActionListener{
    public MenuExample(){
        init();
    }

    private JMenuBar mb = new JMenuBar();
    private JMenu fileMenu, editMenu, customMenu; 
    private JMenuItem quit;
    
    private void init() {
        
        this.setSize(500,300);
        fileMenu = new JMenu("My File");
        editMenu = new JMenu("My Edit");
        customMenu = new JMenu("Custom menu");
        
        quit = new JMenuItem("Quit");
//        quit.addActionListener(this);
        quit.addActionListener(evt -> { System.exit(0);});
        
        fileMenu.add(new JSeparator());
        fileMenu.add(quit);
        
        mb.add(fileMenu);
        mb.add(editMenu);
        mb.add(customMenu);
        
        // hmm why cant i do this
//        this.setMenuBar(mb);
        this.setJMenuBar(mb);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == quit)
            System.exit(0);
    }
}
