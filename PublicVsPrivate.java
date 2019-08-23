package exercise23aug19;
class Pu
{
	private int a=3;
	public int b=4;
}
public class PublicVsPrivate {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.print(i);//skip the current iteration goto the next iteration
		}
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;//stops the loop execution
			}
			System.out.print(i);
		}
		Pu pub=new Pu();
		//privte can't access in this class
	}

}
