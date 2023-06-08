package dataproviders;

import org.testng.annotations.DataProvider;

public class TestInitWomen {
    @DataProvider(name = "InitWomen")
    public static Object[][] symbols() {
        return new Object[][]{{
                "Masha", "Ivanova", 60, null, true}
        };
    }
}
