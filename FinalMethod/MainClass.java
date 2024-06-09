package FinalMethod;

import FinalMethod.FinalMethodEx.FinalClassExample;

public class MainClass  extends FinalClassExample{
		   public final void display() {
	        System.out.println("Overriding the final method.");
	    }

	    public static void main(String[] args) {
	      FinalMethodEx obj = new FinalMethodEx();
	        obj.display();
	    }
	}
}
