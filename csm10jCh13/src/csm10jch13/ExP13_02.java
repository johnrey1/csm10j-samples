package csm10jch13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnr
 */
public class ExP13_02 {
    /**
     * calling with level = 4 produces
     *     *    
     *    * *
     *   * * *
     *  * * * *
     *   * * *
     *    * *
     *     *
     * @param level
     * @param width 
     */
    public static void PrintDiamond(int lines){
        PrintDiamond(1, lines);
    }
    
    public static void PrintDiamond(int currentLine, int totalLines){
        PrintStarLine(currentLine, totalLines - currentLine);
        
        if(currentLine == totalLines)
            return;
        
        PrintDiamond(currentLine + 1, totalLines);        
        
        PrintStarLine(currentLine, totalLines - currentLine);
    }
    
    public static void PrintStarLine(int line, int padding){
        for(int i = 0; i <= padding; i ++)
            System.out.print(" ");
        for(int i = 0; i < line; i++)
            System.out.print("* ");
        
        System.out.println();
    }
}
