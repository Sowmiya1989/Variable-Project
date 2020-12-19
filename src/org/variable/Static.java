package org.variable;
//declare outide the method block and outide the constructor.
public class Static 
{
	public int a=20;//outside the constructor
	public Static() 
	{
		System.out.println("outside constructor :"+ a);
	}
	 int a1=100;//outside the method.
	private void print() 
	{
		// int b=30; but declare outside.
		System.out.println("method name is :" + a1);
		//System.out.println(b);
		
	}
	public static void main(String[] args) 
	{
		Instance i=new Instance();
		i.print();
		int c=10;
		System.out.println("main method :" + c);
		
		Instance i1=new Instance();
		// access specifier possible.
		//default values accepted.
		
		
	}
}
