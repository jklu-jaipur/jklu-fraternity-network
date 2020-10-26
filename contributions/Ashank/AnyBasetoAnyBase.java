import java.util.*;

public class AnyBasetoAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        
        int n1 = anyBasetoDecimal(n,sourceBase);
        int n2 = DecimaltoanyBase(n1,destBase);
        
        System.out.print(n2);
    }
    
    public static int anyBasetoDecimal(int n, int b) {
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
    
    public static int DecimaltoanyBase(int n, int b) {
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
//111001
//2
//3

//Output
//2010
