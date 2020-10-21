//program for the following pattern : 
//          *
//       * * *
//     * * * * *
//   * * * * * * *

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();   
        for(int i = 0; i <= n; i+=2) {
            for(int j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" " + "*");
            }
            System.out.println();
        }      
    }
    
}

//Input : 7
//Output : 
//          *
//       * * *
//     * * * * *
//   * * * * * * *

//Input : 10
//Output : 
//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *
//  * * * * * * * * * * *
