package projectAutomaticityLogin;

import org.testng.annotations.DataProvider;

public class TestDataInvalidEmail1 {
    @DataProvider(name = "incorrectEmail")
    public Object[][] correctEmailInputs() {
        return new Object[][] {
            {"@yahoo.com", },
            {"milicagavrlilovic.com",},
            {"jovanjovanovic@",},
             
        };
    }
}
