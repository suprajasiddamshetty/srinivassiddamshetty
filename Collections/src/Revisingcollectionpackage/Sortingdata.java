package Revisingcollectionpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Sortingdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		
		//Wrapper class data sorting
		al.add("supraja");
		al.add("soujanya");
		al.add("srinivas");
		al.add("lavanya");
		al.add("siddamshetty");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		//User defined data sorting
		ArrayList<Employeeclass> a2=new ArrayList<Employeeclass>();
		a2.add(new Employeeclass(2,"supraja2"));
		a2.add(new Employeeclass(3,"supraja3"));
		a2.add(new Employeeclass(1,"supraja1"));
		a2.add(new Employeeclass(0,"supraja0"));
		a2.add(new Employeeclass(5,"siddamshetty"));
		//Collections.sort(a2,Collections.reverseOrder());
		Collections.sort(a2);
		ListIterator<Employeeclass>li=a2.listIterator();
		while(li.hasNext())
		{
			Employeeclass e2=li.next();
			System.out.println(e2.eid+" "+e2.ename);
		}
		
		

	}

}
