 //I LOVE MY CODES 3000 TIMES 
//NEVER GIVE UP
//WHATEVER IT TAKES
#include<bits/stdc++.h>
using namespace std ;
#define ll long long int 
#define loop(i,a,b) for(i=a;i<b;i++) 
#define Rloop(i,a,b) for(i=a;i>=b;i--)
#define AVENGERS ios_base::sync_with_stdio(false);cin.tie(NULL);
#define INFINITYWAR ll t;cin>> t;while(t--)
#define mod 1000000007
#define gcd(a,b) __gcd(a,b)
#define pb push_back
#define sub(b,c) substr(b,c)
#define sorted(a,n) is_sorted(a,a+n)
//YOU ARE IN ENDGAME NOW,DISPLAY YOUR CODE HERE

int main(){
AVENGERS
ll n;
cin >> n;
ll k=n;
ll p=0;
while(k>0){
p=p*10+k%10;
k=k/10;
}
if(p==n)
cout << "YES THE NUMBER IS PALINDROME"<< endl;
else
cout << "NO THE NUMBER IS NOT PALINDROME" << endl;
return 0;
}
