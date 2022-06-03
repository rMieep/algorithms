package string;

/**
 * Implementation of the Knuth–Morris–Pratt pattern matching algorithm
 */
public class KPM implements SubstringSearch {

    @Override
    public int searchSubstring(String text, String pattern) {
        if(text == null || pattern == null || pattern.length() > text.length()) {
            return -1;
        }

        int[] patternArray = generatePatternArray(pattern);
        int textIndex = 0;
        int patternIndex = 0;

        while(textIndex < text.length()) {
            if(text.charAt(textIndex) == pattern.charAt(patternIndex)) {
                textIndex++;
                patternIndex++;

                if(patternIndex == pattern.length()) {
                    return textIndex - patternIndex;
                }
            } else if(patternIndex > 0) {
                patternIndex = patternArray[patternIndex - 1];
            } else {
                textIndex++;
            }
        }

        return -1;
    }

    private int[] generatePatternArray(String pattern) {
        int[] patternArray = new int[pattern.length()];
        int leftIndex = 0;
        int rightIndex = 1;

        while(rightIndex < pattern.length()) {
            if(pattern.charAt(leftIndex) == pattern.charAt(rightIndex)) {
                leftIndex++;
                patternArray[rightIndex] = leftIndex;
                rightIndex++;
            } else if(leftIndex > 0) {
                leftIndex = patternArray[leftIndex - 1];
            } else {
                patternArray[rightIndex] = leftIndex;
                rightIndex++;
            }
        }

        return patternArray;
    }
}
