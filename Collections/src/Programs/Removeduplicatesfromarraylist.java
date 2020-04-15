package Programs;

import java.util.ArrayList;

import java.util.LinkedHashSet;

public class Removeduplicatesfromarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1:
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("s1");
		s1.add("s2");
		s1.add("s3");
		s1.add("s4");
		s1.add("s1");
		System.out.println(s1);
		LinkedHashSet<String> h1=new LinkedHashSet<String>();
		h1.addAll(s1);
		s1.clear();
		s1.addAll(h1);
		System.out.println(h1);
		
		
		//Method 2
		ArrayList<String> s2=new ArrayList<String>();
		s2.add("s1");
		s2.add("s2");
		s2.add("s3");
		s2.add("s4");
		s2.add("s1");
		System.out.println(s2);
		ArrayList<String> s3=new ArrayList<String>();
		for(String s:s2)
		{
			if(!s3.contains(s))
			{
				s3.add(s);
			}
		}
		System.out.println(s3);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
