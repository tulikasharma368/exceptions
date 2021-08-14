package exceptions;

public class MoodAnalyzer {
	
	private String message;
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyzeMood(String message) {
		this.message = message;
		return analyzeMood();
	}

	public String analyzeMood() {
		try{
			if(message.contains("SAD"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}
