package stringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubstringfromgivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="SuprajaSiddamshetty";
		int length=0;
		String substring=null;
		HashMap<Character,Integer>h=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!h.containsKey(s.charAt(i)))
			{
				h.put(s.charAt(i), i);
			}
			else
			{
				i=h.get(s.charAt(i));
				h.clear();
			}
			if(h.size()>length)
			{
				length=h.size();
				substring =h.keySet().toString();
			}
		}
	
	System.out.println(substring);
	}

}

