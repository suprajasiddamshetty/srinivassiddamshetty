package Revisingcollectionpackage;

import java.util.Comparator;
import java.util.TreeSet;

public class Fruit {
	
	
			public static void main(String[] args)
			{ TreeSet t = new TreeSet(new MyComp());
			t.add("srinivas");
			t.add(new StringBuffer("soujanya"));
			t.add("lavanya");
			System.out.println(t);
			}
			}
			class MyComp implements Comparator
			{ 
				public int compare(Object s1,Object s2)
				{
					String a1=s1.toString();
					String a2=s2.toString();
			 return a1.compareTo(a2); //[apple, bananna, orange]
			//return -s1.compareTo(s2); //[orange, bananna, apple]
			}
			}
	
