// Calculating Presum Of array
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);	
int n,i;
cout<<"ennter Size of Array: "<<endl;
cin>>n;

int* ar= new int[n];
int sum=0;
for(i=0;i<n;i++){
	int element;
	cin>>element;
	sum+=element;
	ar[i]=sum;
}

cout<<"Presum Array :"<<endl;
for(i=0;i<n;i++) cout<<ar[i]<<" ";

cout<<endl<<"Enter Range to find sum:"<<endl;
int l,r;
cin>>l>>r;
if(l<n && r<n){	
if(l==0) cout<<ar[r]<<endl;
else  cout<<ar[r]-ar[l-1];
}
else
  cout<<"Invalid Range: "<<endl;



return 0;	
}