#include<iostream>
using namespace std;

void swap(int* a, int* b){
    int t = *a;
    *a = *b;
    *b = t;
}
int partition (int arr[], int low, int high){
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j <= high - 1; j++){
        if (arr[j] < pivot){
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    return (i + 1);
}
void quickSort(int arr[], int low, int high){
    if (low < high){
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
void print(int arr[], int n){
	for (int i = 0; i < n; i++)
		cout << arr[i] << " ";
}
int main(){
	int n;
	cout<<"Enter total number of array elements: ";
	cin >> n;
	int a[n];
	cout<<"Enter array elements: ";
	for(int i = 0; i < n; i++)
		cin >> a[i];
	cout<<"\nArray elements after Quick Sorting:\n";
	quickSort(a, 0, n - 1);
	print(a, n);
	return 0;
}
