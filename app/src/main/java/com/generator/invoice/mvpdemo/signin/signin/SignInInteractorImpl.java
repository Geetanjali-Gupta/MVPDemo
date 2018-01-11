package com.generator.invoice.mvpdemo.signin.signin;

import android.os.Handler;

/**
 * Created by Geetanjali on 11/01/18.
 */

class SignInInteractorImpl implements SignInInteractor {

    @Override
    public void validate(final String username, final String password, final OnSuccessfullyValidatedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onSuccess();
            }
        }, 1000);
    }
}
