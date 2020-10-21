#include <bits/stdc++.h>
using namespace std;
int main()
{
	int rows;
	cin>>rows;
	for(int i=rows-1;i>=0;i--)
	{
		for(int j=0;j<i;j++)
		{
			cout<<" ";
		}
		
		for(int j=0;j<(rows-i);j++)
		{
			cout<<"* ";
		}
		cout<<endl;
	}

return 0;
}

/*

Input
4
Output
   *
  * *
 * * *
* * * *

*/
