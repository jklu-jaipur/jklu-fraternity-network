package javaapplication193;
import java.util.Scanner;

class insertionop{
    int []B;
    int m;
    public insertionop(int []A,int n){
        B=A;
        m=n;
    }
    public void sort(){
        for(int i=1;i<m;i++){
            int value=B[i];
            int hole=i;
            while(hole>0 && B[hole-1]>value){
                B[hole]=B[hole-1];
                hole=hole-1;
            }
            B[hole]=value;
        }
    }
    public void display(){
        for(int i=0;i<m;i++){
            System.out.println(B[i]);
        }
    }

}


public class insertion_sort {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        insertionop in=new insertionop(A,n);
        in.sort();
        in.display();
    }
    
}
