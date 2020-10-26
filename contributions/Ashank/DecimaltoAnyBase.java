import java.util.*;

public class DecimaltoAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int exp = 0;
        int val = 0;
        
        while (n > 0) {
            int rem = n % b;
            val += rem * Math.pow(10,exp);
            exp++;
            n = n / b;
        }
        
        return val;
    }
}

//Input       
//57
//2

//Output
//111001
