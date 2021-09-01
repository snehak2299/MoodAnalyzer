package MoodAnalyzer;

public class AnalyzeMood {
	public String analyseMood (String msg) {
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
