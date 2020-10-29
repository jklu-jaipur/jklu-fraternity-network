#include<stdio.h>

int main()
{
	char s[100];
	int i,j[100],sum=0;
	scanf("%s",&s);
	for(i=0;s[i]!='\0';i++)
	{
		j[i]=s[i]-96;
		
		
	}
	
	
	for(i=0;s[i]!='\0';i++)
	{
		sum=sum+j[i];
	
	}
	printf("%d",sum);
		return 0;
}
