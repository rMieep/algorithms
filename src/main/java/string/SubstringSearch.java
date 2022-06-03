package string;

public interface SubstringSearch {

    /**
     * Searches for a given pattern in a given text and return the first index of the occurrence of the pattern
     * @param text The text searched for the pattern
     * @param pattern The pattern to be found in the text
     * @return Index of first occurence of pattern
     */
    int searchSubstring(String text, String pattern);
}
