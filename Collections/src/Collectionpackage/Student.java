package Collectionpackage;

import java.beans.Transient;
import java.io.Serializable;

public class Student implements Serializable {
	
	int stdid;
	transient String stdname;
	
	public Student(int stdid, String stdname)
	{
		this.stdid=stdid;
		this.stdname=stdname;
	}

}
