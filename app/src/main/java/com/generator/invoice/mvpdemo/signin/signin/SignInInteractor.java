package com.generator.invoice.mvpdemo.signin.signin;

/**
 * Created by Geetanjali on 11/01/18.
 */

public interface SignInInteractor {
    interface OnSuccessfullyValidatedListener {
        void onSuccess();
    }

    void validate(String username, String password, OnSuccessfullyValidatedListener listener);
}
