import java.util.Scanner;

class Fibo {

  void fib(int n) {
    int f[] = new int[n + 1];
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i <= n; i++) f[i] = f[i - 1] + f[i - 2];
    for (int i = 0; i < n; i++) {
      System.out.println((i + 1) + " --> " + f[i]);
    }
  }

  public static void main(String[] args) {
    Fibo f = new Fibo();
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of fibonacci numbers you need: ");
    int n = scan.nextInt();

    f.fib(n);
  }
}
