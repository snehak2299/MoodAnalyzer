package MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
	public void givenMood_whenhappy_shouldReturnHappy() {
		AnalyzeMood moodAnalizer =new AnalyzeMood("I am in happy mood");
		String mood=moodAnalizer.analyseMood();
		assertEquals("happy",mood);
	}
	@Test
	public void givenMood_whensad_shouldReturnSad() {  //repeat 1.1
		AnalyzeMood moodAnalizer =new AnalyzeMood("I am in sad mood");
		String mood=moodAnalizer.analyseMood();
		assertEquals("sad",mood);
	}
	@Test
	public void givenMood_whenAnyMood_shouldReturnHappy() {  //repeat 1.2
		AnalyzeMood moodAnalizer =new AnalyzeMood("I am in any mood");
		String mood=moodAnalizer.analyseMood();
		assertEquals("happy",mood);
	}

	
}
