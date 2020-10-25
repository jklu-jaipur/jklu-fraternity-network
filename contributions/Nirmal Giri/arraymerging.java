/**
 * arraymerging
 */
import java.util.Scanner;

public class arraymerging {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter size 1st: ");
        int n = ip.nextInt();
        System.out.print("Enter size 2nd: ");
        int m=ip.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        System.out.print("Enter numbers: ");
        for (int i = 0; i < a.length ; i++) {
            a[i] = ip.nextInt();
        }
        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nEnter numbers: ");
        for (int i = 0; i < b.length ; i++) {
            b[i] = ip.nextInt();
        }
        System.out.print("Array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }

        int[] c = new int[n+m];
        int i=0;
        while (i<a.length) {
            c[i]=a[i];
            i++;
        }
        int j= c.length-a.length-1;
        int k=0;
        while (k<b.length) {
            c[j]=b[k];
            k++;
            j++;
        }

        System.out.print("New array: ");
        for (int j2 = 0; j2 < c.length; j2++) {
            System.out.print(c[j2]+" ");
        }

        ip.close();
    }
    
}
