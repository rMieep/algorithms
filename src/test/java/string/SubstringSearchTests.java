package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public abstract class SubstringSearchTests {

    protected abstract SubstringSearch createInstance();

    @Test
    public void testSubstringSearchTest() {
        SubstringSearch algorithm = createInstance();
        List<String> texts = List.of("abcdabcdabce", "aaabc", "abcd", "abcd");
        List<String> patterns = List.of("abcdabce", "aabc", "abcde", "efgh");
        List<Integer> results = List.of(4, 1, -1, -1);

        for(int i = 0; i < texts.size(); i++) {
            Assertions.assertEquals(results.get(i), algorithm.searchSubstring(texts.get(i), patterns.get(i)));
        }
    }

    @Test
    public void testSubstringSearchTextNullTest() {
        SubstringSearch algorithm = createInstance();
        Assertions.assertEquals(-1, algorithm.searchSubstring(null, "a"));
    }

    @Test
    public void testSubstringSearchPatternNullTest() {
        SubstringSearch algorithm = createInstance();
        Assertions.assertEquals(-1, algorithm.searchSubstring("a", null));
    }
}
