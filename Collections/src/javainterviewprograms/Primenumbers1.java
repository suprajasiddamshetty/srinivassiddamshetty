package javainterviewprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Primenumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=15;
//		int count=0;
//		for(int i=2;i<a;i++)
//		{
//			if(a%i==0) {
//				count++;
//			}
//		}
//		if(count==0)
//		{
//			System.out.println("palindrome");
//		}
		//using arrays
		
//		int a[]= {2,5,6,7,8,11,12,13};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			int count=0;
//			for(int j=2;j<a[i];j++)
//			{
//				if(a[i]%j==0)
//				{
//					count++;
//				}
//			}
//				if(count==0)
//				{
//					System.out.println(a[i]+"is a palindrome");
//				}
//		}
		//Using Collections
		ArrayList<Integer>al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum no. of digits");
		int n=sc.nextInt();
		System.out.println("Give me a number");
		for(int i=1;i<=n;i++)
		//while(sc.hasNextInt())
		{
			int n1=sc.nextInt();
			al.add(n1);
		}
		ArrayList<Integer>a2=new ArrayList<Integer>();
		System.out.println(al);
		for(int j=0;j<al.size();j++)
		{
			
			int count=0;
			for(int k=2;k<al.get(j);k++)
			{
				if((al.get(j))%k==0)
{
	count++;
}
			}
			if(count==0)
			{
				a2.add(al.get(j));
			}
		}
		
		System.out.println(a2);

	}

}
