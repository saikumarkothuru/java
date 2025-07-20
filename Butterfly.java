import java.util.Scanner;
 class Butterfly {
 static void Butterfly(int n)
{
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--)
    {
        for( int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++)
        {
            System.err.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
            System.out.println();

        }
    }
    public static void main(String []args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter n value :");
    int a=sc.nextInt();
     
    Butterfly(a);

sc.close();
}}

