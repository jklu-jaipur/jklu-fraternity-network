import java.util.Scanner;
class arraystack
{
    int arr[];
    static int size, top;

    
    /*
    int pop_even()
    {
        int count=0;
        if(underflow())
            System.out.println("stack is empty");
        else
        {
            int counter=top;
            for(int i=top;i>=0;i--)
            {
                    counter--;
                    if(arr[i]%2==0)
                    {
                        for(int m=counter;m<top;m++)
                        {
                            arr[m]=arr[m+1];
                        }
                        arr[top]=0;
                        top--;
                        counter=0;
                    }
                        //pop();
            }
        }
        return(count);
    }*/
    int pop_even()
    {
        //int count=0;
        int z=0;
        if(underflow())
            System.out.println("stack is empty");
        else
        {
            int arr_temp[]=new int[size];
            //int temp_top=-1;
            
            for(int i=top;i>=0;i--)
            {

                if(arr[i]%2!=0)
                    {
                        arr_temp[z]=arr[i];
                        z++;
                    }
                
            }
            arr=null; 
            System.gc(); // requesting JVM for running Garbage Collector
            arr=arr_temp;
        }

        return(z);
    }

    arraystack stack_copy(arraystack z)
    {
        arraystack new_stack=z;
        return new_stack;
    }

    boolean overflow()
    {
        if(top==size-1)
            return true;
        else
            return false;
    }
    boolean underflow()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public  arraystack(int n)
    {
        size=n;
        arr=new int[size];
        top=-1;
    }
    public  arraystack()
    {
        arr=new int[0];
        top=-1;
    }
     int pop()
    {
        int data=0;
        if(underflow())
            System.out.println("stack is empty");
        else
        {
            data=arr[top];
            arr[top]=0;
            top--;   
        }
        return data;
    }
    public int peek()
    {
        int data;
        data=arr[top];
        return data;
    }
    void push(int a)
    {
        if(overflow())
            System.out.println("array overflow");
        else
        {
            top=top+1;
            arr[top]=a;
        }
    }
    void display()
    {
        if(underflow())
            System.out.println("array underflow");
        else
        {
            System.out.println("Current stack is :-");
            for(int i=top;i>=0;i--)
                System.out.println(arr[i]);
        }

    }




}


public class q5_q6{
    public static void main(String args[]){
        arraystack x=new arraystack(10);
        for(int i=0;i<10;i++)
             x.push(i);
             arraystack y=x.stack_copy(x);
             System.out.println("the copy of the previous stack");
             y.display();
             System.out.println("----------------------------------------\n \n");
             int pop_len=x.pop_even();
             System.out.println("the stack after removing the even elemnts in it");
             x.display();
             System.out.println("poped element"+pop_len);
             System.out.println("----------------------------------------\n \n");

    }
}