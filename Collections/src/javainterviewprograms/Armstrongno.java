package javainterviewprograms;

import java.util.ArrayList;

public class Armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=123;
//		int temp=n;
//		int n1 ;
//		System.out.println(n);
//		int rem=0;
//		while(temp>0)
//		{
//			n1=temp%10;
//			temp=temp/10;
//			rem=rem+(n1*n1*n1);
//			
//			
//		}
//		System.out.println("hhhhh");
//		System.out.println(rem);
//		System.out.println(n);
		
//		int a[]= {153,370,371,555,333,153};
//		for(int i=0;i<a.length;i++)
//		{
//			int n=a[i];
//			int temp=n;
//			int rem=0;
//			int n1;
//			while(temp>0)
//			{
//				n1=temp%10;
//				temp=temp/10;
//				rem=rem+(n1*n1*n1);
//				
//			}
//			if(n==rem)
//			{
//				System.out.println(n+" is an armstrong number");
//				
//			}
//		}
//		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(153);
		al.add(111);
		al.add(371);
		al.add(333);
		al.add(371);
		al.add(370);
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			int n=al.get(i);
			int temp=n;
			
			int n1;
			int rem=0;
			while(temp>0)
			{
				n1=temp%10;
				temp=temp/10;
				rem=rem+(n1*n1*n1);
			}
			if(n==rem)
			{
				System.out.println(n+"is an armstrong number");
			}
		}
		
		

	}

}
