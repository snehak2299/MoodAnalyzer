package MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
	public void givenMood_whenhappy_shouldReturnHappy() {
		AnalyzeMood moodAnalizer =new AnalyzeMood("I am in happy mood");
		String mood = null;
		try {
			mood = moodAnalizer.analyseMood();
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals("happy",e.getMessage());
		}
		
	}
	@Test
	public void givenMood_whensad_shouldReturnSad() {  //repeat 1.1
		AnalyzeMood moodAnalizer =new AnalyzeMood("I am in sad mood");
		String mood;
		try {
			mood = moodAnalizer.analyseMood();
		} catch (Exception e) {
			assertEquals("sad",e.getMessage());
			e.printStackTrace();
		}
	}
	@Test
	public void givenMood_whenAnyMood_shouldReturnHappy() {  //repeat 1.2
		AnalyzeMood moodAnalizer =new AnalyzeMood("I am in any mood");
		String mood;
		try {
			mood = moodAnalizer.analyseMood();
		} catch (Exception e) {
			assertEquals("happy",e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test
	public void givenMood_whennull_shouldReturnHappy() {  //repeat 2.1
		AnalyzeMood moodAnalizer =new AnalyzeMood(null);
		String mood;
		try {
			mood = moodAnalizer.analyseMood();
		} catch (Exception e) {
			assertEquals("mood is null",e.getMessage());
			e.printStackTrace();
		}
		
	}	
	
}
