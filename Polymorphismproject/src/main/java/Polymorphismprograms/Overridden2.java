package Polymorphismprograms;

public class Overridden2 extends Overriding{
public void add(int a,int b)
{
int c=a-b;
System.out.println(c);
}
public static void main(String args[]) {
Overridden2 obj=new Overridden2();
obj.add(10,15);
obj.add(20,5);
}
}
