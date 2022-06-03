package string;

public class KPMTests extends SubstringSearchTests {
    @Override
    protected SubstringSearch createInstance() {
        return new KPM();
    }
}
