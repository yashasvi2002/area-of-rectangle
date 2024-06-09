package bankactivities;

public class Account {
	private String accname,emil;
	private int bal;
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public String getEmil() {
		return emil;
	}
	public void setEmil(String emil) {
		this.emil = emil;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [accname=" + accname + ", emil=" + emil + ", bal=" + bal + ", getAccname()=" + getAccname()
				+ ", getEmil()=" + getEmil() + ", getBal()=" + getBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
