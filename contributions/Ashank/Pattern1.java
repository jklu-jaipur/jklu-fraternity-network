//program for the following pattern : 
//*	  *	  *	  *	  *	
//*	  *	  *	  *	
//*	  *	  *	
//*	  *	
//*	

import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int stars = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            stars--;
            System.out.println();
        }

    }
}
