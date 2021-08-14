package exceptions;

//import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.Test;

public class MoodNull {
	
	@Test
	public void giveNullMood_shouldReturnHappy() {
		MoodAnalyzer moodAnanyzer = new MoodAnalyzer(null);
		String mood = moodAnanyzer.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
