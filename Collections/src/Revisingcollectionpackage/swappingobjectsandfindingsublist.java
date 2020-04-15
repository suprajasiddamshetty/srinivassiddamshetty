package Revisingcollectionpackage;

import java.util.ArrayList;
import java.util.Collections;

public class swappingobjectsandfindingsublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employeeclass>a=new ArrayList<Employeeclass>();
	a.add(new Employeeclass(1,"s1"));
	a.add(new Employeeclass(2,"s2"));
	a.add(new Employeeclass(3,"s3"));
	a.add(new Employeeclass(4,"s4"));
	ArrayList<Employeeclass>a1=new ArrayList<Employeeclass>(a.subList(0, 3));
	for(Employeeclass ee:a)
	{
		System.out.println(ee.eid+" "+ee.ename);
	}
	Collections.swap(a1, 2, 1);
	for(Employeeclass ee:a1)
	{
		System.out.println(ee.eid+" "+ee.ename);
	}
	


	
		

	}

}
