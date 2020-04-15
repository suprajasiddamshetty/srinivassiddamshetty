package Collectionpackage;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;

public class Removedatausingiterator {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("s1");
		a1.add("s2");
		a1.add("s3");
		a1.add("s4");
		a1.add("s5");
		Iterator<String>i=a1.iterator();
		while(i.hasNext())
		{
			String s=i.next();
			if(s.equals("s3"))
			{
				i.remove();
			}
		}
		System.out.println(a1);
		
		ArrayList<Employee> a2=new ArrayList<Employee>();
		a2.add(new Employee(1,"s1"));
		a2.add(new Employee(2,"s2"));
		a2.add(new Employee(3,"s3"));
		a2.add(new Employee(4,"s4"));
		Iterator<Employee>i1=a2.iterator();
		while(i1.hasNext())
		{
			Employee e1=i1.next();
			if(e1.empname.equals("s1"))
			{
				i1.remove();
			}
		}
		for(Employee e2:a2)
		{
		
		System.out.println(e2.empid+" "+e2.empname);
		}
		
		
		

	}

}
