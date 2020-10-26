/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author saumy
 */
public class menuLinearQueue {
    static int front = -1, rear = -1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Queue Test\n");
        System.out.println("Enter size of integer stack ");
        int n = scan.nextInt();
        int Que[] = new int[n];
        
        char ch;
        do{
            System.out.println("\n Queue Operations");
            System.out.println("1. enque");
            System.out.println("2. deque");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. no of element in queue");
            System.out.println("7. Traversal");
            int choice = scan.nextInt();
            
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter the element to be inserted = ");
                    int val = scan.nextInt();
                    if( rear == (n-1) )
                    {
                        System.out.println("Overflow \nProgram Terminated");
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    else if ( front == -1 && rear == -1)
                    {
                        front = 0;
                        rear = 0;
                        Que[rear] = val;
                        Que[front] = val;                        
                        System.out.print("Enque element = ");
                        System.out.println(val);
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    else
                    {
                        rear = rear + 1;
                        Que[rear] = val;
                        System.out.print("Enque element = ");
                        System.out.println(val);
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    break;
                case 2 :                   
                    int ele ;
                    if( front == -1 && rear == -1)
                    {
                        System.out.println("Underflow \nProgram Terminated");
                        
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    else if ( front == rear )
                    {
                        ele = Que[front];
                        front = -1;
                        rear = -1;
                        System.out.print("Deque element = ");
                        System.out.println(ele);
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    else
                    {
                        ele = Que[front];
                        front = front + 1;
                        System.out.print("Deque element = ");
                        System.out.println(ele);
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    break;
                case 3 :                   
                    System.out.print("Peek element = ");
                    System.out.println(Que[front]);
                    System.out.println("front : "+front +" rear : "+rear);
                    break;
                case 4 :
                    if( front == -1 && rear == -1)
                    {
                        System.out.print("Empty status = ");                       
                        System.out.println("Underflow \nProgram Terminated");
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    else if( front <= rear )
                    {
                        System.out.print("Empty status = ");                       
                        System.out.println("Queue is not empty ");
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    break;
                case 5 :
                    if( rear == (n-1) )
                    {
                        System.out.print("Full status = ");
                        System.out.println("Overflow \nProgram Terminated");
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    else if( rear < (n-1) && rear > -1)
                    {
                        System.out.print("Full status = ");
                        System.out.println("Queue is not full ");
                        System.out.println("front : "+front +" rear : "+rear);
                    }
                    break;
                case 6 :
                    System.out.print("Size = ");
                    if(front == -1 && rear == -1)
                    {
                       System.out.println("0"); 
                    }
                    else
                    {
                       System.out.println(rear-front+1); 
                    }
                    break;
                case 7 :
                    System.out.println("Traversal = ");
                    if(front == -1 && rear == -1)
                    {
                       System.out.println("There are no elememts in the queue to traverse."); 
                    }
                    else
                    {
                       for(int i = front; i<=rear; i++)
                        {
                            System.out.println(Que[i]);
                        }
                    }
                    break;
                default :
                    System.out.println("Wrong entry \n ");
                    break;                                      
            }
            /* display stack */
            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
            
        } while (ch == 'Y' || ch == 'y');
    }    
}
