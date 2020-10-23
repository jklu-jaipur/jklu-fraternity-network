#include <stdio.h>
void fullpyramidofStars(int rows){
      int i, blank, k = 0;
   for (i = 1; i <= rows; ++i, k = 0) {
      for (blank = 1; blank <= rows - i; ++blank) {
         printf("  ");
      }
      while (k != 2 * i - 1) {
         printf("* ");
         ++k;
      }
      printf("\n");
   }
}
void FullPyramidOfNumbers(int rows)
{
    int i, space,  k = 0, count = 0, count1 = 0;
    for (i = 1; i <= rows; ++i) {
      for (space = 1; space <= rows - i; ++space) {
         printf("  ");
         ++count;
      }
      while (k != 2 * i - 1) {
         if (count <= rows - 1) {
            printf("%d ", i + k);
            ++count;
         } else {
            ++count1;
            printf("%d ", (i + k - 2 * count1));
         }
         ++k;
      }
      count1 = count = k = 0;
      printf("\n");
   }
}
void InvertedPyramidofStars(int rows)
{
    int  i, j, space;
   for (i = rows; i >= 1; --i) {
      for (space = 0; space < rows - i; ++space)
         printf("  ");
      for (j = i; j <= 2 * i - 1; ++j)
         printf("* ");
      for (j = 0; j < i - 1; ++j)
         printf("* ");
      printf("\n");
   }
}
void HalfPyramidofStars(int rows)
{
    int i, j;
   for (i = 1; i <= rows; ++i) {
      for (j = 1; j <= i; ++j) {
         printf("* ");
      }
      printf("\n");
   }
}
int main() {
   int  rows,choice =0;
   printf("Enter the number of rows: ");
   scanf("%d", &rows);
   printf("List of Patterns this program can print ");
   printf("\n1)Full Pyramid of stars \n2)Full Pyramid of Numbers");
   printf("\n3)Inverted Pyramid of stars \n4)Half Pyramid of Stars\n");
   printf("5)Quit program ");
   printf("\nEnter your choice no(1-5) from list below:\n");
   scanf("%d", &choice);
   switch(choice)
   {
       case 1: fullpyramidofStars(rows);break;
       case 2: FullPyramidOfNumbers(rows);break;
       case 3: InvertedPyramidofStars(rows);break;
       case 4: HalfPyramidofStars(rows);break;
       case 5: printf("Quiting\n");return 0;
       default: printf("wrong choice"); break;
   }
   return 0;
}
/* Output looks like below:
Enter the number of rows: 5
List of Patterns this program can print 
1)Full Pyramid of stars 
2)Full Pyramid of Numbers
3)Inverted Pyramid of stars 
4)Half Pyramid of Stars
5)Quit program 
Enter your choice no(1-5) from list below:
1
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 


*/