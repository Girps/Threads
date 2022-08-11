/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesse
 */
public class MultithreadThing implements Runnable {
    
    // Now lets assign a number to each thread 
    private int threadNumber; 
    
    public  MultithreadThing(int threadNumber)
    {
        this.threadNumber = threadNumber; 
    }
    
    
    // Inside this method code will be excuted in mulitple threads 
    @Override
    public void run()
    {
        if(threadNumber == 3)
        {
            throw new java.lang.RuntimeException("Bleh"); 
        }
        
       for(int i = 1; i <= 5; ++i)
       {
           System.out.println(i + " from thread " + this.threadNumber); 
           try
           {
           Thread.sleep(1000); // pause thread for 1 sec
           } 
           catch(java.lang.Exception prb)
           {
               
           }
       } 
    }
}
