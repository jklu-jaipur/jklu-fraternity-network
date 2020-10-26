package Assignment1;
import java.util.*;
public class ques_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ques12 = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a,b,c,d,e;
		a = ques12.nextInt();
		System.out.print("Enter 2nd number: ");
		b= ques12.nextInt();
		c= b%10;
		d = c + a ;
		e= b- c;
		System.out.print("Product is: "+(d*e));
	}

}
