package csm10jch02;

import java.util.Scanner;
import java.io.*;

public class RunExamples {

    public static void ExitCodes() {
        // Example of exit codes
        /**
         * In a C program, you can return an int value for an exit code In Java,
         * you use System.exit
         *
         * to check the exit code of your program: Windows: echo %errorlevel%
         * Mac/Unix/Linux: echo $?
         *
         * typically, an exit code of '0' is success
         */
        /**
         * what does this return? on windows? on unix? why?
         */

        System.exit(-1);    // why is this 255 on a mac?
        // System.exit(1);
        // System.exit(0);
    }

    public static void TypeCasting() {
        System.out.println("TypeCasting example");
        char literal = 'A';
        char neg = (char) -1;
        System.out.println("No cast: " + literal);
        System.out.println("Cast char 'A' as int: " + (int) literal);
        System.out.println("Cast -1 as char: " + neg);
    }

    public static void Modulus() {
        System.out.println("Modulus Examples");
        System.out.println("1 % 3 = " + (1 % 3));
        System.out.println("2 % 3 = " + (2 % 3));
        System.out.println("4 % 3 = " + (4 % 3));
    }

    public static void PrePostIncrement() {
        System.out.println("Pre and Post Increment example");
        int x = 0;
        int add1 = ++x;
        System.out.println("x pre-incremented, add1 = " + add1);

        x = 0;
        add1 = x++;
        System.out.println("x post-incremented, add1 = " + add1);
    }

    public static void StringConcatenation() {
        System.out.println("String Concatenation example");
        String myString = "hello " + 12 + 26;
        System.out.println("\"hello \" + 12 + 26 -> " + myString);
        myString = "hello " + (12 + 26);
        System.out.println("\"hello \" + (12 + 26) -> " + myString);
    }

    public static void EscapeCharacters() {
        System.out.println("Escape Characters example");
        System.out.println("This is on a \nNew Line");
        System.out.println("Tab Quote Tab Quote \t\"\t\" ");
        System.out.println("Backslash\\");
    }

    public static void Scanner() throws FileNotFoundException {
        // Take a look at this before lecture #2

        System.out.println("Scanner example");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a filename");
        // use listOfNumbers.txt
        String fileName = console.next();
        // open the file
        Scanner fileScanner = new Scanner(new FileReader(fileName));
        // read 3 values from the file
        System.out.println(fileScanner.nextFloat());
        System.out.println(fileScanner.nextFloat());
        System.out.println(fileScanner.nextFloat());
        fileScanner.close();
        console.close();

        // System.out.println("\nEnter a number");
        // int num = console.nextInt();
        // System.out.printf("You entered %d\n", num);
        // System.out.println("\nEnter a string");
        // String input = console.next();
        // System.out.printf("You entered '%s'\n", input);
        // try putting a space in your input above
        // input = console.next();
        // System.out.printf("You also entered '%s'\n", input);
        // Read from a file
        // Scanner fileScanner = new Scanner(new FileReader("listOfNumbers.txt"));
        // System.out.println(fileScanner.nextFloat());
        // System.out.println(fileScanner.nextFloat());
        // System.out.println(fileScanner.nextFloat());
        // fileScanner.close();
        // Put it all together! What happens if i enter a filename that does not exist?
        // good practice to close streams
        // not closing filestreams can cause weird behaviors
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // ExitCodes();
        TypeCasting();
        Modulus();
        PrePostIncrement();
        StringConcatenation();
        EscapeCharacters();
        // Scanner();
    }

}
