/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesse
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        MultithreadThing myThing = new MultithreadThing(); 
//        MultithreadThing myThing2 = new MultithreadThing(); 

        

        // Create object of type thread  5 times 
        for(int i =1; i <= 5;++i)
        {
            MultithreadThing myThing = new MultithreadThing(i); 
            Thread t = new Thread(myThing);
            t.start();
        }
                throw new java.lang.RuntimeException(); 

      
        // All threads run at same time completely indepedent an exception that 
        // Occurs will only effect the program in that thread
        
        
        // The code is not exceuted in sequential order 
        // But excuted in different threads with its own variables, main method 
        // Own stack space and Dram etc 
    
    }
    
}
