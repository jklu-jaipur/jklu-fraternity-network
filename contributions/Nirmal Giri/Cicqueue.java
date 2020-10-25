package Cicqueue;
import java.util.Scanner;
class arrays{
    protected int[]array;
    protected int size,temp,f, r;
    public arrays(int n){
        size = n ;
          n = -1;
        f=-1;
        r=-1;
        
        array = new int[size];
    }
    public void push(int num){
        if(r == size-1 && f==0 || r == f-1)
   System.out.println("overflow");
        else if (r == -1 && f==-1){
            r=0;
            f=0;
            array[r]=num;}
        else if(f!=0 && r== size-1){
            r=0;
            array[r]=num;
        }
       else {
            r=r+1;
            array[r]=num;               
        }
    }
    public void pop()       {
       if (r == -1 && f==-1){
   System.out.println("underflow");
        }
       else  if(f==r){
             temp=array[size];
              System.out.println("item delted"+temp);
            f=-1;
            r=-1;
            }
       else if(f==size-1){
           f=0;
       }
       else{
           f=f+1;
       }
    }
      public void overflow()       {
       if( r == size-1)
   System.out.println("overflow");
      else
    System.out.println("not overflow");
}
       public void underflow()       {
       if (r == -1 && f==-1){
   System.out.println("underflow");
        }
         else
    System.out.println("not underflow");
       }
         public void display()       {
         if (r == -1 && f==-1){
   System.out.println("underflow");
        }
         else if (r>f){
            for(int i=f;i<=r;i++){
              System.out.println(array[i]);
            }
         }
            else {
             for(int i=f;i<=size-1;i++){
                 System.out.println(array[i]);
             }
             for(int i=0;i<=r;i++){
                 System.out.println(array[i]);
             }
             }
         }
                    
                    
        
    }
            
public class Cicqueue {
    public static void main(String[] args) {
        char ch;
       Scanner sc = new Scanner(System.in);
       System.out.println("Size of queue");
       int n = sc.nextInt();
        arrays s = new arrays(n);
       do{
          System.out.println("1.Enqueue \n"+"2.Dequeue \n"+"3.display \n"+"4.overflow check \n"+"5.underflow check");
         int choice = sc.nextInt();
         switch(choice){
             case 1:
             System.out.println("Enqueue operation input a number");
             int x= sc.nextInt();
             s.push(x);
             break;
             case 2:
             System.out.println("Dequeue3"
                     + " operation");
             s.pop();
             break;
              case 3:
             System.out.println("display operation");
             s.display();
             break;
              
              case 4:
             System.out.println("overflow check");
             s.overflow();
             break;
             case 5:
             System.out.println("underflow check");
             s.underflow();
                     break;
             default:
                     System.out.println("invalid input");
                 }
         System.out.println("do you want to perform any operation(y/n)");
         ch= sc.next().charAt(0);
       }
       while(ch == 'y' || ch == 'Y');
         }
}



