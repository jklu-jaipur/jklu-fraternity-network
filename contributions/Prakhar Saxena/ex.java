import java.util.Scanner;
public class ex {
    public static void main(String[]args){
        Scanner ip=new Scanner(System.in);
        int a=ip.nextInt();
        int c=a;
        int b=0;
        int sum=0;
        for(int x=2;x*x<a;x++){
            if(a%x==0){
                b=x;
                System.out.println(x);
                break;
            }
        }
        while(c!=0){
            sum+=c%10;
            c=c/10;
        }
        System.out.println(Math.pow(sum,b));
    }
}

