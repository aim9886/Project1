package Types;
class sample
{
	static int count=0;
	int a=10;
	static sample s1;
	private sample()
	{
		count++;
	}
	public static sample getInstance()
	{
		if(count<1)
		{
			s1=new sample();
		}
		return s1;
	}
	public static void setInstance(int x)
	{
		s1.a=x;
		}
}
public class Mainclass3 
{
	public static void main(String[]args)// Single-ton-design pattern.
	{
		sample s2=sample.getInstance();
		System.out.println(s2.a);
		sample s3=sample.getInstance();
		System.out.println(s3.a);
		sample.setInstance(80);
	}
}
