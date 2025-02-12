package projectAutomaticityLogin;
import java.util.Random;

import org.testng.annotations.DataProvider;

public class TestDataValidEmailLogin {

    @DataProvider(name = "correctEmail1")
    public Object[][] correctEmailInputs() {
        return new Object[][] {
            {"dgligorovic9@gmail.com", },
            {"john.richardson@yahoo.com"},
            {"sarah12_1990@yahoo.com"},
         
        };
    }
}

   
