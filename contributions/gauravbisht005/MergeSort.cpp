#include<iostream>
using namespace std;

void merge(int A[], int l, int m, int r){
	int i = 0;
	int j = 0;
	int k = l;
	int sizeOfRight = r - m;
	int sizeOfLeft = m - l + 1;
	int leftArray[sizeOfLeft];
	int rightArray[sizeOfRight];
	for(i; i < sizeOfLeft; i++){
		leftArray[i] = A[k];
		k++;
	}
	for(j; j < sizeOfRight; j++){
		rightArray[j] = A[k];
		k++;
	}
	i = 0;
	j = 0;
	k = l;
	while(i < sizeOfLeft && j < sizeOfRight){
		if(leftArray[i] <= rightArray[j]){
			A[k] = leftArray[i];
			i++;
			k++;
		}
		else{
			A[k] = rightArray[j];
			j++;
			k++;
		}
	}
	while(i < sizeOfLeft){
		A[k] = leftArray[i];
		i++;
		k++;
	}
	while(j < sizeOfRight){
		A[k] = rightArray[j];
		j++;
		k++;
	}
}
void mergeSort(int A[], int l, int r){
	int first = l;
	int last = r;
	if(first == last)
		return;
	else {
		int middle = (first + last) / 2;
		mergeSort(A,first, middle);
		mergeSort(A, middle + 1, last);
		merge(A, first, middle, last);
	}
}
int main(){
    cout << "Please enter the length (number of elements) of the input array: ";
	int n;
	cin >> n;
	if(n <= 0){
		cout << "Illegal input array length!" << endl;
		return 0;
	}
	int* A = new int [n];
	cout << "Please enter each element in the array" << endl;
	cout << "(each element must be an integer within the range of int type)." << endl;
	for(int i=0; i<n; i++){
		cout << "A[" << i << "] = ";
		cin >> A[i];
	}
    cout << "Given array A[] is: ";
	for(int i=0; i<n-1; i++)
		cout << A[i] << ",";
	cout << A[n-1] << endl;
    mergeSort(A, 0, n-1);
    cout << "After mergeSort, sorted array A[] is: ";
	for(int i=0; i<n-1; i++)
		cout << A[i] << ",";
	cout << A[n-1] << endl;
	delete [] A;
    return 0;
}
