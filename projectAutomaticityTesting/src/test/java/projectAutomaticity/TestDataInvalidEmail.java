package projectAutomaticity;

import java.util.Random;

import org.testng.annotations.DataProvider;

public class TestDataInvalidEmail {
    @DataProvider(name = "incorrectEmail")
    public Object[][] correctEmailInputs() {
        return new Object[][] {
            {"@hotmail.com", generateRandomUsername()},
            {"damjangligorovic.com", generateRandomUsername()},
            {"milanmarkovic@", generateRandomUsername()},
             
        };
    }

    private static String generateRandomUsername() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder username = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            username.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }

        username.append(random.nextInt(1000));  // Add random digits
        username.append("UR$43fdkj42");  // Use a test domain

        return username.toString();
    }

}
