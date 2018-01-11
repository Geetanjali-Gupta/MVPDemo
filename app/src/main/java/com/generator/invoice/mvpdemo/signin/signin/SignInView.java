package com.generator.invoice.mvpdemo.signin.signin;

/**
 * Created by Geetanjali on 11/01/18.
 */

interface SignInView {

    /**
     * Used to show Error When Email Field is Empty
     *
     * @param errorMessageId message Id
     */
    void showErrorEmailEmpty(final int errorMessageId);

    /**
     * Used to show Error When Email is Invalid
     *
     * @param errorMessageId message Id
     */
    void showErrorInvalidEmail(final int errorMessageId);

    /**
     * Used to show Error When Password Field is Empty
     *
     * @param errorMessageId message Id
     */
    void showErrorPasswordEmpty(final int errorMessageId);

    /**
     * Used to show Error When Password is Invalid
     *
     * @param errorMessageId message Id
     */
    void showErrorInvalidPassword(final int errorMessageId);

    /**
     * Used to show Message When All Fields has valid data
     *
     * @param messageId message Id
     */
    void showSuccessFullyValidated(final int messageId);
}
