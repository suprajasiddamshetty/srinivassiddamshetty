package Collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Video15Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		ListIterator<Integer> l=a.listIterator();
		while(l.hasNext())
		{
			int h=l.next();
			System.out.println(h);
		}
		while(l.hasPrevious())
		{
			int h=l.previous();
			System.out.println(h);
		}


	}

}
