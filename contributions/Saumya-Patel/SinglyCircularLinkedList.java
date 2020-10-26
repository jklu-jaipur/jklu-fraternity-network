/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author saumy
 */

class Node_lCS
{
    private int data;
    Node_lCS link;
 
    /*  Constructor  */
    public Node_lCS()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node_lCS(int d,Node_lCS n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void SetLink(Node_lCS n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void SetData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public Node_lCS GetLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int GetData()
    {
        return data;
    }
}

class CircularLinkedList
{
    private Node_lCS start;
    private Node_lCS end ;
    public int size ;
 
    /*  Constructor  */
    public CircularLinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }    
    /*  Function to insert an element at begining  */
    public void insertAtStart(int val)
    {
        Node_lCS New_Node = new Node_lCS(val, null);
        size++;
        if(start == null)
        {
            start = end = New_Node;
            start.SetLink(end); 
        }
        else
        {
            New_Node.SetLink(start);
            start = New_Node;
            end.SetLink(start);
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtEnd(int val)
    {
        Node_lCS New_Node = new Node_lCS(val, null);
        size++;
        if(start == null)
        {
            start = New_Node;
            end.SetLink(start); 
        }
        else
        {
            end.SetLink(New_Node);
            end = New_Node;
            end.SetLink(start);
        }
    }
    /*  Function to insert an element at position  */
    public void insertAtPos(int val , int pos)
    {
        Node_lCS New_Node = new Node_lCS(val, null);
        Node_lCS PTR = start;
        pos = pos - 1;
        for(int i = 1; i < size;i++)
        {
            if(i == pos)
            {
                Node_lCS tmp = PTR.GetLink();
                PTR.SetLink(New_Node);
                New_Node.SetLink(tmp);
                break;
                
            }
            PTR = PTR.GetLink();
        }
        size++;
    }
    /*  Function to delete at Start  */
    public void deleteAtStart()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            end.SetLink(start.GetLink());
            start = end.GetLink();
            size--;
        }            
    }
    /*  Function to delete at End  */
    public void deleteAtEnd()
    { 
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            if(start != end)
            {
                Node_lCS PTR = start;
                while(PTR.GetLink() != end)
                {
                     PTR = PTR.GetLink();
                }
                end = PTR;
                end.SetLink(start);      
            }
            else
            {
                start = end = null;
            }
        size--;
        }
    }
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {        
        Node_lCS PTR = start;
        pos = pos - 1;
        for(int i = 1; i < size;i++)
        {
            if(i == pos)
            {
                Node_lCS tmp = PTR.GetLink();
                Node_lCS temp = tmp.GetLink();
                PTR.SetLink(temp);
                break;
            }
            PTR = PTR.GetLink();           
        }    
        size--;        
    }    
    /*  Function to display elements  */
    public void display()
    {
        if(size == 0)
        {
            System.out.println("Empty\n");
        }
        else
        {
            Node_lCS PTR = start;
            do
            {
                System.out.print(PTR.GetData() + "->");
                PTR = PTR.GetLink();
            }while(PTR != start);
            System.out.println("\b\b \n");
        }
    }
}

public class SinglyCircularLinkedList {
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        CircularLinkedList list = new CircularLinkedList(); 
        System.out.println("Singly Circular Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at begining");
            System.out.println("5. delete at end");
            System.out.println("6. delete at position");
            System.out.println("7. check empty");
            System.out.println("8. get size");   
            System.out.println("\nEnter your choice:");
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                int val = scan.nextInt();
                list.insertAtStart(val);                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtEnd( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                
                if (pos <= 1 || pos >= list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break; 
            case 4 : 
            	list.deleteAtStart();
            	break;
            case 5 : 
                System.out.println("ok");
            	list.deleteAtEnd();
            	break;
            case 6 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p <= 1 || p >= list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 7 : 
                System.out.println("Empty status = "+ list.isEmpty());
                break;                   
            case 8 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.println("Do you want to continue (Type y or n)\n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
        scan.close(); 
    }
}   
