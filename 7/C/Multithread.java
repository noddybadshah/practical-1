class MultithreadingDemo extends Thread
{
        String name;
        MultithreadingDemo(String n)
        {
            name = n;
            System.out.println("Creating: " + name);
        }
        public void run()
        {
            System.out.println("Running: " + name);
            try
            {
                for(int i = 4; i>0; i--)
                {
                    System.out.println("Thread: " + name + " " + i);
                    sleep(3000);
                }
            }
            catch(Exception e)
            {
                System.out.println("Exception is caught");
            }
            System.out.println("Thread " + name + " exiting");
        }
}

public class Multithread
{   
    public static void main(String[] args)throws InterruptedException
    {
        MultithreadingDemo child1 = new MultithreadingDemo("Child 1");
        child1.start();
        
        MultithreadingDemo child2 = new MultithreadingDemo("Child 2");
        child2.start();
    }
}