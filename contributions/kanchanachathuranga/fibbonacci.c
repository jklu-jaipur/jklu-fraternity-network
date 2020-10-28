#include<stdio.h>  
int fibonacci(int);  
void main ()  
{  
    int n,f;  
    printf("Enter the value?");  
    scanf("%d",&n);  
    f = fibonacci(n);  
    printf("%d",f);  
}  
int fibonacci (int n)  
{  
    if (n==0)  
    {  
    return 0;  
    }  
    else if (n == 1)  
    {  
        return 1;   
    }  
    else  
    {  
        return fibonacci(n-1)+fibonacci(n-2);  
    }  
}  