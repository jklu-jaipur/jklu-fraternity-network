import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int num, x = 0, y = 0, z = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the last count for the series:");
        num = scan.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= num; i++)
        {
            x = y;
            y = z;
            z = x + y;
            System.out.print(x+" ");
        }
    }
}