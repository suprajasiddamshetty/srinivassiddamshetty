package oopspckgs;

public class Child extends Parent {
	
//	int a=100;
//	int b=200;
////	void add(int a,int b)
////	{
////		System.out.println(a+b);
////		System.out.println(this.a+this.b);
////		System.out.println(super.a+super.b);
////		
////	}
//	void add()
//	{
//		
//		System.out.println("child  addition");
//	}
//	void add1()
//	{
//		super.add();
//		this.add();
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		Child c=new Child();
		System.out.println(p instanceof Child);
		System.out.println(c instanceof Parent);
		//System.out.println(p instanceof Child1);
		
				

	}

}
