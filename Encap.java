package accessSpecifier;

import exercise23aug19.NewClass;

public class Encap extends NewClass {

	public static void main(String[] args) {
		NewClass nc=new NewClass();
		nc.a();//only comes access specifier of public
		Encap e = new Encap();
		e.b();//only visible in child class not parent class 
		System.out.println();
		
	}

}
