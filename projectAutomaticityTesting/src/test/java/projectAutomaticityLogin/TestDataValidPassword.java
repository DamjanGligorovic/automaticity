package projectAutomaticityLogin;

import org.testng.annotations.DataProvider;
import java.util.Random;

public class TestDataValidPassword {
    
    @DataProvider(name = "correctPassword1")
    public Object[][] correctPasswordInputs() {
        return new Object[][] {
            {"Felina10@", generateRandomEmail()},
            {"G132lender1@", generateRandomEmail()},
            {"$*%$gld##$1", generateRandomEmail()},
            {"FINLAND2024@", generateRandomEmail()},
            {"rtiylr98!", generateRandomEmail()},
        };
    }

    private String generateRandomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder email = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            email.append(characters.charAt(random.nextInt(characters.length())));
        }

        email.append("@test.com");
        return email.toString();
    }
}