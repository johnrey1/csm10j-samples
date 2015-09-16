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
class Incrementer extends Thread {

    RaceCondition r = null;

    public Incrementer(RaceCondition r) {
        this.r = r;
    }

    public void run() {
//        while (r.x < 999999999l) {
//            r.x = r.x + 1;
//            //System.out.println(r.x);
//        }
        
        // updating a shared resource without synchronization
        for(int i = 1; i <= 1000000; i++)
        {
            r.x++;
        }
    }
}

public class RaceCondition {

    long x = 0;

    public void RunRaceCondition() {
        Incrementer i1 = new Incrementer(this);
        Incrementer i2 = new Incrementer(this);
        Incrementer i3 = new Incrementer(this);
        Incrementer i4 = new Incrementer(this);
        Incrementer i5 = new Incrementer(this);
        Incrementer i6 = new Incrementer(this);
        Incrementer i7 = new Incrementer(this);
        Incrementer i8 = new Incrementer(this);
        i1.start();
        i2.start();
        i3.start();
        i4.start();
        i5.start();
        i6.start();
        i7.start();
        i8.start();

        try {
            i1.join();
            i2.join();
            i3.join();
            i4.join();
            i5.join();
            i6.join();
            i7.join();
            i8.join();
        } catch (InterruptedException iex) {
        }
        
        System.out.println("expected\nx: 8000000");
        System.out.println("x: " + x);
    }
}
