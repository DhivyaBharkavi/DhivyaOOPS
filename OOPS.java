package exercise23aug19;

class Parent
{
	int a=2;
	Parent(int a)
	{
		this.a=a;
	//this.a first assign instance variable and second a is local variable	
	}
	void add()
	{
		System.out.println();
	}
}//super can access variable,methods and constructors of parent class from child class
//this can access variables, methods and constructors of own class from its own class
class Child extends Parent
{
	Child(int a) {
		super(a);
		
	}
	int a=5;
	void add()
	{
		int a=3;
		System.out.println(a);////access local
		System.out.println(this.a);//access instance of own class and this.object vacha child class
		System.out.println(super.a);//access instance of super class and super.class vacha parent class
		//super only work in parent and child class
		super.add();//super class r parent class r object class
		this.add();//child class r own class
		//super access parent class and this access child class 
	}
}
public class OOPS {

	public static void main(String[] args) {
	Child c = new Child(1);
	c.add();
	//this used own class but this is used in main class in instance object
	//super not used in main class because main class has not parent class 
	}

}
