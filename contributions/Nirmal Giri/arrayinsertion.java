import java.util.Scanner;

public class arrayinsertion {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n ,e , num, pos;

        System.out.print("Enter size: ");
        e = ip.nextInt();

        System.out.print("Enter number? ");
        n = ip.nextInt();

        int a[] = new int[e];

        int i=0;
        while (i<n) {
            a[i]=ip.nextInt();
            i++;
        }

        System.out.print("Array: ");
        int j=0;
        while (j<n) {
            System.out.print(a[j]+" ");
            j++;
        }

        System.out.print("\nEnter number: ");
        num = ip.nextInt();
        System.out.print("Enter position: ");
        pos = ip.nextInt();

        if (pos<=n) {
            for (int j2=n-1; j2>=pos; j2--) {
                a[j2+1]=a[j2];
            }
            a[pos]=num;
            n=n+1;
    
            System.out.print("\nNew Array: ");
            for (int j2 = 0; j2 < n; j2++) {
                System.out.print(a[j2]+" ");
            }
    
        } else {
            System.out.println("\nInvalid position");
        }
        
        ip.close();
    }
}
