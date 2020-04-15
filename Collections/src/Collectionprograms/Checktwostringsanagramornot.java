package Collectionprograms;

import java.util.Arrays;
import java.util.Collections;

public class Checktwostringsanagramornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="seem";
		char ch1[]=s.toCharArray();
		String s1="mees";
		char ch2[]=s1.toCharArray();
		if(s.length()!=s1.length())
		{
			System.out.println("false");
		}
		else
		{
//			Arrays.sort(ch1);
//			Arrays.sort(ch2);
//			System.out.println(s.valueOf(ch1)+" "+s.valueOf(ch2));
//			if(s.valueOf(ch1).equals(s.valueOf(ch2)));
//			{
//				System.out.println("s is anagram of s1");
//			}
			
				char temp,temp1;
				for(int i=0;i<s.length();i++)
				{
					for(int j=i+1;j<s.length();j++ )
					{
						if(ch1[i]>ch1[j])
						{
							temp=ch1[i];
							ch1[i]=ch1[j];
							ch1[j]=temp;
						}
					}
				}
				System.out.println(s.valueOf(ch1));
				for(int i=0;i<s.length();i++)
				{
					for(int j=i+1;j<s.length();j++ )
					{
						if(ch2[i]>ch2[j])
						{
							temp=ch2[i];
							ch2[i]=ch2[j];
							ch2[j]=temp;
						}
					}
				}
				System.out.println(s.valueOf(ch2));
}
		if(s.valueOf(s).equals(s.valueOf(s1)))
		{
			System.out.println("anagram");
		}
	}
}


