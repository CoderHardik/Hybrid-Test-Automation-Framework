package test;

import java.util.UUID;

/**
 * Utility methods for common automation tasks.
 */
public class ReusableMethod {

    /**
     * Generates a unique email for registration tests.
     */
    public static String getRandomEmail() {
        return "testuser_" + UUID.randomUUID().toString().substring(0, 8) + "@example.com";
    }
}
