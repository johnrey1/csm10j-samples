/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch13;

/**
 *
 * @author johnr
 */
public class ExP13_01 {
    public static void PrintStars(int lines){
        if(lines <= 0)
            return;
        
        for(int i = 1; i <= lines; i++)
            System.out.print("*");
        System.out.println();
        
        PrintStars(lines-1);
     
        for(int i = 1; i <= lines; i++)
            System.out.print("*");
        
        System.out.println();
    }
}
