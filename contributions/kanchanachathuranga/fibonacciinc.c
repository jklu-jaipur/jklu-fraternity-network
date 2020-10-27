#include <stdio.h>
int main() {
    int i, n, x = 0, y = 1, z;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("Fibonacci Series: ");

    for (i = 1; i <= n; ++i) {
        printf("%d, ", x);
        z = x + y;
        x = y;
        y = z;
    }

    return 0;
}