package Class_Codes;


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
    public int size ;
 
    /*  Constructor  */
    public linkedList()
    {
        start = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start==null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
     return size;
    }    
    /*  Function to insert an element at begining  */
    public void insertAtStart(int val)
    {
       node new_node= new node(val,null);
       
       if (start==null)
       {
           start=new_node;
       }
       else
       {
           new_node.SetLink(start);
           start=new_node;
       }
       size++;
        
    }
    /*  Function to insert an element at end  */
    public void insertAtEnd(int val)
    {
      node new_node= new node(val,null);
      
      if(start==null)
      {
      start=new_node;
      }
      else
      {
          node ptr=start;
      for(int i=1;i<size;i++)
      {
      ptr=ptr.GetLink();
      }
      ptr.SetLink(new_node);
      
      }
      size++;
    }
    /*  Function to insert an element at position  */
    public void insertAtPos(int val , int pos)
    {
       node new_node=new node(val,null);
        node ptr=start;
        for(int i=1;i<pos-1;i++)
       {
      ptr=ptr.GetLink();
       }
        new_node.SetLink(ptr.GetLink());
      ptr.SetLink(new_node);
       size++; 
    }
    /*  Function to delete at Start  */
    public void deleteAtStart()
    {
    	if(start==null)
        {
            System.out.println("Underflow.");
        }
        else
        {
        
        node ptr=start;
        start=start.GetLink();
        ptr.SetLink(null);
        size--;
        
        }
        
        
    }
    /*  Function to delete at End  */
    public void deleteAtEnd()
    { 
      if(start==null)
      {
            System.out.println("Underflow.");
      }
      else
      {
          node ptr=start;
          for(int i=1;i<size;i++)
          {
          ptr=ptr.GetLink();
          }
          ptr.SetLink(null);
          size--;
      }
      
    }
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {        
       node ptr=start;
       for(int i=1;i<pos-1;i++)
       {
           ptr=ptr.GetLink();
       }
       ptr.SetLink(ptr.GetLink().GetLink());
       size--;
    }    
    /*  Function to display elements  */
    public void display()
    {
        node ptr=start;
        for(int i=0;i<size;i++)
        {
            System.out.print(ptr.GetData()+"->");
            ptr=ptr.GetLink();
        }
        System.out.print("\b\b");
        System.out.println();
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

