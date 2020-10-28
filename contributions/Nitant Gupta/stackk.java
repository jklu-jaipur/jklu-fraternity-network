import java.util.Scanner;

public class Stackkkkkk {
	private static int top=-1;
	private static int max=15;
	private static int[] stk=new int[max];
	
	
	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer queue ");
        int size = scan.nextInt();
        top= size-1 ;
        
        System.out.print("Enter the stack elements\n");
        for(int i=0;i<size;i++) {System.out.println("element "+(i+1)+" - ");   stk[i]=scan.nextInt(); }
        
        char ch;
        do{
            System.out.println("\n Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. no of element in stack");
            System.out.println("7. Traversal");
            int choice = scan.nextInt();
           switch (choice)
            {
            case 1 : 
            	System.out.println("Enter integer element to puch in stack");
                push(scan.nextInt());
                break;                         
            case 2 : 
            	System.out.println("element popped - "+stk[top]);
            	pop();

                break;                         
            case 3 :
            	peek();            	
                break;                         
            case 4 :
            	boolean a=(top==-1)?true:false;
                System.out.println("Empty status = " +a);
                break;                
            case 5 :
            	boolean b=(top==max)?true:false;
                System.out.println("Full status = " +b);
                break;                 
            case 6 : 
                System.out.println("Size = "+top );
                break;
            case 7 :
            	traverse();
            	break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
                     
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0); 
 
        } while (ch == 'Y'|| ch == 'y');                 
    }
	private static void traverse() {
		if(top==-1) {System.out.print("Underflow");}
		else {
		
			int i=0;
			while(i<=top) {
				System.out.print(stk[i] + " " );
				i++;
			}
		}		
	}
	private static void push(int num) {
		if(top==max-1) {System.out.print("Overflow");}
		else {
			if(top+1==max) {
				System.out.print("Overflow");
			}
			else {
				top+=1;
				stk[top]=num;
			}
		}	
	}
	private static void pop() {
		if(top==-1) {System.out.print("Underflow");}
		else {
			
			top=top-1;
			
		}
		
	}
	private static void peek() {
		if(top==-1)System.out.print("Underflow");
		else {
        	System.out.println("Peek Element = "+stk[0]);
		}
	}

}
//implementation of stack using array
