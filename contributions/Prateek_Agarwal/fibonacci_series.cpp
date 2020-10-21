#include<iostream>
using namespace std;
void fib(int n) {
   int f[n];
   int i;
   f[0] = 0;
   f[1] = 1;
   for (i = 2; i < n; i++) {
      f[i] = f[i-1] + f[i-2];
   }
   for (i = 0; i < n; i++) {
      cout<<f[i]<<" ";
   }
}
int main () {
   int n;
   cout<<"Enter no. of terms: ";
   cin>>n;
   fib(n);
return 0;
}

/*

Input
Enter no. of terms: 15

Output
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

*/
