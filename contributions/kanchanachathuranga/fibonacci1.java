import java.util.Scanner;

public class hacktoberfest {
    public static void main(String[] args) {
        Scanner inputnum = new Scanner(System.in);
        System.out.print("Enter the number of terms :");
        int n = inputnum.nextInt();

        int x = 0, y = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(x + " + ");
            int sum = x + y;
            x = y;
            y = sum; 
        }
    }
}