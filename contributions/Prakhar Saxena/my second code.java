package Assignment1;
import java.util.*;

public class ques_2 {

	public static void main(String[] args) {
	Scanner	ques2 = new Scanner(System.in);
	System.out.println("Enter 4 numbers: ");
	int a = ques2.nextInt();
	int b = ques2.nextInt();
	int c = ques2.nextInt();
	int p = ques2.nextInt();
	int f= a*(p*p)+ b*p + c;
	System.out.print("The calculated answer is: "+f);

	}

}
