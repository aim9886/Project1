package Types;

public class threads 
{
	public static void main(String[]args)throws InterruptedException
	{
		for(int i=1; i<=10; i++)//Thread topic.
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
