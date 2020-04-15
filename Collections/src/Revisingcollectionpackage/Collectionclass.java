package Revisingcollectionpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Collectionclass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Employeeclass>al=new ArrayList<Employeeclass>();
Employeeclass e=new Employeeclass(1,"supraja");
al.add(e);
	al.add(new Employeeclass(1,"soujanya"));
	//	al.add(10);
		//al.add(10.5f);
	for(Employeeclass ee:al)
	{
	System.out.println(ee.eid+" "+ee.ename);
	}
		
//		for(Object o:al)
//		{
//			if(o instanceof Integer)
//			{
//				System.out.println(o);
//			}
//			if(o instanceof Float)
//			{
//				System.out.println(o);
//			}
//			if(o instanceof Employeeclass)
//			{
//				Employeeclass e1=(Employeeclass)o;
//				System.out.println(e1.eid+" "+e1.ename);
//			}
//		}
		
//		HashSet<Employeeclass> h1=new HashSet<Employeeclass>();
////		HashSet<String>h2=new HashSet<String>();
////		h2.add("s2");
////		h2.add("h1");
////		h2.add("h1");
////		h2.add("s2");
//		h1.add(new Employeeclass(1,"s1"));
//		h1.add(new Employeeclass(4,"s4"));
//		h1.add(new Employeeclass(4,"s2"));
//		for(Employeeclass ee:h1)
//		{
//			System.out.println(ee.eid+" "+ee.ename);
//		}
//	String s="supraja siddamshetty supraja hhh";
//	String s1[]=s.split(" ");
//	LinkedHashSet<String> l=new LinkedHashSet<String>(Arrays.asList(s1));
//	System.out.println(l);
	TreeSet t1=new TreeSet();
	t1.add(1);
	t1.add("s1");
	t1.add(null);
	System.out.println(t1);

	}

}
