import java.util.Scanner;
public class FindVowels{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        System.out.print(" Enter the string: ");
        String A=S.nextLine().toLowerCase().replaceAll("\\s","");
        System.out.println(A);
    
        String Vowels="aeiou";
        int Noofvowels=0;
        for(int i=0;i<Vowels.length();i++)
            {
                for(int j=0;j<A.length();j++)
                {
                    if(Vowels.charAt(i)==A.charAt(j))
                    {
                       Noofvowels++; 
                    }
                    
                }
            }
            System.out.println(" No of Vowels = "+ Noofvowels);
            System.out.println(" No of Consonats = " +(A.length()-Noofvowels));

          
    }

}
