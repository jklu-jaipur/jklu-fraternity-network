package Class_Codes;

import java.util.Scanner;

public class Infix_Prefix_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Infix expression");
		String inexp=ip.nextLine();
		char stack[]=new char[50];
		int top=-1;
		String preexp="";
		for(int i=inexp.length()-1;i>=0;i--)       //testing each character 
		{
		
			char test=inexp.charAt(i);
			if (test=='('||test==')')      
			{
				
				
				
				if (test==')')
				{
					
					top+=1;
					stack[top]=test;          //putting in stack
					preexp+=test;        //also in expression at the same time
				}
				else                     //checking if close bracket is there
				{
					
					int j=top;
					while(j>=0)           //Iterating through stack to check for pairing open bracket
					{
						
						
						if (stack[j]==')')     //entering condition if bracket found 
						{
							
							for(int k=top;k>=j+1;k--)        //emptying stack before bracket
							{
								preexp+=stack[k];
							}
							top=j-1;       //top back to major stack discarding substack made by bracket
							preexp+=test;     //adding closing bracket
							break;   //breaking while loop
							
						}
							
						j--;
					}
				}
				
			}
			else if (test=='$'||test=='^')
			{ 
				
				
				top+=1;
				stack[top]=test;
				
			}
			else if(test=='*'||test=='/')           
			{
				if (top!=-1) {
				
				
			 if (stack[top]=='$' ||stack[top]=='^')       //checking if higher president is already present
				{
				
					preexp+=stack[top];
					stack[top]=test;
				}
				else
				{
				
					top+=1;
					stack[top]=test;
				}}
				else       //else for empty stack condition
				{
					
					top+=1;
					stack[top]=test;
				}
				
				
			}
			else if(test=='+'||test=='-')
			{
				if (top!=-1) {
					
				
				 if (stack[top]=='$'||stack[top]=='^' || stack[top]=='*' ||stack[top]=='/')        //if higher president is present
				{
					
					preexp+=stack[top];
					stack[top]=test;
				}
			
				else
				{
				
					top+=1;
					stack[top]=test;
				}}
				else
				{
					top+=1;
					stack[top]=test;
				}
				
				
			}
			else      //else for empty stack condition
			{
			
				preexp+=test;
			}
		
		
		}
		
		for(int f=top;f>=0;f--)        //emptying remaining stack
		{
			preexp+=stack[f];
		}
		StringBuffer sbr = new StringBuffer(preexp);
		sbr.reverse();
		System.out.println(sbr);      //postfix expression complete
	ip.close();

	}

}
