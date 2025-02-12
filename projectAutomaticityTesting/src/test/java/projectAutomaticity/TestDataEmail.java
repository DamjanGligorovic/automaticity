package projectAutomaticity;

import java.util.Random;

import org.testng.annotations.DataProvider;

public class TestDataEmail {

    @DataProvider(name = "correctEmail")
    public Object[][] correctEmailInputs() {
        return new Object[][] {
            {"milovan@asdhecompany.hotmail.com", generateRandomUsername()},
            {"milica4344@gmail.com", generateRandomUsername()},
            {"gregoriana$*#($**@hotmail.com", generateRandomUsername()},
            
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