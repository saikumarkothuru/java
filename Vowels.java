import java.util.Scanner;
public class Vowels{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a string : ");
        String s=sc.nextLine().toLowerCase().replaceAll("\\s","");
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
             count++;
            }
        }
        System.out.println("No of vowels in the given string "+count);
        System.out.println("No of consonats in the given string :"+((s.length())-count) );


    }
}
