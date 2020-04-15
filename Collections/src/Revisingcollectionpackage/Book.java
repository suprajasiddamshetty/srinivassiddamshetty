package Revisingcollectionpackage;

public class Book implements Comparable {
	int id;
	String name;
	int quantity;
	Book(int name,String id,int quantity)
	{
		this.name=id;
		this.id=name;
		this.quantity=quantity;
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Book b=(Book)o;
		return name.compareTo(b.name);
	}


}
