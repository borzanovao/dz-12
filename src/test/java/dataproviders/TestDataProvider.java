package dataproviders;

import org.example.Sex;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "familyDataProvider")
    public static Object[][] symbols() {
        return new Object[][]{{
                Sex.MALE, 10, false},
                {Sex.MALE, 65, true},
                {Sex.MALE, 99, true},
                {Sex.FEMALE, 4, false},
                {Sex.FEMALE, 60, true},
                {Sex.FEMALE, 61, true}};
    }

}
