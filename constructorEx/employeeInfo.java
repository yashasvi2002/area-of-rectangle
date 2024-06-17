package constructorEx;

public class employeeInfo {
	String name, email;
	int mobileNo;
	
	public employeeInfo(){
		name = "defaultName";
		email = "defaultEmail";
		mobileNo = 000;
	}
	
	//Parameterise constructor
	public employeeInfo(String name, String email, int mobileNo) {
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "employeePersonalInfo [name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
}
