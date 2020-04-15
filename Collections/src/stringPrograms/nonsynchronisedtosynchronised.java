package stringPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class nonsynchronisedtosynchronised {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<String>();
		al.add("s1");
		al.add("s2");
		al.add("s3");
		ArrayList<String>l1=(ArrayList)al.clone();
//		List<String>l=Collections.synchronizedList(al);
	System.out.println(l1);
		
//		FileInputStream fi=new FileInputStream("abc.properties");
//		Properties p=new Properties();
//		p.load(fi);
//		String username=p.getProperty("username");
//		String password=p.getProperty("password");
//		System.out.println(username+" "+password);
		FileOutputStream fi=new FileOutputStream("abc.txt");
		ObjectOutputStream oi=new ObjectOutputStream(fi);
		oi.writeObject(al);
		oi.close();
		fi.close();
		FileInputStream fii=new FileInputStream("abc.txt");
		ObjectInputStream oii=new ObjectInputStream(fii);
		ArrayList<String> a1=(ArrayList<String>)oii.readObject();
		fii.close();
		oii.close();
		for(String e:a1)
		{
			System.out.println(e);
		}
		
//		FileOutputStream outputStream = new FileOutputStream("abc.txt");
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//		objectOutputStream.writeObject(al);
//		outputStream.close();
//		objectOutputStream.close();
//		System.out.println("serialization process completed......");
//		//Deserialization process
//		FileInputStream inputStream = new FileInputStream("abc.txt");
//		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//		ArrayList<String> arraylist = (ArrayList<String>)objectInputStream.readObject();
//		outputStream.close();
//		objectInputStream.close();
//		System.out.println("Deserialization process completed......");
//		for(String e:arraylist)
//		{ System.out.println(e);
//		}
//		}
//		
		
		
		

	}
	

}
