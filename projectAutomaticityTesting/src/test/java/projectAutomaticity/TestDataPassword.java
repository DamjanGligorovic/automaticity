package projectAutomaticity;

import java.util.Random;

import org.testng.annotations.DataProvider;

public class TestDataPassword {
    @DataProvider(name = "correctPassword")
    public Object[][] correctPasswordnputs() {
        return new Object[][] {
            {"Felina", generateRandomUsername()},
            {"G132lender", generateRandomUsername()},
            {"$*%$gld##$", generateRandomUsername()},
            {"FINLAND", generateRandomUsername()},
            {"rtiylr", generateRandomUsername()},
             
        };
    }

    private static String generateRandomUsername() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder username = new StringBuilder();
        Random random = new Random();

        // Generate random letters for the username
        for (int i = 0; i < 8; i++) {
            username.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }

        // Add random digits to the username
        username.append(random.nextInt(1000));  // Random digits for uniqueness

        return username.toString();
    }
}

