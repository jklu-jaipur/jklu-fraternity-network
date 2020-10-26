import java.util.*;

public class AnyBasetoDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int exp = 0;
        int val = 0;
        
        while (n > 0) {
            int rem = n % 10;
            val += rem * Math.pow(b,exp);
            exp++;
            n = n / 10;
        }
        
        return val;
    }
}

//Input
//111001
//2

//Output
//57
