package Collectionpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HahMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>h1=new HashMap<Integer,String>();
		
		h1.put(1, "s1");
		h1.put(2, "s2");
		h1.put(3, "s3");
		System.out.println(h1);
		Set<Integer> s1=h1.keySet();
		System.out.println(s1);
		Collection<String>c1=h1.values();
		System.out.println(c1);
		Collection<Entry<Integer,String>> ee=h1.entrySet();
		for(Entry e:ee)
		{System.out.println(e.getKey()+" "+e.getValue());
		}
		}
		

	}


