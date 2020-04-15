package Collectionprograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class duplicatecharactersinastringusinghashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method1 Finding duplicate characters in a string
		String s="My name is supraja siddamshetty";
	//	String s1[]=s.split("");
//		for(int i=0;i<s.length();i++)
//		{
//			if(s1[i]!=null)
//			{
//				int count=1;
//			
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(s1[i].equals(s1[j]))
//				{
//					count++;
//					s1[j]=null;
//					
//				}}
//				if(count>1)
//				{
//					System.out.println(s1[i]+" "+count+"times");
//				}
//			}
//		
//		}
		//Method2 using hashmap
		HashMap<Character,Integer>h=new HashMap<Character,Integer>();
		char[] ch=s.toCharArray();
		for(Character ch1:ch)
		{
			if(h.containsKey(ch1))
			{
				h.put(ch1, h.get(ch1)+1);
			}
			else
			{
				h.put(ch1, 1);
			}
		}
	
		Set<Entry<Character, Integer>>s1=h.entrySet();
		for(Entry<Character,Integer>s2:s1)
		{
			if(s2.getValue()>1)
			{
				System.out.println(s2.getKey()+" "+s2.getValue());
			}
		}
		
		
		

	
	}
}
