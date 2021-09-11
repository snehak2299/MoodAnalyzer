package MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	
	@Test
	public void givenMood_whennull_shouldReturnHappy() {  
		AnalyzeMood moodAnalizer =new AnalyzeMood(null,ExceptionType.NOT_NULL);
		String mood;
		try {
			mood = moodAnalizer.analyseMood();
		} catch (Exception e) {
			assertEquals("mood is null",e.getMessage());
			e.printStackTrace();
		}
		
	}	
	@Test
	public void givenMood_whenEmpty_shouldReturnempty() { 
		AnalyzeMood moodAnalizer =new AnalyzeMood("",ExceptionType.NOT_EMPTY);
		String mood;
		try {
			mood = moodAnalizer.analyseMood();
		} catch (Exception e) {
			assertEquals("mood is null",e.getMessage());
			e.printStackTrace();
		}
		
	}	
	
}
