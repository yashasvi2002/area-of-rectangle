package demo_2Inheritance;

public class baseClass {
	private int amt;

	public void intro()
	{
		System.out.println("I am Super Base Class");
	}
	
	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "baseClass [amt=" + amt + "]";
	}
	
}
