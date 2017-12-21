package yyy;



public class Test13 {
	
	{
		System.out.println("instance");
	}
	{
		System.out.println("instance 2");
	}
	Test13()
	{
		this(10);
		System.out.println("consstructor");
	}
	
	Test13(int a)
	{
		System.out.println("param");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test13 t = new Test13();
		Test13 t1 = new Test13();
	}

}

