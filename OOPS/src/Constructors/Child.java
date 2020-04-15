package Constructors;

public class Child extends Parent {
	int a=20;
	
	    void	Parent1()
	{
	    	super.Parent1();
	    	this.Parent1();
	    
	    
		System.out.println("Child class Constructor");
		
		
	}
//	Child(int a)
//	{
//		this();
//		System.out.println(a);
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new  Child();
		p.Parent1();

	}

}
