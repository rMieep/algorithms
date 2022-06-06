package string;

public class RabinKarpSubstringMatching implements SubstringSearch {

    private final int R = 256;
    @Override
    public int searchSubstring(String text, String pattern) {
        if(text == null || pattern == null || pattern.length() > text.length()) {
            return -1;
        }

        int n = text.length();
        int m = pattern.length();
        int q = 113;
        long patternHash = calcHash(pattern, q);
        long textHash = calcHash(text.substring(0, m), q);
        long rm = 1;

        for (int i = 1; i <= m-1; i++) {
            rm = (R * rm) % q;
        }

        if(patternHash == textHash && pattern.equals(text.substring(0, m))) {
            return 0;
        }

        for(int i = 1; i <= n - m; i++) {
            textHash = (textHash + q - rm * text.charAt(i - 1) % q) % q;
            textHash = (textHash * R + text.charAt(i + m - 1)) % q;

            if(patternHash == textHash && pattern.equals(text.substring(i, i + m))) {
                return i;
            }
        }

        return -1;
    }

    private long calcHash(String s, int q) {
        long hash = 0;
        for (int j = 0; j < s.length(); j++) {
            hash = (R * hash + s.charAt(j)) % q;
        }
        return hash;
    }
}
