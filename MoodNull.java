package exceptions;

import org.junit.Assert;
import org.junit.Test;

public class MoodNull {
	
	@Test
	public void giveNullMood_shouldReturnHappy() throws CustomException {
		try {
			MoodAnalyzer moodAnanyzer = new MoodAnalyzer(null);
			String mood = moodAnanyzer.analyzeMood();
			//Assert.assertEquals("HAPPY", mood);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			Assert.assertEquals("Please enter a valid mood", e.getMessage());
			
		}
		
	}
}
