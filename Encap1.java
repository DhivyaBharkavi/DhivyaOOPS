package exercise23aug19;

public class Encap1 {

	public static void main(String[] args) {
		Encap e = new Encap();
		System.out.println(e.getA());//default value and read access
		e.setA(550);//write access
		System.out.println(e.getA());//set value
		NewClass nc=new NewClass();
		nc.a();//green circle is public
		nc.b();//yellow diamond is protected
		nc.c();//blue traingle is default
	}

}
