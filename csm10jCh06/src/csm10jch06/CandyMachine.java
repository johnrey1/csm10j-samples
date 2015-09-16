/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch06;

import java.util.Scanner;

class Dispenser {

    double cost = 0.0;
    int numberItems = 0;

    public int getCount() {
        return numberItems;
    }

    public void setCount(int count) {
        this.numberItems = count;
    }

    public boolean makeSale() {
        if (numberItems > 0) {
            numberItems--;
            return true;
        }
        
        return false;
    }

    public void setProductCost(double cost) {
        this.cost = cost;
    }

    public double getProductCost() {
        return cost;
    }

}

class Register {

    double cashOnHand = 0.0;

    public void acceptAmount(double amount) {
        // implement for completeness
    }

    public void returnChange(double returnChange) {
        // implement for completeness
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cash) {
        cashOnHand = cash;
    }

}

/**
 *
 * @author johnr
 */
public class CandyMachine {

    static Scanner scanner = new Scanner(System.in);
    Dispenser cokeDispenser = new Dispenser();
    Dispenser dietCokeDispenser = new Dispenser();
    Dispenser candyBarDispenser = new Dispenser();
    Dispenser chipsDispenser = new Dispenser();

    Register cashRegister = new Register();

    public void TestSetup() {
        // can i access cashOnHand directly? how do i prevent that
        // should i access it directly
        cashRegister.setCashOnHand(20.00);
        cokeDispenser.setCount(5);
        cokeDispenser.setProductCost(1.50);
        dietCokeDispenser.setCount(5);
        dietCokeDispenser.setProductCost(1.50);
        chipsDispenser.setCount(5);
        chipsDispenser.setProductCost(1.25);
        candyBarDispenser.setCount(5);
        candyBarDispenser.setProductCost(1.00);
    }

    public void printDispenser(String name, Dispenser d) {
        if (d.getCount() > 0) {
            System.out.printf("%s costs %.2f%n", name, d.getProductCost());
        }
    }

    public void showSelection() {
        // implement logic to show candy machine contents
        printDispenser("Coke", cokeDispenser);
        printDispenser("Diet Coke", dietCokeDispenser);
        printDispenser("Candy", candyBarDispenser);
        printDispenser("Chips", chipsDispenser);

    }

    public void makeSelection(String name, Dispenser d) {
        // implement logic to select candy 
        double cost = d.getProductCost();
        System.out.printf("%s costs %.2f%n", name, cost);
        
        // should i do something else before asking for money?
        
        System.out.print("Insert money: ");
        double money = scanner.nextDouble();
        double change = money - cost;
        if(change < 0)
        {
            System.out.println("Not enough money");
            return;
        }
            
        this.cashRegister.acceptAmount(money);
        
        this.cashRegister.returnChange(change);
        if(change > 0)
            System.out.printf("here's your change of $%.2f%n", change);
        if( this.cokeDispenser.makeSale() )
            System.out.println("Dispensing " + name);
        
    }

    public void RunConsole() {

        while (true) {
            System.out.println();
            System.out.println("Make a selection: ");
            System.out.print("1 to buy ");
            printDispenser("Coke", cokeDispenser);
            System.out.print("2 to buy ");
            printDispenser("Diet Coke", dietCokeDispenser);
            System.out.print("3 to buy ");
            printDispenser("Candy", candyBarDispenser);
            System.out.print("4 to buy ");
            printDispenser("Chips", chipsDispenser);
            System.out.println("-1 to exit");
            System.out.println("10 to see how much cash we have");
            System.out.println("11 to view inventory");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            // try writing a restock method

            switch (choice) {
                case 1:
                    makeSelection("Coke", cokeDispenser);
                    break;
                case 2:
                    // implement on your own
                    break;
                case 3:
                    // implement on your own
                    break;
                case 4:
                    // implement on your own
                    break;
                case 10:
                    System.out.printf("Cash in register: %.2f%n", cashRegister.getCashOnHand());
                    break;
                case 11:
                    // 
                    System.out.printf("Inventory%n");
                    break;
                case -1:
                    System.out.println("good bye");
                    System.exit(0);
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }

    }

}
