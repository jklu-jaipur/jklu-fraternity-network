package Assignment1;
import java.util.*;
public class ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ques10 = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a,b,c,d,e,f,g,h,i,j;
		a= ques10.nextInt();
		b= a%100;	
		c= a%1000;
		d = a-c;
		e = b%10;
		f = e*100;
		g = b/10;
		h = g*10;
		i = c/100;
		j= d+f+i+h;
		System.out.print("Number: "+j);
	}

}
