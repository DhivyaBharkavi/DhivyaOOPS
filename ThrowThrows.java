package exercise23aug19;

import java.io.IOException;
import java.util.Scanner;
class Ex extends Exception
{
	public Ex(String string)
	{
		super(string);//it invoke to parent class it is exception
	}
}
public class ThrowThrows {

	
	public static void main(String[] args) throws Ex {
		ThrowThrows tt = new ThrowThrows();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter you age");
		int age=scan.nextInt();
		if(age<18)//customized exception
		{//When you throw exception  to use user defined exception
			//throw new ArithmeticException("You are not elgible to vote");
			throw new Ex("You are not elgible to vote");//not to inform parent class like exception
		}
		System.out.println("Thank you");
	}

}
