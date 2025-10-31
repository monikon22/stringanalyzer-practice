package net.monikon.stringanalyzer;

public class StringAnalyzer {

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    public static int countVowels(String text) {
        return text.replaceAll("(?i)[^aeiouy]", "").length();
    }

    public static boolean containsDigits(String text) {
        return text.matches(".*\\d.*");
    }

}