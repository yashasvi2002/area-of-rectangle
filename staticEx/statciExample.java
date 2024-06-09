package staticEx;

public class statciExample {

	private int salary;
	private static int cnt;
	
	
	//static function cannot override
	public static void showData()
	{
		
		cnt++;
		System.out.println(cnt);
	}
}
