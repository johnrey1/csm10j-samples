/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.*;
import java.lang.Thread;
import java.lang.InterruptedException;

// For the GC example
class MyClass {

    int me = 3;
    int seven = 7;
}

/**
 *
 * @author johnr
 */
public class RunExamples {

    public static void StringFormatting() {
        /**
         * different ways to format strings
         */

        String firstName = "john";
        String lastName = "reynolds";

        // Instead of System.out.print(String.format("",args));
        // Not enough arguments
        // System.out.println(firstName);
        // System.out.printf("%s %s %s\n", firstName, lastName);
        // using the argument_index
        // System.out.printf("%s %1$s %s", firstName, lastName);
        int answer = 42;
        float pi = 3.14f;
        //float longer_pi = 3.14159265359f;
        double longer_pi = 3.14159265359f;
        float gigabyte = 1_000_000_000;

        // illegal
        // System.out.printf("%d", pi);
        // coercion works inline
        // System.out.printf("%d", (int)pi);
        // System.out.println();
        // System.out.printf("%e", gigabyte);
        // System.out.printf("%+e\n", gigabyte);
        // System.out.printf("%+3.2e\n", gigabyte);
        // Right vs left align
        // System.out.printf("%10.3f\n", pi);
        // System.out.printf("%-10.3f\n", pi);
        // Padding
        System.out.printf("%010.3f\n", pi);

        // Give 110%
        System.out.printf("%d%%\n", 110);

        // // Why do i care? alignment
        // System.out.printf("%3.2f %<3.2f\n", pi);
        // System.out.printf("%.10f %<.10f\n", longer_pi);
        // // aligned. why should we not use .10?
        // System.out.printf("%-12.10f %<-12.10f\n", pi);
        // System.out.printf("%-12.2f %<-12.2f\n", pi);
        // //why cant we use '-' and '0' together as flags
        // System.out.printf("% 12.2f %< 12.2f\n", pi);
        // System.out.printf("%012.2f %<012.2f\n", pi);
        // signs
        JOptionPane.showMessageDialog(null, String.format("%1$s %<s %<s", firstName));

        System.out.println();
    }

    public static void GarbageCollection() throws InterruptedException {

        //System.out.printf("Free memory: %,d\n", Runtime.getRuntime().freeMemory());
        // Initial Garbage collect
        System.gc();
        System.out.printf("Free memory: %,d\n", Runtime.getRuntime().freeMemory());

        // for(int i = 0; i < 100; i++)
        // for(int i = 0; i < 1_000_000_000; i++)
        // for(long i = 0; i < 10_000_000_000l; i++)
        for (long i = 0; i < 100_000_000_000l; i++) {
            MyClass x = new MyClass();
        }

        System.out.printf("Before GC: %,d\n", Runtime.getRuntime().freeMemory());

        System.gc();

        System.out.printf("After GC: %,d\n", Runtime.getRuntime().freeMemory());
    }

    private static void FileOutput() throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("Ch3.txt");

        outputFile.println("Hello CSM10J");
        outputFile.printf("Pi is %.2f\n", 3.1415f);

        // what happens if i dont close this?
        outputFile.close();
    }

    public static void Dialogs() {
        // dont discard the result!
        // JOptionPane.showInputDialog("What's your name");
        // String name  = JOptionPane.showInputDialog("What's your name");
        // // System.out.println(name);
        // String value = JOptionPane.showInputDialog("How many sides to a pentagon?");
        // int sides = Integer.parseInt(value); 
        // // System.out.printf("%d\n",sides);
        // JOptionPane.showMessageDialog(null, 
        // 	String.format("%s thinks there are %d sides to a pentagon", name, sides),
        // 	"Output",
        // 	// JOptionPane.INFORMATION_MESSAGE
        // 	 JOptionPane.WARNING_MESSAGE
        // 	// JOptionPane.QUESTION_MESSAGE
        // 	// JOptionPane.PLAIN_MESSAGE			
        // 	);

        int result = JOptionPane.showConfirmDialog(null, "Do you agree?");
        System.out.println("result of confirm " + result);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        GarbageCollection();
        StringFormatting();
        FileOutput();
        Dialogs();
    }

}
