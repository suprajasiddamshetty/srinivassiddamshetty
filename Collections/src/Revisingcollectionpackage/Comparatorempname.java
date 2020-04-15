package Revisingcollectionpackage;

import java.util.Comparator;

public class Comparatorempname implements Comparator {
		public int compare(Object o1,Object o2)
		{
			Employeeclass e1=(Employeeclass)o1;
			Employeeclass e2=(Employeeclass)o2;
			return (e2.ename).compareTo(e1.ename);
		}
		

		

	}


