package Collectionpackage;

import java.io.Serializable;

public  class Employee implements Serializable{
	
	int empid;
	String empname;
public Employee(int empid,String empname)
{
	this.empid=empid;
	this.empname=empname;
}

//public int compareTo(Object o) {
//	Employee e=(Employee)o;
//	if(empid==(e.empid))
//	{
//		return 0;
//	}
//	else if(empid>e.empid)
//	{
//		return 1;
//	}
//	else
//	{
//		return -1;
//	}
//@Override
//	public int compareTo(Employee e) {
//	//Employee e=(Employee)o;        
//		
//		return empname.compareTo(e.empname);
//}


}
