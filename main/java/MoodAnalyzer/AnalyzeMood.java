package MoodAnalyzer;

public class AnalyzeMood {
	private String msg;
	
	public AnalyzeMood(String msg) {   //refactored
		this.msg = msg;
	}
	public String analyseMood () {
		if(msg.contains("happy")) { 	//uc1
			return "happy";
		}
		else if(msg.contains("sad")) { //tc1
			return "sad";
		}
		else {							//tc2
			return "happy";
		}
	}

}
