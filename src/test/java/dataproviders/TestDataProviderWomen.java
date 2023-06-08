package dataproviders;

import org.example.Sex;
import org.testng.annotations.DataProvider;

public class TestDataProviderWomen {

    @DataProvider(name = "WomenDataProvider")
    public static Object[][] symbols() {
        return new Object[][]{{
                4, false},
                {60, true},
                {61, true}};
    }
}
