#include <stdio.h>
int main() {
    int n, revnum = 0, remaind, firstnum;
    printf("Enter Number: ");
    scanf("%d", &n);
    firstnum = n;

    while (n != 0) {
        remaind = n % 10;
        revnum  = revnum  * 10 + remaind;
        n /= 10;
    }

    if (firstnum == revnum )
        printf("%d is a palindrome.", firstnum);
    else
        printf("%d is not a palindrome.", firstnum);
    return 0;
}
