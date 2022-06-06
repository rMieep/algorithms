package string;

public class RabinKarpTests extends SubstringSearchTests {
    @Override
    protected SubstringSearch createInstance() {
        return new RabinKarpSubstringMatching();
    }
}
