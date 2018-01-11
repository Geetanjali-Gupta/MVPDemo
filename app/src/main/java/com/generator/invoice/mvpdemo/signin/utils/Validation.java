package com.generator.invoice.mvpdemo.signin.utils;

/**
 * Created by Geetanjali on 11/01/18.
 */

public final class Validation {
    private final static String EMAIL_PATTERN = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    private final static int PASSWORD_LENGTH = 6;

    /**
     * Used to check is provided EmailId is empty
     *
     * @param email entered email Id
     * @return true if EmailId is Empty
     */
    public static boolean isEmailEmpty(final String email) {
        return email.isEmpty();
    }

    /**
     * Used to check is provided EmailId is valid
     *
     * @param email entered email Id
     * @return true if EmailId is Valid
     */
    public static boolean isValidEmail(final String email) {
        return email.matches(EMAIL_PATTERN);
    }

    /**
     * Used to check is provided Password is empty
     *
     * @param password entered Password
     * @return true if Password is Empty
     */
    public static boolean isPasswordEmpty(final String password) {
        return password.isEmpty();
    }

    /**
     * Used to check is provided Password is valid
     *
     * @param password entered Password
     * @return true if Password is Valid
     */
    public static boolean isPasswordValid(final String password) {
        return password.length() >= PASSWORD_LENGTH;
    }

}
