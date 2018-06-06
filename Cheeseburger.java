package cheeseburger;

import java.util.Timer;
import java.util.TimerTask;

/*
 * @author Navin
 */

public class Cheeseburger {
    
    //int to count the number of elapsed seconds
    int secs = 0;
    
    //creates timer object
    Timer timer = new Timer();
    
    //creates task object
    TimerTask task = new TimerTask() {
      public void run() {
        //with each execution, secs will increase by 1
        secs++;
        System.out.println("Elapsed seconds: " + secs + " seconds");
      }
    };

    public void start() {
        timer.scheduleAtFixedRate(task, 5000, 1000);
        //Timer.scheduleAtFixedRate(TimerTask, how long it takes before it starts(ms), increment(ms))
        //starts after 5 seconds and increases ever 1 second
        //1s == 1000ms
    }

    public static void main(String[] args)
    { 
        //creates an object based on the .java file to run 
        Cheeseburger cheese = new Cheeseburger();
        cheese.start();
    }
  
}