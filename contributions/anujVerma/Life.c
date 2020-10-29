
#include <stdio.h>

int main(){
	long long int i=0;
    long long int arr[100000];
    
  		while(arr[i-1]!=42)
  		{
  			scanf("%d \n",&arr[i]);
  			i++;		
		}
  
i=0;
while(arr[i]!=42)
{
	printf("%d \n",arr[i]);
	i++;
}

    
return 0;
}

