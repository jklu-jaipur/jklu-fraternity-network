package javaapplication187;
import java.util.Scanner;


class bubble{
    int A[];
    int m;
    public bubble(int A[],int n){
        this.A=A;
        m=n;
    }
    public void work(){
        for(int i=0;i<m-1;i++){
            for(int j=0;j<m-1;j++){
                if(A[j]>A[j+1]){
                int temp=A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
            }
            }
            
        }
}
    public void print(){
        for(int i=0;i<m;i++){
            System.out.println(A[i]);
        }
    }
}
public class bubble_sort {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []A=new int[n];
        for (int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        bubble bub=new bubble(A,n);
        bub.work();
        bub.print();
 }
   }
