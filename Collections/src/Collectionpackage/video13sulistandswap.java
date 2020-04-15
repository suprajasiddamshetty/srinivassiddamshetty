package Collectionpackage;

import java.util.ArrayList;
import java.util.Collections;

public class video13sulistandswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("20");
		a.add(30);
		a.add("supraja");
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(new Employee(1,"supraja"));
		System.out.println(a);
		Collections.swap(a, 3, 2);
		System.out.println(a);
		ArrayList<Integer>a1=new ArrayList<Integer>(a.subList(1,9));
		for(Object o:a1)
		{
			if(o instanceof Employee)
			{
				Employee e1=(Employee)o;
				System.out.println(e1.empid+" "+e1.empname);
			}
			if(o instanceof Integer)
			{
				System.out.println(o);
			}
		}
		

		

	}

}
