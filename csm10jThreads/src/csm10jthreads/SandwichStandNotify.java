/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jthreads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

class SandwichMaker implements Runnable {

    int id = -1;
    SandwichStandNotify stand = null;

    public SandwichMaker(SandwichStandNotify s, int id) {
        this.stand = s;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(id + " making sandwich");
                stand.addSandwich();
                System.out.println(id + " added sandwich");

            } catch (InterruptedException iex) {
                System.out.println("Maker " + id + " wokeup");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException iex) {
                System.out.println("Maker " + id + " wokeup from sleep");
            }

        }
    }

}

class Customer implements Runnable {

    int id = -1;
    SandwichStandNotify stand = null;

    public Customer(SandwichStandNotify s, int id) {
        this.stand = s;
        this.id = id;
    }

    @Override
    public void run() {
        // buy 5 sandwiches
        for (int i = 1; i <= 20; i++) {
            System.out.println("Customer " + id + " attempting to buy sandwich #" + i);
            try {
                stand.buySandwich();

                System.out.println("Customer " + id + " bought sandwich #" + i);
//                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException ex) {
                System.out.println("Customer " + id + " interrupted");
            }

        }
    }

}

/**
 *
 * @author johnr
 */
public class SandwichStandNotify {

    int numSandwiches = 0;
    int maxSandwiches = 5;
    int sandwichesSold = 0;
    final Lock sandwichLock = new ReentrantLock();
    final Condition notFull = sandwichLock.newCondition();
    final Condition notEmpty = sandwichLock.newCondition();

    public void addSandwich() throws InterruptedException {
        sandwichLock.lock();
        try {
            if (numSandwiches == maxSandwiches) {
                notFull.await();   //used to be wait / notify
            }
            numSandwiches++;
            System.out.println("avail sammich count" + numSandwiches);
            // show the difference between
//            notEmpty.signal();
            notEmpty.signalAll();
        } finally {
            sandwichLock.unlock();
        }
    }

    public void buySandwich() throws InterruptedException {
        sandwichLock.lock();
        try {
            if (numSandwiches == 0) {
                notEmpty.await();
            }
            numSandwiches--;
            System.out.println("buy sammich count" + numSandwiches);
            sandwichesSold++;
            // 
//            notFull.signal();
            notFull.signalAll();
        } finally {
            sandwichLock.unlock();
        }
    }

    public void RunStand() {
        Thread p1 = new Thread(new SandwichMaker(this, 1), "p1");
        Thread p2 = new Thread(new SandwichMaker(this, 2), "p2");

        Thread c1 = new Thread(new Customer(this, 1), "c1");
        Thread c2 = new Thread(new Customer(this, 2), "c2");
        Thread c3 = new Thread(new Customer(this, 1), "c3");
        Thread c4 = new Thread(new Customer(this, 2), "c4");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();

        while (true) {
            System.out.println("Total sold: " + this.sandwichesSold);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException iex) {
            }
        }
//        c3.start();        
//        c4.start();
//        try{
//            p1.join();
//            p2.join();
//            
//        }catch(InterruptedException iex){
//            System.out.println
//        }
    }
}
