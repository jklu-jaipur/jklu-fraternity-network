
//String Palindrome Checker

import java.io.*;

public class Palindrome
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a String to check for Palindrome");

        String input=br.readLine();  //reading input

        int left=0;
        int right=input.length()-1;

        int flag=0;   //set to 1 for not valid palindrome string and 0 for valid palindrome string

        //using two pointer approach to check for palindrome
        while(left<right)
        {
            if(input.charAt(left)!=input.charAt(right))
                {
                    flag++;
                    break;
                }
            
            left++;
            right--;

        }

        if(flag==1)
            System.out.println(input + " is not a Palindrome string.");
        
        else
            System.out.println(input + " is Palindrome string.");
        

    }
}

/*

    Contributed by
    
                Pavan Kalyan Konudula

*/