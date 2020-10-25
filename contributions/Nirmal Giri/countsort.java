package javaapplication61;
import java.util.Scanner;
public class countsort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
        //to find max element
        int max=a[0];
    for(int i=0;i<n;i++){
        if(a[i]>max)
        max=a[i];
    }
    System.out.println(max);
        int p=max+1;
    //create count array    
     
int b[]=new int[n]; 
int count[]=new int[p]; 
for (int i=0; i<p; i++) 
count[i]=0; 
for (int i=0; i<n; i++) 
count[a[i]]++; 
for (int i=1; i<=p-1; i++) 
count[i] += count[i-1]; 
for (int i = n-1; i>=0; i--) 
{ 
b[count[a[i]]-1] = a[i]; 
count[a[i]]--; 
} 
for (int i = 0; i<n; ++i) 
a[i] = b[i]; 

    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
  }
}
