package exceptions;

public class MoodAnalyzer {
	
	private String message;
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyzeMood(String message) throws CustomException {
		this.message = message;
		return analyzeMood();
	}

	public String analyzeMood() throws CustomException {
		try{
			if(message.contains("SAD"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch (NullPointerException e) {
			throw new CustomException("Please enter a valid mood");
			
		}
	}
}
