package exercise23aug19;

public class NewClass {
public void a()//public method - open to all
{
	
}
protected void b()//protected method - within a package + across the package in child class
//if you want to class any other class import, parent one package and child one package
//within the package + visible to child class across the package
{
	
}
void c()//default method - only within the package
{
	
}
private void d()//private method - only within the class
{
	
}
public static void main(String [] args)
{
	new NewClass().d();//red square is private
	System.out.println();
}
}
