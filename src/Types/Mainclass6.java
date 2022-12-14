package Types;
abstract class Audi2
{//when we know partial implementation we should go for abstract class.
abstract void wheels();
abstract void breaks();
abstract void engine();
{
	System.out.println("Black colour");//Abstraction program.
}
}
class AudiA5 extends Audi2
{
public void wheels()
{
	System.out.println("Super wheels");
}
public void breaks()
{
	System.out.println("Sudden breaks");
}
public void engine()
{
	System.out.println("500CC engine");
}
}
public class Mainclass6 
{
	public static void main(String[]args)
	{
	AudiA5 a1=new AudiA5();
	a1.wheels();
	a1.breaks();
	a1.engine();
	}
}
