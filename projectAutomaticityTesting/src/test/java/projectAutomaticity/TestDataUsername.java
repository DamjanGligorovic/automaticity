package projectAutomaticity;

import java.util.Random;
import org.testng.annotations.DataProvider;

public class TestDataUsername {

    @DataProvider(name = "correctUsername")
    public Object[][] correctUsernameInputs() {
        return new Object[][] {
            {"J Q", generateRandomEmail()},
            {"Њ", generateRandomEmail()},
            {"Ninoslav Miona Rina Markic", generateRandomEmail()},
            {"@(#*$&#*@(!", generateRandomEmail()},
            {"RITPWQO", generateRandomEmail()},
            {"oqpwopqp", generateRandomEmail()},
            {" uueruoeeoq", generateRandomEmail()},
            {"Gioeore ", generateRandomEmail()},
            {"llddfgdgjgkj", generateRandomEmail()}
        };
    }

    private static String generateRandomEmail() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder email = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            email.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }

        email.append(random.nextInt(1000));  // Add random digits
        email.append("@testmail.com");  // Use a test domain

        return email.toString();
    }
}


