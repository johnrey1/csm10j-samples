package csm10jch11;

import static csm10jch11.EventHandlingExamples.CalcExample;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author johnr
 */
public class RunExamples {   
    public static void main(String[] args) {
//        ExceptionHandlingExamples
//        ExceptionHandlingExamples.Example11_3();
//        ExceptionHandlingExamples.DefaultUncaught();
//        ExceptionHandlingExamples.PrintStack();

//        try
//        {
//            int a = 12, b = 0;
//            Exercise11_9(a,b);
//        }
//        catch(DivideByZeroException dbzeRef){
//            System.out.println("Got a divide by zero exception" + dbzeRef.getMessage());
//        }
        
        
        //Event handling examples
//        EventHandlingExamples.InnerClassPoints();
//        EventHandlingExamples.RectActionEvent();
//        EventHandlingExamples.RectMouseEvent();
//        EventHandlingExamples.RectAnonymousListener();
//        EventHandlingExamples.RectLamdbaListener();

        EventHandlingExamples.CalcExample();
        
        //String input = JOptionPane.showInputDialog(null, "dialog message");
        
    }
    
}

    