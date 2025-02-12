package projectAutomaticityLogin;

import org.testng.annotations.DataProvider;

public class TestDataInvalidPassword {
	@DataProvider(name = "incorrectPassword1")
    public Object[][] correctPasswordnputs() {
        return new Object[][] {
            {"Felina", },
            {"G132lender", },
            {"$*%$gld##$", },
            {"FINLAND", },
            {"rtiylr", },
             
        };
	}
}
