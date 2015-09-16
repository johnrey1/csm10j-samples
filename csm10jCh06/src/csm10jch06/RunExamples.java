/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch06;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author johnr
 */

// try extending JFrame to create a new application window
public class RunExamples extends JFrame
{

    public static void LaunchAppWindowExtends(){
        RunExamples runApp = new RunExamples();
        runApp.setSize(400, 300);
        runApp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // why doesnt thiswork
        runApp.setBackground(Color.blue);
        // runApp.getContentPane().setBackground(Color.red);
        // try commenting the next line and see what happens to the application
        runApp.setVisible(true);        
        
    }
    
    // method 2 of creating windows
    public static void LaunchAppWindowNoExtends(){
        JFrame app = new JFrame();
        app.setSize(400, 300);
        // try commenting the next line and see what happens to the application
        app.setVisible(true);
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CandyMachine candyMachine = new CandyMachine();
        candyMachine.TestSetup();
        // candyMachine.showSelection();
        candyMachine.RunConsole();
        // can you extend this with a gui?
        
        // Try this instead of extends JFrame
        // LaunchAppWindowExtends();
        // LaunchAppWindowNoExtends();
        
//        GuiRectangle rectApp = new GuiRectangle();
//        rectApp.RectangleComputeNoLayout();
//        rectApp.RectangleComputeGridLayout();
//        TempConverter tempApp = new TempConverter();
//        tempApp.Solution();

        // Vector Examples
        VectorExamples.VectorDeclareAndBox();
        // does the length match the size of the vector we declared
        // can we add more elements than capacity?
        VectorExamples.VectorLength(20);
        // we can pass vectors as parameters
        VectorExamples.VectorPassing();
        // we can index vectors using elementAt;
        VectorExamples.IndexVector(2);
    }
    
}
