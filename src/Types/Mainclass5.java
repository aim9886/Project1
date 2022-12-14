package Types;
interface Audi
{//when we dont know 100% implementation we should go for interface.
	void wheels();
	void breaks();
	void engine();//Abstraction program.
}
class AudiA4 implements Audi
{
	public void wheels()
	{
		System.out.println("Super wheels");
	}
	public void breaks()
	{
		System.out.println("Super breaks");
	}
	public void engine()
	{
		System.out.println("500CC engine");
}
}
public class Mainclass5 
{
	public static void main(String[]args)
	{
		AudiA4 a1=new AudiA4();
		a1.wheels();
		a1.breaks();
		a1.engine();
	}
}
