import java.util.Scanner;
public class circular_queue 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of queue: ");
		int size = sc.nextInt(), choice=0;
		queue_methods ob = new queue_methods(size);
		System.out.println("Menu:\n1. Push \n2. Pop \n3. Peep  \n4. Exit");
        System.out.print("\nEnter your choice (number): ");
        choice = sc.nextInt();
        while(choice != 4)
        {
            switch(choice)
            {
                case 1: System.out.print("Enter value: ");
                        int n= sc.nextInt();
                        ob.push(n);
                        ob.display();
                        break;
                case 2: ob.pop();
                		ob.display();
                        break;
                case 3: ob.peep();
                        break;
                default: System.out.println("Wrong choice");
                        break; 
            }
            System.out.print("\nEnter your choice (number): ");
            choice = sc.nextInt();
        }
	}
}

class queue_methods
{
	int arr[], front, rear, size;
	public queue_methods(int s)
	{
		size =s;
		arr = new int[size];
		front = -1;
		rear=-1;
	}
	public void push(int n)
	{
		if((rear == size-1 && front == 0) || (rear == front-1))
			System.out.println("**Queue is Overflowing**");
		if(rear == size-1 && front!=0)
		{
			rear=0;
			arr[rear]=n;
		}
		else
		{
			rear++;
			arr[rear] = n;
			System.out.println("--Item is pushed--");
		}
		if(rear == 0 && front == -1) //condition of first element getting pushed
			front = 0;
	}
	public void pop()
	{
		if(front == -1)
			System.out.println("**Underflow**");
		else if (front == rear)
		{
			front = rear = -1;
			System.out.println("---Item Popped---");
		}
        else if(front == size-1 && rear>=0)//element present at last position.
            front=0;
		else
		{
			System.out.println("---Item Popped---");
			front++;
		}
	}
	public void peep()
    {
        if(rear==-1)
            System.out.println("---Queue is Empty---");
        else
            System.out.println("-- Queue has following value on rear: --\n "+arr[rear]);
    }
	public void display()
    {
        if(rear == -1)
            System.out.println("---Queue is Empty---");
        else
        {
            System.out.println("Your Queue contains: ");
            if(rear>=front)
                for(int x= rear; x>=front; x--)
                    System.out.println(arr[x]);
            else
            {
            for(int x=rear; x>=0; x--)
                System.out.println(arr[x]);
            for(int x=front; x<size; x++)
            	System.out.println(arr[x]);
            }
        }
    }
}
