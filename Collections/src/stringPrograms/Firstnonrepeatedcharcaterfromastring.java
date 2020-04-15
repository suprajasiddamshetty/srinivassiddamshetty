package stringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Firstnonrepeatedcharcaterfromastring {

	public static void main(String[] args) {
		String s="supraja";
		//using string
		char s2[]=s.toCharArray();
//		for(int i=0;i<s.length();i++)
//		// TODO Auto-generated method stub
//		{
//			if(s2[i]!=null)
//			{
//			int count=1;
//			
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(s2[i].equals(s2[j]))
//				{
//					count++;
//					s2[j]=null;
//				}
//			}
//			if(count==1)
//			{
//				System.out.println(s2[i]);
//				break;
//			}
//		}
//
//	}
		//using hashmap
		HashMap<Character,Integer>h=new HashMap<Character,Integer>();
		for(char cc:s2)
		{
			if(h.containsKey(cc))
			{
			h.put(cc,h.get(cc)+1);
			}
			else
			{
				h.put(cc,1);
			}
		}
		Set<Entry<Character,Integer>>h1=h.entrySet();
		System.out.println(h);
		
		for(Entry<Character,Integer>h2:h1)
		{
			if(h2.getValue()==1)
			{
				System.out.println(h2.getKey());
				break;
				
			}
		}

}
}
