#include <iostream> 
#include <string> 
using namespace std;
void isPalindrome(char str[]) 
{
	int l = 0; 
	int h = strlen(str) - 1; 

	while (h > l) 
	{ 
		if (str[l++] != str[h--]) 
		{ 
			cout << "Not a Palindrome"; 
			return; 
		} 
	} 
	cout << "Palindrome"; 
	return;
} 


int main() 
{ 
	cin >> x;
	cout << isPalindrome(x); 
	return 0; 
}
