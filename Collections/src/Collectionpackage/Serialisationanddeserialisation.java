package Collectionpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialisationanddeserialisation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(1,"s1"));
		a1.add(new Student(2,"s2"));
		a1.add(new Student(3,"s3"));
		a1.add(new Student(4,"s4"));
		FileOutputStream fos=new FileOutputStream("supraja.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.close();
		FileInputStream fis=new FileInputStream("supraja.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList<Student> a2=(ArrayList<Student>)ois.readObject();
		for(Student a3:a2) {
			System.out.println(a3.stdid+" "+a3.stdname);
		}
		
		

	}

}
