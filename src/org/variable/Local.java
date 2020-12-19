package org.variable;
// declare inside the method block and inside the constructor.
public class Local
{
	public Local()
	{
	int a=100;//we have to initialize the variable.shouldnot give as int a;
	//No access specifier too
	System.out.println("The value of a in cons:" + a);
	}
	private void print() {
		int a=60;
		System.out.println("The method name is a:" + a);
	}
	
	

	public static void main(String[] args) 
	{
		Local l = new Local();
		l.print();
		
		int a=50;//no access specifier.
		System.out.println("The value of a in main method:" + a);
		
		Local l1=new Local();
		l1.print();
		 int b=30;
		 System.out.println(b);
		 // No default,initialize the variable.
		 //stores in stack memory.
		 //no access specifier.
		 
		
	}

}
