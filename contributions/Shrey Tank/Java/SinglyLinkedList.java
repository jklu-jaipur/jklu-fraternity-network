package Linked_List;
/*
 *  Java Program to Implement Singly Linked List
 */
 import java.util.Scanner;
 
/*  Class Node  */
class node
{
    private int data;
    private node link;
 
    /*  Constructor  */
    public node()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public node(int d,node n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void SetLink(node n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void SetData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public node GetLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int GetData()
    {
        return data;
    }
}
 
/* Class linkedList */
class linkedList
{
    private node start;
   private node end ;
    public int size ;
 
    /*  Constructor  */
    public linkedList()
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
        node New_Node = new node(val, null);    
        size++ ;    
        if(start == null) 
        {
            start = New_Node;
            end = start;
        }
        else 
        {
            New_Node.SetLink(start);
            start = New_Node;
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtEnd(int val)
    {
        node New_Node = new node(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = New_Node;
            end = start;
        }
        else 
        {
            end.SetLink(New_Node);
            end = New_Node;
        }
    }
    /*  Function to insert an element at position  */
    public void insertAtPos(int val , int pos)
    {
        node New_Node = new node(val, null);                
        node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                node tmp = ptr.GetLink() ;
                ptr.SetLink(New_Node);
                New_Node.SetLink(tmp);
                break;
            }
            ptr = ptr.GetLink();
        }
        size++ ;
    }
    /*  Function to delete at Start  */
    public void deleteAtStart()
    {
    	start = start.GetLink();
        size--; 
        
    }
    /*  Function to delete at End  */
    public void deleteAtEnd()
    { node PTR = start;
    node PPTR = start;
    while (PTR != end)
    {
        PPTR = PTR;
        PTR = PTR.GetLink();
    }
    end = PPTR;
    end.SetLink(null);
    size --;
      
    }
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {        
        node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                node tmp = ptr.GetLink();
                tmp = tmp.GetLink();
                ptr.SetLink(tmp);
                break;
            }
            ptr = ptr.GetLink();
        }
        size-- ;
    }    
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
           
        }    
        else
        {node ptr = start;
        
        while (ptr != null)
        {
            System.out.print(ptr.GetData()+ "->");
            ptr = ptr.GetLink();
        }
        System.out.print( "\b\b \n");
    }
}
    }
 
/*  Class SinglyLinkedList  */
public class SinglyLinkedList
{    
    public static void main(String[] args)
    {             
        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        linkedList list = new linkedList(); 
        System.out.println("Singly Linked List Test\n");          
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
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtStart( scan.nextInt() );                     
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
        scan.close();  }
}

