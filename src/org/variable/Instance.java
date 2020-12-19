package org.variable;
//declare outside the constructor but inside the class,and declare outside the method block too.
public class Instance
{
	public static int a;//outside the constructor
	public static int d=60;
public Instance() 
{
	System.out.println("outside constructor :"+ a);
	System.out.println(d);
}
static int a1=100;//outside the method.
public void print() 
{
	// int b=30;
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
