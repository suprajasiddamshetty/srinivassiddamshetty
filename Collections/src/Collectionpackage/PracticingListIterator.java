package Collectionpackage;

import java.util.ListIterator;
import java.util.Vector;

public class PracticingListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<ProductClass> v1=new Vector<ProductClass>();
		v1.add(new ProductClass(1,"p1",1000));
		v1.add(new ProductClass(2,"p2",2000));
		v1.add(new ProductClass(3,"p3",3000));
		v1.add(new ProductClass(4,"p4",4000));
		v1.add(new ProductClass(5,"p5",5000));
		ListIterator<ProductClass> li1=v1.listIterator();
		li1.add(new ProductClass(6,"p6",6000));
		while(li1.hasNext())
		{
			ProductClass p1=li1.next();
			if(p1.cost==5000)
			{
				li1.remove();
				
			}
			if(p1.pdname.equals("p4"))
			{
				li1.set(new ProductClass(4,"p8",8000));
				
			}
			
		}
		for(ProductClass pp:v1)
		{
			System.out.println(pp.pid+" "+pp.pdname+" "+pp.cost);
		}
		

	}

}
