package dataproviders;

import org.testng.annotations.DataProvider;

public class TestInitMen {
    @DataProvider(name = "InitMen")
    public static Object[][] symbols() {
        return new Object[][]{{
                "Alex", "Ovechko", 66, null, true}
        };
    }
}
