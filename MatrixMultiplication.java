import java.util.*;
public class MatrixMultiplication{
    public static void main (String []args)
            {
        Scanner sc= new Scanner(System.in);
            System.out.print("Enter the size of m:");
            int m= sc.nextInt();
            System.out.print(" Enter the size of n:");
            int n=sc.nextInt();
            int [][] arr1=new int[m][n];
            
            for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(" Enter element to insert at position["+i+"]"+"["+j+"]:");
                        int a=sc.nextInt();
                        arr1[i][j]=a;
                    }
                    System.out.println();
                }
            for(int[]rows:arr1)
                {
                    for(int elements:rows)
                        {
                            System.out.print(elements+" ");
                        }
                        System.out.println();
                }

             System.out.print("Enter the size of o:");
            int o= sc.nextInt();
            System.out.print(" Enter the size of p:");
            int p=sc.nextInt();
            int [][] arr2=new int[o][p];

             for(int i=0;i<o;i++)
                {
                
                    for(int j=0;j<p;j++)
                        {
                            System.out.print(" Enter element to insert at position["+i+"]"+"["+j+"]:");
                            int a2=sc.nextInt();
                            arr2[i][j]=a2;
                        }
                        System.out.println();
                }
            for(int[]rows:arr2)
                {
                    for(int elements:rows)
                        {
                            System.out.print(elements+" ");
                        }
                        System.out.println();
            }
            int [][] result=new int[m][p];
            if(n==o){
                System.out.println("Multiplication of matrix is possible ");
                System.out.println("resultant matrix will be "+m+"X"+p);
                for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<p;j++)
                
                            {
                            result[i][j]=0;
                            for(int k=0;k<n;k++)
                            {
                                result[i][j]+=arr1[i][k]*arr2[k][j];
                            }
                            
                            } 
                    
                    }
                    
            }
            else{
                System.out.print("multiplication of matrix is not possible due to the order of the matrix ");
            }
            for(int []rows:result)
            {
                for(int element:rows)
                {
                    System.out.print(element+" ");
                }
                System.out.println();
            }
            sc.close();
    }
}

