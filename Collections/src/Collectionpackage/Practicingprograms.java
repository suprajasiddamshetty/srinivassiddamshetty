package Collectionpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Practicingprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numberlist=new ArrayList<Integer>();
		System.out.println("Enter the numbers that you want to deal with");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("the value of n:"+n);
		for(int i=1;i<=n;i++)
		{
			System.out.println("give me a nimber");
		  int n1=sc.nextInt();
		  numberlist.add(n1);
		}
		System.out.println(numberlist);
		for(int i=0;i<numberlist.size();i++)
		{
			int count=0;
			for(int j=2;j<numberlist.get(i);j++)
			{
				if (numberlist.get(i)%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(numberlist.get(i)+" ");
			}
		}
		
		
			
		}

	}


