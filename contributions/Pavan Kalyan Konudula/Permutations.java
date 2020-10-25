
/*
   Program to print all Possible Permutations of given String

   Ex : ABC

    ABC
    ACB
    BAC
    BCA
    CBA
    CAB

    are possible Permutations
*/


import java.util.*;
import java.io.*;

public class Permutations {
    
    static void per(String s,int left,int right)
    {
        if(left==s.length()-1)
        {
            System.out.println(s);
            return;
        }
        
        if(left<right)
        s=s.substring(0,left)+s.substring(right,right+1)+s.substring(left+1,right)+s.substring(left,left+1)+s.substring(right+1,s.length());
        
        left=left+1;
        for(int i=left;i<=s.length()-1;i++)
        {
            per(s,left,i);
        }
        
    }
    
	public static void main (String[] args)throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter String to print all possible Permutaions");
        
		String s=br.readLine();
        
        System.out.println("Possible Permutations are ");
        
		per(s,-1,-1);
			
    }
}

/*
  
  Contributed by
   
    Pavan Kalyan Konudula

*/