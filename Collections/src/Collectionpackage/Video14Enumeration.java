package Collectionpackage;

import java.util.Enumeration;
import java.util.Vector;

public class Video14Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector a=new Vector();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		Enumeration<Integer> e=a.elements();
		while(e.hasMoreElements())
		{
			int s=e.nextElement();
			System.out.println(s);
		}

	}

}
