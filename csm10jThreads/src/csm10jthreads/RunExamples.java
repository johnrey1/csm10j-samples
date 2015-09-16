/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jthreads;



/**
 *
 * @author johnr
 */
public class RunExamples {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        RaceCondition r = new RaceCondition();
//        r.RunRaceCondition();
        
        SandwichStandNotify stand = new SandwichStandNotify();
        stand.RunStand();
    }

}
