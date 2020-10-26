/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;
import java.util.Scanner;
/**
 *
 * @author shrey
 */
public class Menu_normal {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Queue Test\n");
        System.out.println("Enter size of Queue ");
        int n = input.nextInt();
        int que[] = new int[n];
        int f=-1,r=-1;
        int max=n-1;
        char ch;
        do{
            System.out.println("\n Queue Operations");
            System.out.println("1. Inque");
            System.out.println("2. Deque");
            System.out.println("3. Peek");
            System.out.println("4. Traversal");
            System.out.println("5. No of element in queue");
            int choice = input.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter the element to be inserted = ");
                    int val=input.nextInt();
                    if(r==max-1)
                    {System.out.println("Overflow");}
                    else if(f==-1 && r==-1)
                    {f=0;r=0;
                    System.out.println("Enter the element to be inserted = ");
                    que[r]=val;
                    }
                    else{
                        r=r+1;
                        que[r]=val;
                    }
                    break;
                case 2 :
                    int ele;
                    if(f==-1 && r==-1)
                    {
                        System.out.println("Underflow");
                        
                    }  
                    else if(f==r)
                    {System.out.println("Deleted Successfully "+que[f]);
                        f=-1;
                        r=-1;
                    }
                    else
                    {
                    System.out.println("Deleted Successfully "+que[f]);
                       f=f+1; 
                    }
                    break;
                case 3 :
                    System.out.println("Peek ="+que[f]);
                    break;
                case 4 :
                    System.out.println("Traversal = ");
                    if(f==-1 && r==-1)
                    {System.out.println("Underflow");}
                    int t=f;
                    while(t<=r)
                    {
                        System.out.println(que[t]+" ");
                        t++;
                    }
                    break;
                case 5 :
                    System.out.print("Size = ");
                    if(f==-1 && r==-1)
                    {
                       System.out.println("0"); 
                    }
                    else
                    {
                       System.out.println(r+1); 
                    }
                    break;
                
                default :
                    System.out.println("Wrong entry \n ");
                                                 
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = input.next().charAt(0);
            
        } while (ch == 'Y' || ch == 'y');    
    }

    
}
