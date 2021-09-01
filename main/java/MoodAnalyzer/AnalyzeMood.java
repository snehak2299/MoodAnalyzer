package MoodAnalyzer;

public class AnalyzeMood {
	private String msg;
	
	public AnalyzeMood(String msg) {   //refactored
		this.msg = msg;
	}
	public String analyseMood () throws Exception {
		try {
			if(msg.contains("happy")) { 	//uc1
				return "happy";
			}
			else if(msg.contains("sad")) { //tc1
				return "sad";
			}
			else if(msg.length()<=0) {
				throw new Exception("Mood cannot be empty");
				}
			else {							//tc2
				return "happy";
			}
		}
		catch(NullPointerException exception) { //exception
			return "Happy";
		}
	}

}
