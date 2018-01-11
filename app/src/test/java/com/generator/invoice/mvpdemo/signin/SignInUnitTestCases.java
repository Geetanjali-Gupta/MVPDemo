package com.generator.invoice.mvpdemo.signin;

import com.generator.invoice.mvpdemo.signin.utils.Validation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Geetanjali on 11/01/18.
 */
public class SignInUnitTestCases {
    @Test
    public void emptyEmail_returnsTrue() {
        Assert.assertEquals(true, Validation.isEmailEmpty(""));
    }

    @Test
    public void notEmptyEmail_returnsFalse() {
        Assert.assertEquals(false, Validation.isEmailEmpty("a"));
    }

    @Test
    public void validEmail_returnsTrue() {
        Assert.assertEquals(true, Validation.isValidEmail("abc@gmail.com"));
    }

    @Test
    public void inValidEmail_returnsFalse() {
        Assert.assertEquals(false, Validation.isValidEmail("abc@"));
    }

    @Test
    public void emptyPassword_returnsTrue() {
        Assert.assertEquals(true, Validation.isPasswordEmpty(""));
    }

    @Test
    public void notEmptyPassword_returnsFalse() {
        Assert.assertEquals(false, Validation.isPasswordEmpty("a"));
    }

    @Test
    public void validPassword_returnsTrue() {
        Assert.assertEquals(true, Validation.isPasswordValid("qwerty"));
    }

    @Test
    public void inValidPassword_returnsFalse() {
        Assert.assertEquals(false, Validation.isPasswordValid("abc"));
    }
}
