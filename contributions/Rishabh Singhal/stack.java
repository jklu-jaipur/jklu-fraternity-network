package stack;
import java.util.Scanner;
class arrays{
    protected int[]array;
    protected int top,size,temp;
    public arrays(int n){
        size = n ;
        top = -1;
        array = new int[size];
        
    }
    public void push(int num){
        if(top == size-1)
   System.out.println("overflow");
        else{
            top=top+1;
            array[top]=num;
        }
    }
    public void pop()       {
        if(top ==-1){
   System.out.println("underflow");
       
        }
        else{
             temp=array[top];
              System.out.println("item delted"+temp);
            top=top-1;
           
            }
        }
     public void peep()       {
        if(top ==-1)
   System.out.println("underflow");
        else{
             System.out.println(array[top]);
            }
     }
      public void overflow()       {
        if(top ==-1)
   System.out.println("overflow");
      
      else
    System.out.println("not overflow");
}
       public void underflow()       {
        if(top ==-1)
   System.out.println("underflow");
         else
    System.out.println("not underflow");
       }
         public void display()       {
        if(top ==-1)
   System.out.println("underflow");
        else{
            for(int i=top;i>=0;i--){
              System.out.println(array[i]);
            }
        }
        
    }
            
            }
public class Stack {
    public static void main(String[] args) {
        char ch;
       Scanner sc = new Scanner(System.in);
       System.out.println("Size of stack");
       int n = sc.nextInt();
        arrays s = new arrays(n);
       do{
          System.out.println("1.push \n"+"2.pop \n"+"3.display \n"+"4.peep \n"+"5.overflow check \n"+"6.underflow check");
         int choice = sc.nextInt();
         switch(choice){
             case 1:
             System.out.println("push operation input a number");
             int x= sc.nextInt();
             s.push(x);
             break;
             case 2:
             System.out.println("pop operation");
             s.pop();
             break;
              case 3:
             System.out.println("display operation");
             s.display();
             break;
              case 4:
             System.out.println("peep operation");
             s.peep();
             break;
              case 5:
             System.out.println("overflow check");
             s.overflow();
             break;
             case 6:
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



