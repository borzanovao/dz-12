package people;


import dataproviders.TestDataProviderMen;
import dataproviders.TestDataProviderWomen;
import dataproviders.TestInitMen;
import dataproviders.TestInitWomen;
import org.example.Man;
import org.example.Person;
import org.example.Sex;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class isRetiredTest {
    private Man men1;
    private Woman women1;

    @Test (dependsOnMethods="testInitMen", dataProvider = "MenDataProvider", dataProviderClass = TestDataProviderMen.class)
    public void testRetiredMen(Integer age, Boolean isRetired) {
            men1.setAge(age);
            Boolean isRetiredActual = men1.isRetired();
            Boolean isRetiredExpected = isRetired;
            Assert.assertEquals(isRetiredActual, isRetiredExpected);

    }
    @Test(dependsOnMethods="testInitWoman", dataProvider = "WomenDataProvider", dataProviderClass = TestDataProviderWomen.class)
    public void testRetiredWomen(Integer age, Boolean isRetired) {
            women1.setAge(age);
            Boolean isRetiredActual = women1.isRetired();
            Boolean isRetiredExpected = isRetired;
            Assert.assertEquals(isRetiredActual, isRetiredExpected);
    }
    @Test(dataProvider = "InitMen", dataProviderClass = TestInitMen.class)
    public void testInitMen(String firstName, String lastName, Integer age, Person partner,Boolean isRetired) {
        men1 = new Man(firstName , lastName, age, partner);
        Boolean isRetiredActual = men1.isRetired();
        Boolean isRetiredExpected = isRetired;
        Assert.assertEquals(isRetiredActual, isRetiredExpected);
    }
    @Test(dataProvider = "InitWomen", dataProviderClass = TestInitWomen.class)
    public void testInitWoman(String firstName, String lastName, Integer age, Person partner, Boolean isRetired) {
        women1 = new Woman(firstName , lastName, age, partner);
        Boolean isRetiredActual = women1.isRetired();
        Boolean isRetiredExpected = isRetired;
        Assert.assertEquals(isRetiredActual, isRetiredExpected);
    }
}

