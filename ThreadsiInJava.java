class A implements Runnable
{
       // run method name is fix here 
    @Override
    public void run() // this method in javathreads is special method that defines the code to be executed by a thread. we cannot use method name by us 
    {
        for(int i=0;i<=5;i++)
            {
                System.out.println(" first");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
            
                    e.printStackTrace();
                }
            }
    }
}
class B  implements Runnable
    {
    
    @Override
    public void run()
        {
        for(int j=0;j<=5;j++)
            {
            System.out.println(" second ");
            try {
                Thread.sleep(3);// we are using sleep method to give rest (means not to exceute for 6 milli seconds) 
            } catch (InterruptedException e) {
            
                e.printStackTrace();
            }
            }
        }
    }
public class ThreadsiInJava 
{
    public static void main (String []args)
    {
        Runnable obj1= new A(); 
        Runnable obj2=new B();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

        
    }
}
