#include<iostream>
using namespace std;
int main(){
	int n, i, j, temp;
	cout<<"Enter total number of elements:";
	cin>>n;
	int arr[n];
	cout<<"Enter the array elements:";
	for(i=0; i<n; i++){
		cin>>arr[i];
	}
	for(i=0; i<(n-1); i++){
		for(j=0; j<(n-i-1); j++){
			if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	cout<<"\nArray elements after Bubble Sorting:\n";
	for(i=0; i<n; i++){
		cout<<arr[i]<<" ";
	}
	return 0;
}
