package Class_Codes;
import java.util.*;
public class Stack_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ip=new Scanner (System.in);
		System.out.println("Enter size of stack");
		int size=ip.nextInt();
		char ch;
		
		int stack[]=new int[size];
		int top=-1;
		
		 do{
	            System.out.println("\n Stack Operations");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peep");
	            System.out.println("4. check empty");
	            System.out.println("5. check full");
	            System.out.println("6. no of element in stack");
	            System.out.println("7. Traversal");
	            
	            int choice=ip.nextInt();
	            switch(choice) {
	            
	            case 1 : 
	                System.out.println("Enter integer element to enque");
	                int push_element=ip.nextInt();
	                if (top==size-1)
	                {
	                	System.out.println("Stack overflow.");
	                }
	                else if (top==-1)
	                {
	                	top+=1;
	                	stack[top]=push_element;
	                			
	                }
	                else
	                {
	                	top+=1;
	                	stack[top]=push_element;
	                }
	              
	                                    
	                break;                         
	            case 2 : 
	                if (top==-1)
	                {
	                	System.out.println("Stack underflow.");
	                }
	                else
	                {
	                	top-=1;
	                	System.out.print("Poped element = "+stack[top]);
	                }
	                
	              
	                break;
	            case 3:
	            	if (top==-1)
	            	{
	            		System.out.println("Stack underflow. " );	
	            	}
	            	else
	            	{
	            		System.out.println("Peep element= "+stack[top] );
	            	}
	                
	            case 4 : 
	            	if (top==-1)
	            	{
	            		System.out.println("Stack is empty. " );	
	            	}
	            	else
	            	{
	            		System.out.println("Stack is not empty. " );
	            	}
	                
	                break;                
	            case 5 :
	            	if (top==size-1)
	            	{
	            		System.out.println("Stack overflow." );
	            	}
	            	else
	            	{
	            		System.out.println("Stack is not full. " );
	            	}
	                
	                break;                 
	            case 6 : 
	               
	            
	            		System.out.println("Size = "+ (top+1) );	
	            	
	                break;                         
	            case 7:
	            	if (top==-1)
	            	{
	            		System.out.println("Queue is empty, nothing to traverse. " );
	            	}
	            	else 
	            	{
	            		for(int i=top;i>=0;i--)
	            		{
	            			System.out.println(stack[i]);
	            		}
	            	
	            	}
	            	break;
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;
	            
	            }
	            
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = ip.next().charAt(0); 
	 
	        } while (ch == 'Y'|| ch == 'y'); 
	ip.close();}
}
