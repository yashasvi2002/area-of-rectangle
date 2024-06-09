package demo_2Inheritance;

public class childClass extends baseClass{

	public static void main(String[] args) {
		
		baseClass b=new baseClass();
		b.intro();
		b.setAmt(12000);
		
		System.out.println(b);
	}

}
