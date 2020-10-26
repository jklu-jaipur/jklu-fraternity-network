package Class_Codes;

import java.util.Scanner;

public class Array_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=ip.nextInt();
		int array[]= new int[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<size;i++)
		{
			array[i]=ip.nextInt();
		}
		char ch;
		do {
			System.out.println("Enter element for search");
			int element=ip.nextInt();
			
			int beg=0;
			int end=size-1;
			int mid=(beg+end)/2;
			boolean flag=false;
			while(beg<=end)
			{
				if(element>array[mid])
				{
					beg=mid+1;
				}
				else if (element==array[mid])
				{
					flag=true;
					System.out.println("Element found at position= "+ (mid+1));
					break;
				}
				else
				{
					end=mid-1;
				}
				
				mid=(beg+end)/2;
			}
			if (!flag)
			{
				System.out.println("Elemnt not found!!");
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = ip.next().charAt(0); 
	}while (ch == 'Y'|| ch == 'y');

	ip.close();}
}
