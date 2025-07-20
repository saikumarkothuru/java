public class Array
    {
    public static void main(String[]args)
    {
        int [] a =new int[5];
        for(int i=0;i<a.length;i++)
        {
             a[i]=i;
            
        }
        for(int value:a)
        {
            System.out.print(value+" ");
        }
    }
    }
