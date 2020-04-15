
public   class AbstractChild extends Abstract {

	

	public static void m2()
	{
		System.out.println("child m2 method");
	};

	

	public static void main(String[] args) {
		Abstract obj=new AbstractChild();
		obj.m1();
		obj.m2();
		

	}

}
