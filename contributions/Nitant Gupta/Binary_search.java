import java.util.Scanner;

public class Binary_search {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the length of array - ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter a sorted array");
		
		for (int i=0;i<n;i++) {
			System.out.print("Element "+i+" - ");
			ar[i]=s.nextInt();
		}
		System.out.print("Search for - ");
		int num=s.nextInt();
		
		int f= 0; int l= n-1;
		int mid =(f+l)/2;
		boolean b=false;
		
		while(f<=l) {
			if(ar[mid]<num) {
				f=mid+1;
				
			}
			else {
				if(ar[mid]>num) {
					l=mid-1;
				}else {
					if(ar[mid]==num) {
						System.out.print("Element found AT position - "+mid);
						b=true;
						break;
					}
				}
			}
			mid=(f+l)/2;
			
			
		}
		if(b==false) System.out.print("Element not found!");
		
		
		
		
	}

}
