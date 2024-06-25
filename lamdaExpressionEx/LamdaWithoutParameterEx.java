package lamdaExpressionEx;

public class LamdaWithoutParameterEx
{
	interface IStatement
	{
		String show();
	}
	public static void main(String[] args)
	{
		IStatement s=() -> { return  "Hello world";};
		System.out.println(s.show());
	
	}
	
}
