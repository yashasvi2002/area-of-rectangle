package exceptionThrowExample;

public class ThrowExample {

	private int score;
	
	
	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		try {
		if(score<0)
		{
			throw new Exception();
		}
			
		this.score = score;
		
		}
		catch(Exception e)
		{
			System.out.println("score should not less than 0");
		}
	}


	

}
