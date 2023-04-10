import java.io.*;
import java.util.*;

public class ThreadCycle extends Thread
{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("SYIT");
        System.out.println("After name change: " + 1); 
        System.out.println("Main thread priority: " + t.getPriority());
        t.setPriority (MAX_PRIORITY); 
        System.out.println("Main thread new priority: " + t.getPriority());
        
        try
        {
            for(int i=0; i < 5; i++)
            {
                t.sleep(3000);
                System.out.println("Main thread = " + i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        

        
        
    }
} 

 

