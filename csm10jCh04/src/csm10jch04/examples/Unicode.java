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
public class Unicode {
    public static void EnumerateAscii(){
        for(int i = 0; i <= 255; i++){
            System.out.printf("%d is '%<c'\n", i);
        }
    }
}
