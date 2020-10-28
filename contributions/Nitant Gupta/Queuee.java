import java.util.Scanner;

public class queueeeueue {
	private static int F=-1;
	private static int R=-1;
	private static int Max=10;
	private static int[] arr=new int[Max];
   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Queue Test\n");
        System.out.println("Enter Size of Integer queue ");
        int size = scan.nextInt();
        R=size-1;
        
        
        System.out.print("Enter the array elements\n");
        for(int i=0;i<size;i++) {System.out.println("element "+(i+1)+" - ");   arr[i]=scan.nextInt();}
        F=0;
        
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
            	System.out.println("Enter integer element to enque");
                enque(scan.nextInt());                    
                break;                         
            case 2 :                 
                deque();
                
                break;                         
            case 3 :
            	System.out.println("Peek Element = ");
                peek();
             
                break;                         
            case 4 : 
            	Boolean e=false;
            	if(R==Max-1) {e=true;}
                System.out.println("Empty status = "+e );
                
                break;              
            case 5 :
            	Boolean f=false;
            	if(R==Max) {f=true;}
                System.out.println("Full status = "+f );
                break;                 
            case 6 :
            	
                System.out.println("Size = "+((F==R)?"0":(R-F-1))); 
                break;
            case 7:
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
        scan.close();
    }
    private static void enque(int num) {
    	if(R==Max-1) { System.out.print("Overflow"); }
    	else {
    		if(F==R && F==-1) {F=R=0;}
    		else {
    			R=R+1;
    			
    		}
    		arr[R]=num;
    	}
    	
    	
    }
    private static void deque() {
    	if(F==R && F==-1) {System.out.print("Underflow");}
    	else{
    		if(F==R) F=R=-1;
    		else	F=F+1;
    		
    	}
    	
    }
    private static void peek() {
    	System.out.print(arr[F]);
    }
    private static void traverse() {
    	 if(F==R && F==-1) {
    		 System.out.print("Underflow");    		 
    	 }
    	 else {
    		 int i=F;
    		 while(i<=R) {
    			 System.out.print(arr[i]+"  ");
    			 i++;
    		 }
    		 
    	 }
    }


}
