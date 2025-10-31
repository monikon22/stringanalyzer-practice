package net.monikon.stringanalyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringAnalyzerTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(StringAnalyzer.isPalindrome("Level"));
        assertFalse(StringAnalyzer.isPalindrome("Hello"));
    }
    @Test
    public void testCountVowels() {
        assertEquals(3, StringAnalyzer.countVowels("Example"));
    }
    @Test
    public void testContainsDigits() {
        assertTrue(StringAnalyzer.containsDigits("abc123"));
    }
}
