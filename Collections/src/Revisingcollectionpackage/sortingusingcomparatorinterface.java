package Revisingcollectionpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class sortingusingcomparatorinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employeeclass> a1=new ArrayList<Employeeclass>();
		a1.add(new Employeeclass(1,"sopraja1"));
		a1.add(new Employeeclass(3,"soujanya3"));
		a1.add(new Employeeclass(4,"soujanya4"));
		a1.add(new Employeeclass(5,"soujanya5"));
		a1.add(new Employeeclass(2,"soujanya2"));
		Collections.sort(a1,new Comparatorempname());
		Iterator<Employeeclass> itr=a1.iterator();
		while(itr.hasNext())
		{
			Employeeclass e=itr.next();
			System.out.println(e.eid+" "+e.ename);
		}
		

	}

}
