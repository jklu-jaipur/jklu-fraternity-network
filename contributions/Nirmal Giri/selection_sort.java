package selection_sort;
import java.util.Scanner;

class select{
    
    int A[];
    int m;
    public select(int A[],int n){
        this.A=A;
        m=n;
    }
    public void sort(){
        int min=0;
        for(int i=0;i<m-1;i++){
            int temp=i;
            for(int j=i+1;j<m;j++){
                if(A[j]<A[temp]){
                    temp=j;
                  }
                int temp1=A[temp];
                A[temp]=A[i];
                A[i]=temp1;
                         }
          }
    }
    public void print(){
        for(int i=0;i<m;i++){
        System.out.println(A[i]);
    }
    
    }
}


public class Selection_sort {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        select se=new select(A,n);
        se.sort();
        se.print();
    }
}
