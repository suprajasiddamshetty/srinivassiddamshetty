package Collectionpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializationanddeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList<>();
		a1.add(new Employee(1,"s1"));
		a1.add(new Employee(2,"s3"));
		a1.add(new Employee(3,"s0"));
		a1.add(new Student(1,"ss1"));
		a1.add(new Student(4,"ss2"));
		//serialization
		FileOutputStream fo=new FileOutputStream("abc.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(a1);
		oo.close();
		//deserialisation
		FileInputStream fi=new FileInputStream("abc.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		ArrayList ss=(ArrayList) oi.readObject();
		for(Object e:ss)
		{
			if(e instanceof Employee)
			{
			System.out.println(e.empid+" "+e.empname);
			if(e instanceof Student)
			{
			System.out.println(e.stdid+" "+e.stdname);

		}
		}
		
		

	}

}
