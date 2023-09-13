package Polymorphismprograms;

public class SuperMethod2 extends SuperMethod {
	public void show()
	{
		System.out.println("Hello");
	}
public void display()
{
	super.show();
	show();
	
}
public static void main(String args[])
{
	SuperMethod2 obj=new SuperMethod2();
	obj.display();
}
}
