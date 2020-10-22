//Implementing Stacks using array
//using a menu-driven program
#include<stdlib.h>
#define MAX 10   //defining size of stack

int stack[MAX] , top = -1;
void push(int st[], int value);  //push value into stack
int pop(int st[]);  //pop element from stack
int peek(int st[]); //returns top element in stack
void display(int st[]); //displays stack

int main()
{
    int value,choice,popped,peeked;
    do
    {
        printf("\n1) Push");
        printf("\n2) Pop");
        printf("\n3) Peek");
        printf("\n4) Display");
        printf("\n5) Exit");
        printf("\nEnter your choice : ");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
            printf("\nEnter value to push : ");
            scanf("%d",&value);
            push(stack,value);
            break;
        case 2:
            popped = pop(stack);
            if(popped != -1)
                printf("%d is popped",popped);
            break;
        case 3:
            peeked = peek(stack);
            if(peeked != -1)
                printf("%d is at the top of stack",peeked);
            break;
        case 4:
            display(stack);
            break;
        }
    }while(choice != 5);
    return 0;
}

void push(int st[],int value)
{
    if(top == MAX - 1)
    {
        printf("\nStack is full");
    }
    else
    {
        top++;
        st[top] = value;
    }
}

int pop(int st[])
{
    int popped;
    if(top == -1)
    {
        printf("\nStack is empty.");
    }
    else
    {
        popped = st[top];
        top--;
        return popped;
    }
}

int peek(int st[])
{
    if(top == -1)
    {
        printf("\nStack is Empty");
    }
    else
    {
        int peeked = st[top];
        return peeked;
    }
}

void display(int st[])
{
    int i;
    if(top == -1)
    {
        printf("\nStack is Empty.");
    }
    else
    {
        for(i = top; i>=0; i--)
        {
            printf("\n%d",st[i]);
        }
    }
}
