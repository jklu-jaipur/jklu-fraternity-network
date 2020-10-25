/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quewlk;
import java.util.Scanner;
class node{
     protected int data;
    protected node link ;
    public node(){
        data =0;
        link = null;
    }
    public node(int n, node m){
        data =n;
        link = m;
    }
    void setdata(int val){
        data=val;
    }
     int getdata(){
      return  data;
    }
     void setlink(node a){
       link=a;
    }
    node getlink(){
      return link;
    } 
}
class arrays{
    protected int size,f,r;
     node start = null;
    public arrays(int n){
                size = n ;
          n = -1;
        f=-1;
        r=-1;

        
    }
    public void push(int val){
         node ptr;
        node nptr = new node(val,null);
            
        if(r == size-1)
   System.out.println("overflow");
        else if(r == -1 && f==-1){
            start= nptr;
            f=0;
            r=0;
        }
        else {nptr.setlink(start);
            start= nptr;
            r=r+1;
    }

        
    }
    public void pop()       {
        node ptr,pptr;
        
           if (r == -1 && f==-1){
   System.out.println("underflow");
        }
       else  if(f==r){
           start=start.getlink();
           f--;
       }
       
        else{
             start=start.getlink();
           f--;
           
            }
        }
    
      public void overflow()       {
       if(f==0 && r == size-1)
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
             node ptr;
         if (r == -1 && f==-1){
   System.out.println("underflow");
        }
        else{
            
           ptr=start;
          while(ptr.getlink()!=null){
         System.out.println(ptr.getdata());  
                ptr=ptr.getlink();     
            }
        System.out.println(ptr.getdata());
        }
        
    }
            
            }
public class Quewlk{
    public static void main(String[] args) {
        char ch;
       Scanner sc = new Scanner(System.in);
       System.out.println("Size of queue");
       int n = sc.nextInt();
        arrays s = new arrays(n);
       do{
          System.out.println("1.push \n"+"2.pop \n"+"3.display \n"+"4.overflow check \n"+"5.underflow check");
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



