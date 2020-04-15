package Revisingcollectionpackage;

import java.io.Serializable;

public class Employeeclass implements Serializable,Comparable<Employeeclass>{
	
	public int eid;
	public String ename;
	public Employeeclass(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	
	@Override
	public int compareTo(Employeeclass o) {
		// TODO Auto-generated method stub
		return o.ename.compareTo(ename);
	}

	

	
	}





