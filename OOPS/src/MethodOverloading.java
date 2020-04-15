

public class MethodOverloading  extends methodparent{
	 double m1()
	{
		
		return 20000000000.888;
	}
	float m1(int a, float b)
	{
		System.out.println(a+b);
		return 20.5f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 methodparent m1=new MethodOverloading();
		double d=m1.m1();
		System.out.println(d);
		
	

	}

}
