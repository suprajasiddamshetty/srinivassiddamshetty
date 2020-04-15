package Collectionpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysToCollection {

	public static void main(String[] args) {
        //Arrays To Collection
		
//		String s[]= {"supraja","a","b","c"};
//		ArrayList<String> s1=new ArrayList<String>(Arrays.asList(s));
//		s1.add("d");
//		System.out.println(s1);
//		
		//Generic collections To Arrays
//		ArrayList<String> a1=new ArrayList<String>();
//		a1.add("s1");
//		a1.add("s4");
//
//		a1.add("s2");
//
//		a1.add("s3");
//		String s[]=new String[a1.size()];
//		a1.toArray(s);
//		for(String ss:s)
//		{
//		System.out.println(ss);
//		}
		
		

		
		
//		ArrayList<String> a1=new ArrayList<String>();
//		a1.add("10");
//		a1.add("20");
//		a1.add("30");
//		String a[]=new String[a1.size()];
//		
//		a1.toArray(a);
//		for(String ss:a)
//		{
//		System.out.println(ss);
//		}
//		
//		//Normal version of collections to Arrays
//		ArrayList a2=new ArrayList();
//		a2.add("ratan");
//		a2.add(10);
//		Object[] oo=a2.toArray();
//		for(Object o:oo)
//		{
//			System.out.println(o);
//		}
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(10.5);
		a1.add("a1");
		a1.add(new Employee(1,"s1"));
		Object o[]=a1.toArray();
		for(Object oo:o)
		{
			if(oo instanceof Integer)
			{
			System.out.println(oo);
			}
			if(oo instanceof String)
			{
				System.out.println(oo);

			}
			if(oo instanceof Double)
			{
				System.out.println(oo);

			}
			if(oo instanceof Employee)
			{
				Employee e=(Employee)oo;
				System.out.println(e.empid+" "+e.empname);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
