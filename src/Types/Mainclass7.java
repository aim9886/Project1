package Types;
interface Nike
{
	void shoes();//Interface program.
}
interface Puma extends Nike
{
	void bags();
	void shoes();
}
class Aim implements Puma
{
	public void bags()
	{
		System.out.println("Jingilala bags");
	}
	public void shoes()
	{
		System.out.println("Jingilala shoes");
	}
}
public class Mainclass7 
{
	public static void main(String[]args)
	{
		Aim a1=new Aim();
		a1.bags();
		a1.shoes();
	}
}
