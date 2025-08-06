
public class RunnableInterface
{
    public static void main (String []args)
    {
        Runnable obj1 =() ->
        {
            for(int i=1;i<=5;i++)
           {
            System.err.println("first");
            try {
                Thread.sleep(10);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           } 
        };
         Runnable obj2 =() ->
        {
            for(int i=1;i<=5;i++)
           {
            System.err.println("second");
            try {
                Thread.sleep(10);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           } 
        };

    
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

        
    }
}
