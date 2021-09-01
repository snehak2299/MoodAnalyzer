package MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
	public void givenMood_whenhappy_shouldReturnHappy() {
		AnalyzeMood moodAnalizer =new AnalyzeMood();
		String mood=moodAnalizer.analyseMood("I am in happy mood");
		assertEquals("happy",mood);
	}
	@Test
	public void givenMood_whensad_shouldReturnSad() {
		AnalyzeMood moodAnalizer =new AnalyzeMood();
		String mood=moodAnalizer.analyseMood("I am in sad mood");
		assertEquals("sad",mood);
	}
	@Test
	public void givenMood_whenAnyMood_shouldReturnHappy() {
		AnalyzeMood moodAnalizer =new AnalyzeMood();
		String mood=moodAnalizer.analyseMood("I am in any mood");
		assertEquals("happy",mood);
	}

	
}
