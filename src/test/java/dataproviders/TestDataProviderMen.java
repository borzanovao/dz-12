package dataproviders;

import org.example.Sex;
import org.testng.annotations.DataProvider;

public class TestDataProviderMen {

        @DataProvider(name = "MenDataProvider")
    public static Object[][] symbols() {
        return new Object[][]{{
                10, false},
                {65, true},
                {99, true}};
    }
}
