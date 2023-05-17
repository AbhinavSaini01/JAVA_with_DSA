package ExceptionHandling;

public class UsingTryCatch {
	public static void main(String[] args)
	{
		int num1=8;
		int num2=0;
		int result=0;
		
		try
		{
			result=num1/num2;
			System.out.println("in try block");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong" +e);
		}
		
		System.out.println(result);
		System.out.println("bye");
		
	}

}
