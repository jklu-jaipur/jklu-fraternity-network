package Assignment1;
import java.util.*;

public class ques_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ques1 = new Scanner(System.in);
		System.out.print("Enter a number1: ");
		
		int a =ques1.nextInt();
		System.out.print("Enter a number2:");
		int b = ques1.nextInt();
		 int c = (a*a)+(b*b*b);
		 System.out.print((a*a)+" + "+(b*b*b)+" = "+c);

	}

}
