package Revisingcollectionpackage;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p=new PriorityQueue();
		p.add(new Book(1,"ss1",100));
		p.add(new Book(4,"ss4",400));
		
		p.add(new Book(5,"ss5",500));
		
		p.add(new Book(3,"ss3",300));
		Iterator i=p.iterator();
		while(i.hasNext())
		{
			Book b=(Book)i.next();
			System.out.println(b.id+" "+b.name+" "+b.quantity);
		}
		
		

	}

}
