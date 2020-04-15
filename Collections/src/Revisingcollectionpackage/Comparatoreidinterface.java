package Revisingcollectionpackage;

import java.util.Comparator;

public class Comparatoreidinterface implements Comparator<Employeeclass> {

	
	public int compare(Employeeclass e1,Employeeclass e2) {
		// TODO Auto-generated method stub
		if(e2.eid==e1.eid)
		{
			return 0;
		}
		else if(e2.eid>e1.eid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	

}
