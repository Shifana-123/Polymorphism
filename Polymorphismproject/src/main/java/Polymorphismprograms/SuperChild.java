package Polymorphismprograms;

public class SuperChild extends SuperKeyword {
	int a=30;
	public void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
public static void main(String args[]) {
	SuperChild obj=new SuperChild();
	obj.show();
	
}
}
