package exercise23aug19;

import java.io.IOException;
import java.util.Scanner;

public class ThrowThrows1 {

	void m() throws IOException//Throws send a alert //method calling method
	{
		//whatever
	}
	public static void main(String[] args) {
		ThrowThrows1 tt = new ThrowThrows1();
		try {
			tt.m();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter you age");
		int age=scan.nextInt();
		if(age<18)
		{
			throw new ArithmeticException("You are not elgible to vote");
		}
		System.out.println("Thank you");
	}

}
