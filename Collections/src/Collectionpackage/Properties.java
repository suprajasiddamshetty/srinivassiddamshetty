package Collectionpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Properties {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("abc.properties");
		Properties p=new Properties();
		System.out.println(p.getProperty("username"));
		
		

	}

}
