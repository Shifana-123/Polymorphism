package Polymorphismprograms;

public class Overloading {
public void add()
{
	int a=40;
	int b=30;
	int c=a+b;
	System.out.println(c);
}
public void add(int a,int b)
{
	int c=a-b;
	System.out.println(c);
	}
public static void main(String args[]){
	Overloading obj= new Overloading();
	obj.add();
	obj.add(3,2);
	
	
}
}
