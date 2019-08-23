package exercise23aug19;
class Parent1
{
	int accountNo=10;
	double roi=5.5;
	public Parent1(int accountNo, double roi) {
		super();
		this.accountNo = accountNo;
		this.roi = roi;
	}
}
class Child1 extends Parent1
{
	double roi=7.5;//it overriding the parent instance variable
	String panCard="rose234";
	public Child1(int accountNo, double roi, double roi2, String panCard) {
		super(accountNo, roi);//in child super value is passed and calling super class constructor
		roi = roi2;
		this.panCard = panCard;
	}
	void display()
	{
		//System.out.println(roi);
	}
}
class C
{
	int a,b;
	C(int a)
	{
		this(4,4);
		this.a=a;
		System.out.println("1 para");
	}
	C(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("2 para");
	}
}
public class OOPS1 {
	//child classs have parent only used super class not used in main  
//parent class constructor must because child class only access by super class
	//no object creation use this method is used it is current instance
	public static void main(String[] args) {
		Parent1 p =new Parent1(432,6.67);
		Child1 c1=new Child1(121,4.5,3.3,"re45");
		c1.display();
		System.out.println();
		System.out.println(c1.roi);
		C c= new C(10);
		
	}

}
