package singleInheritanceEx;

public class demo1 {

	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Parent classs [amount="+amount+"]";
	}
	
	
	
}
