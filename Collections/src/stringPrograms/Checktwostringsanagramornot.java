package stringPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class Checktwostringsanagramornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1
		
		String s="suprajab";
		String s1="suprajac";
		char ch1[]=s.toCharArray();
		char ch2[]=s1.toCharArray();
		char temp,temp1;
		
		//Method1
		
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(ch1[i]>ch1[j])
//				{
//					
//					temp=ch1[i];
//					ch1[i]=ch1[j];
//					ch1[j]=temp;
//				}
//			}
//		}
//		for(int i=0;i<s1.length();i++)
//		{
//			for(int j=i+1;j<s1.length();j++)
//			{
//				if(ch2[i]>ch2[j])
//				{
//					
//					temp=ch2[i];
//					ch2[i]=ch2[j];
//					ch2[j]=temp;
//				}
//			}
//		}
//		
//		if(s1.valueOf(ch1).equals(s1.valueOf(ch2)))
//		{
//			System.out.println("Anagrams");
//		}
//		
		
		//Method2
		
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=0;j<s1.length();j++)
//			{
//				if(s.charAt(i)==s1.charAt(j))
//				{
//					s1=s1.substring(0,j)+s1.substring(j+1);
//					break;
//				}
//			}
//		}
//		if(s1.length()==0)
//{
//	System.out.println("anagrams");
//}
		//Method3
		
		HashMap<Character,Integer>h=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(h.containsKey(s.charAt(i)))
			{
				h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}
			else
			{
				h.put(s.charAt(i), 1);
			}
		}
		for(int i=0;i<s1.length();i++)
		{
			if(h.containsKey(s1.charAt(i)))
			{
				if(h.get(s1.charAt(i))==1)
				{
					
					h.remove(s1.charAt(i));
				}
				else
				{
					char ch77=s1.charAt(i);
					h.put(ch77, h.get(ch77)-1);
				}}
			else
			{
				h.put(s1.charAt(i), 1);
			}
			
		}
		System.out.println(h.size());
			if(h.size()==0)
			{
				System.out.println("Anagram");
			}
		
		
	}
	}

	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	