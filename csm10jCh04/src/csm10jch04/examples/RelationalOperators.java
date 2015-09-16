/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10jch04.examples;


/**
 *
 * @author johnr
 */
public class RelationalOperators {
    public static void Equal(){        
        System.out.println("Does 'A' == 65 ? " + ('A' == 65));
        System.out.println("Does 'a' == 97 ? " + ('a' == 97));
        System.out.println("Does 'a' == 'A' ? " + ('a' == 'A'));
        System.out.println("Does 'a' == 97.0 ? " + ('a' == 97.0));
        System.out.println("Does 97 == 97.0 ? " + (97 == 97.0));
    }
    
    public static void NotEqualTo(){
        System.out.println("Does 'A' != 65 ? " + ('A' != 65));
        System.out.println("Does 'a' != 97 ? " + ('a' != 97));
        System.out.println("Does 'a' != 'A' ? " + ('a' != 'A'));
        System.out.println("Does 'a' != 97.0 ? " + ('a' != 97.0));
        System.out.println("Does 97 != 97.0 ? " + (97 != 97.0));
    }
    
    public static void LessThan(){
        System.out.println("Is 'A' < 'a' ? " + ('A' < 'a' ));
        System.out.println("Is 'a' < 'A' ? " + ('a' < 'A'));
        System.out.println("Is 'a' < 'a' ? " + ('a' < 'a'));
        System.out.println("Is 3.14159265359f < 3.14159265359 ? " 
                + (3.14159265359f < 3.14159265359));
    }
    
    public static void LTE(){
        System.out.println("Is 'A' <= 'a' ? " + ('A' <= 'a' ));
        System.out.println("Is 'a' <= 'A' ? " + ('a' <= 'A'));
        System.out.println("Is 'a' <= 'a' ? " + ('a' <= 'a'));
        System.out.println("Is 3.14159265359f <= 3.14159265359 ? " 
                + (3.14159265359f <= 3.14159265359));
    }
    
    public static void GreaterThan(){
        System.out.println("Is '0' > 'a' ? " + ('0' > 'a' ));
        System.out.println("Is 'a' > '0' ? " + ('a' > '0'));
        
    }
    
   public static void GreaterThanEqual(){
        System.out.println("Is 'a' >= 'A' ? " + ('a' >= 'A'));
        System.out.println("Is 'a' >= 'a' ? " + ('a' >= 'a'));
        System.out.println("Is '0' >= 'a' ? " + ('0' >= 'a' ));
        System.out.println("Is 'a' >= '0' ? " + ('a' >= '0'));        
    }
    
    public static void StringEquality(){
        // The compiler does a little trick with something called a 'literal pool'
        // so if you dont use the 'new' operator, the string can go in the stack
        // if you use the 'new' operator the string goes in the heap
       
        String str1 = "Ivan";
        String str2 = "Frank";
        str2 = "Ivan";
        
        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + (str1.equals(str2)));
        
        String str3 = "Cheryl";
        String str4 = new String("Cheryl");        
        
        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ? " + (str3.equals(str4)));
        
        str4 = "Jessica";
        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ? " + (str3.equals(str4)));
        
        // compare to
        
        System.out.printf("apple.compareTo(apple) -> %d%n", "apple".compareTo("apple"));
        System.out.printf("apple.compareTo(Apple) -> %d%n", "apple".compareTo("Apple"));
        System.out.printf("apple.compareTo(orange) -> %d%n", "apple".compareTo("orange"));
        System.out.printf("apple.compareTo(aPple) -> %d%n", "apple".compareTo("aPple"));
        System.out.printf("apple.compareTo(appl) -> %d%n", "apple".compareTo("appleee"));
        
        System.out.printf("apple.compareToIgnoreCase(apPLE) -> %d%n", "apple".compareToIgnoreCase("apPLE"));
        
    }
}
