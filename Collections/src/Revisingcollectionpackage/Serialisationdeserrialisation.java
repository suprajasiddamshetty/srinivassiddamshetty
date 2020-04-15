package Revisingcollectionpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Revisingcollectionpackage.Employeeclass;

public class Serialisationdeserrialisation {
	
	void serialisation() throws IOException
	{
		FileOutputStream fis=new FileOutputStream("supraja.txt");
		ObjectOutputStream ois=new ObjectOutputStream(fis);
		ois.writeObject(new Employeeclass(1,"s1"));
		ois.writeObject(new Student(2,"s2"));
		ois.close();
		fis.close();
	}
	void deserialisation() throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("supraja.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		//Student s1=(Student)ois.readObject();
		Employeeclass e3=(Employeeclass)ois.readObject();
		Student s1=(Student)ois.readObject();
		System.out.println(e3.eid+" "+e3.ename);
		System.out.println(s1.sid+" "+s1.sname);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Serialisationdeserrialisation s=new Serialisationdeserrialisation();
		s.serialisation();
		s.deserialisation();
		
	

	}

}
class Student implements Serializable
{transient int sid;
String sname;
Student(int sid,String sname)
{
	this.sid=sid;
	this.sname=sname;
}
}
