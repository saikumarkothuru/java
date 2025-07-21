class A 
    {
        void show()
            {
                System.out.println(" in parent class A");
            }
    }
class B extends A
    {
        void run()
        {
            System.out.println(" in class B");
        }

    }
class C extends B
    {   void scan()
        {
            System.out.println(" in class C");
        }
    }
public class Inheritance
        {
            public static void main (String []args)
            {
                C obj=new C();
                obj.scan();
                obj.run();
                obj.show();

            }
        }