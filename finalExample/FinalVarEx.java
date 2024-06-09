package finalExample;

public class FinalVarEx {
	
		  final int x = 10;

		  public static void main(String[] args) {
			  FinalVarEx myObj = new FinalVarEx();
		  //  myObj.x = 25;  will generate an error
		    System.out.println(myObj.x);
		  }
		
}
