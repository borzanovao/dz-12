package people;


import dataproviders.TestDataProvider;
import org.example.Man;
import org.example.Sex;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FamilyTest {
    private Man men1;
    private Woman women1;

    @BeforeTest
    public void creatingFamily() {
        men1 = new Man("Alex", "Ovechko", 66, null);

        women1 = new Woman("Masha", "Ivanova", 60, null);
    }

    @Test(dataProvider = "familyDataProvider", dataProviderClass = TestDataProvider.class)
    public void testRetired(Sex sex, Integer age, Boolean isRetired) {
        if (sex == Sex.MALE) {
            men1.setAge(age);
            Boolean isRetiredActual = men1.isRetired();
            Boolean isRetiredExpected = isRetired;
            Assert.assertEquals(isRetiredActual, isRetiredExpected);
        } else {
            women1.setAge(age);
            Boolean isRetiredActual = women1.isRetired();
            Boolean isRetiredExpected = isRetired;
            Assert.assertEquals(isRetiredActual, isRetiredExpected);
        }
    }
}

