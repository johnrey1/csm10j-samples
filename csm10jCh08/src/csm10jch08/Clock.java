/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch08;

/**
 *
 * @author johnr
 */
public class Clock {
    
    private int hours, minutes, seconds;
    
    // The inverted pyramid hierarchy of constructors
    public Clock(int hours, int mins, int seconds){
        this.hours = hours;
        this.minutes = mins;
        this.seconds = seconds;
    }
    
    public Clock(int hours, int mins){
        this(hours, mins, 0);
    }
    
    public Clock(int hours){
        this(hours, 0);
    }
    
    public Clock(){
        this(0);
    }
    
    
    
    
    // Copy constructor
    public Clock(Clock source){
        // why can i access the private variables of the source clock?
        this.hours = source.hours;
        this.minutes = source.minutes;
        this.seconds = source.seconds;
    }
    
    @Override
    public void finalize() throws Throwable{

        
        System.out.println("This clock is going away!");
                super.finalize();
    }
    
    // Try toString with and without this method enabled
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Clock time: ").append(getHours()).append(":");
        sb.append(minutes).append(":");
        sb.append(seconds);
        
        return sb.toString();
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }
}
