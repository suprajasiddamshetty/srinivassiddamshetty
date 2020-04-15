package Collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class wordrepeatedcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to new world baby hope to have an amazing world to you baby";
		String s1[]=s.split(" ");
		HashMap<String,Integer> repeatedcount =new HashMap<String,Integer>();
		for(String ss:s1)
		{
			if(repeatedcount.containsKey(ss))
			{
				repeatedcount.put(ss,repeatedcount.get(ss)+1);
			}
			else
			{
				repeatedcount.put(ss, 1);
			}
		}
		Set<Entry<String, Integer>>finallist=repeatedcount.entrySet();
		for(Entry<String,Integer>ee:finallist)
		{
			if(ee.getValue()>1)
			{
				System.out.println(ee.getKey()+" "+ee.getValue());
			}
		}
		
	}
}


