class Area{
    private int length,breadth;
    

    public void setDim(int length,int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
   
  public int getDim()
  {
      return length*breadth;
  }
}

public class Main {

    public static void main(String[] args) {
	int area;
        Area a1= new Area(); 
        a1.setDim(100,200);
        area=a1.getDim();
       
        System.out.println("Area of rectangle:"+area);

    }
}
/*
Area of rectangle:20000

=== Code Execution Successful ===
*/

output:---

20000

=== Code Execution Successful ===
