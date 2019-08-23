package exercise23aug19;
final class A//final class is allowed but not inherits
{
	final int i =9; 
	static double pi=4.4;
	static void m()
	{
		//System.out.println(i);//not allowed in instance variables
		System.out.println(pi);//only allowed static instance variables
	}
	final void c()//it allows a final method
	{
		
	}
}
/*class B extends A//it not allowed in extends in final class A
{
	final void c()//it not allowed method override
	{
		
	}
}*/
public class Final1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
