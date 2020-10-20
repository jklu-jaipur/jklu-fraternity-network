import java.util.Scanner;
public class q6_stack 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Size of stack: ");
        int s = sc.nextInt();    
        methods ob_methods = new methods(s);
        System.out.println("Menu:\n1. Push \n2. Pop \n3. Peep  \n4. Exit");
        System.out.print("\nEnter your choice (number): ");
        int choice = sc.nextInt();
        while(choice != 4)
        {
            switch(choice)
            {
                case 1: System.out.print("Enter value: ");
                        int n= sc.nextInt();
                        ob_methods.push(n);
                        ob_methods.display();
                        break;
                case 2: ob_methods.pop();
                		ob_methods.display();
                        break;
                case 3: ob_methods.peep();
                        break;
                default: System.out.println("Wrong choice");
                        break; 
            }
            System.out.print("\nEnter your choice (number): ");
            choice = sc.nextInt();
        }
    }
}

class methods
{
    protected int arr[], arr2[], top, size;
    public methods(int s)//constructor
    {
        size=s;
        arr = new int[size];
        arr2 = new int[size];
        top=-1;
    }
    public void push(int n)
    {
        if(top == size-1)
            System.out.println("--- Stack1 is Overflowing --- \n--- Stack1 is Overflowing ---");
        else
        {
            System.out.println("---Item Pushed---");
            top+=1;
            arr[top]=n;
            arr2[top]=n;
        }
    }
    public void pop()
    {
        if(top == -1)
            System.out.println("--- Stack1 is Underflowing --- \n--- Stack2 is Underflowing ---");
        else
            top-=1;
    }
    public void peep()
    {
        if(top==-1)
            System.out.println("---Stack1 is Empty--- \n---Stack2 is Empty---");
        else
        {
            System.out.println("-- Stack1 has following value on top: --\n "+arr[top]);
            System.out.println("-- Stack2 has following value on top: --\n "+arr2[top]);
        }
    }
    public void display()
    {
        if(top==-1)
            System.out.println("---Stack1 is Empty--- \n---Stack2 is Empty---");
        else
        {
            System.out.println("--- Stack1 contains: ---");
            for(int x=top; x>-1; x--)
                System.out.println(arr[x]);

            System.out.println("--- Stack2 contains: ---");
            for(int x=top; x>-1; x--)
                System.out.println(arr2[x]);
        }
    }
}
